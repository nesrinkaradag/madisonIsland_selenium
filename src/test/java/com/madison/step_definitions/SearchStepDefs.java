package com.madison.step_definitions;

import com.madison.pages.CartPage;
import com.madison.pages.ProductDetailPage;
import com.madison.pages.SearchResultsPage;
import com.madison.utilities.BrowserUtils;
import com.madison.utilities.ConfigurationReader;
import com.madison.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class SearchStepDefs {
    SearchResultsPage searchResultPage = new SearchResultsPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    CartPage cartPage= new CartPage();

    @Given("user should be on url")
    public void user_should_be_on_url() {
        Driver.get().navigate().to(ConfigurationReader.get("url"));
    }

    @Then("user should write {string} into search box")
    public void user_should_write_into_search_box(String string) {
        searchResultPage.searchbox.sendKeys(string);
    }

    @Then("user should click search button")
    public void user_should_click_search_button() {
        searchResultPage.searchButton.click();
    }

    @Then("user should locate {string} in list and click")
    public void user_should_locate_in_list_and_click(String string) {
        Driver.get().findElement(By.xpath("//*[text()='"+ string+"']")).click();
    }

    @Given("user should choose {string} and {string} and add it to cart")
    public void user_should_choose_and_and_add_it_to_cart(String color, String size) {
        productDetailPage.selectColour(color);
        productDetailPage.selectSize(size);
        try{
            BrowserUtils.waitForClickablility(productDetailPage.addToCartButton,5);
            new Actions(Driver.get()).moveToElement(productDetailPage.addToCartButton).pause(200).click().build().perform();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("user should validate {string} has been added to cart")
    public void userShouldValidateHasBeenAddedToCart(String productName) {
        Assert.assertEquals(productName+" was added to your shopping cart.",cartPage.cartPageMessage.getText());
    }
}
