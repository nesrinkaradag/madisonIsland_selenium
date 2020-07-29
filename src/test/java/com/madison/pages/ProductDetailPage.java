package com.madison.pages;

import com.madison.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailPage extends BasePage {
    /*@FindBy (xpath="(//*[@class='input-box'])[2]")
    WebElement colorDropdown;

    @FindBy (id = "attribute180")
    WebElement sizeDropdown;

    @FindBy(xpath = "(//*[.='Add to Cart'])[6]")
    WebElement addCart;


    public void selectColor() {
        Driver.get().findElement(By.xpath("(//*[@class='input-box'])[2]")).click();
        Driver.get().findElement(By.xpath("//*[@id=\"attribute92\"]/option[2]")).click();
    }

    public void selectSize(){
        Driver.get().findElement(By.xpath("(//*[@class='input-box'])[3]")).click();
        Driver.get().findElement(By.xpath("//*[@id=\"attribute180\"]/option[2]")).click();
    }
    public void addToCart() {
        Driver.get().findElement(By.xpath("(//*[.='Add to Cart'])[6]")).click();

    }
    public String verifyAddCart(){
        String message=Driver.get().findElement(By.xpath("//*[@class='success-msg']")).getText();
        return message;
    }

     */
    //
    @FindBy(id= "qty")
    public WebElement quantity;

    @FindBy(xpath ="//*[@class='add-to-cart-buttons']")
    public WebElement addToCartButton;

    @FindBy(id= "attribute92")
    public WebElement color;

    @FindBy(id= "attribute180")
    public WebElement size;


    public void selectColour(String colorProduct){
        Select colors= new Select(color);
        colors.selectByVisibleText(colorProduct);
    }

    public void selectSize(String sizeProduct){
        Select sizes= new Select(size);
        sizes.selectByVisibleText(sizeProduct);
    }

}
