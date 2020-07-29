package com.madison.pages;

import com.madison.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(name="q")
    public WebElement searchbox;

    @FindBy(xpath ="//button[@title='Search']")
    public  WebElement searchButton;

    @FindBy(css = "a.skip-link.skip-account")
    public WebElement accountMain;

    @FindBy(xpath = "//a[contains(@href,'http://www.ctqatest.biz/ecom/customer/account/login')]")
    public WebElement loginLink;

    @FindBy(xpath = "//a[contains(@href,'http://www.ctqatest.biz/ecom/customer/account/')][contains(@title,'My Account')]")
    public List<WebElement> accountSubLink_bottomLink;

    public WebElement getAccountSubLink(){
        return accountSubLink_bottomLink.get(0);
    }
    public WebElement getAccountBottomLink(){
        return accountSubLink_bottomLink.get(1);
    }

    /*


    @FindBy (css ="#search")
    public WebElement searchBox;

    @FindBy(xpath = "//*[.='Account'][1]")
    public WebElement accountElement;

    @FindBy(xpath = "//*[@title='Log In']")
    public WebElement loginElement;

    public void navigateToModule(String tab, String module) {

        String tabLocator = "//*[text()='" + tab + "'][@class='level0 has-children']";
        String moduleLocator = "//*[text()='" + module + "'][contains(@class, 'level1')]";
        Actions actions=new Actions(Driver.get());
        actions.moveToElement(Driver.get().findElement(By.xpath(tabLocator))).perform();
        Driver.get().findElement(By.xpath(moduleLocator)).click();

    }
    public void searchFor(String item){
        Driver.get().findElement(By.cssSelector("#search")).sendKeys(item);
        Driver.get().findElement(By.xpath("//*[@class='button search-button']")).click();

    }

    public void goToLoginPage(){
        Driver.get().findElement(By.xpath("//*[.='Account'][1]")).click();
        Driver.get().findElement(By.xpath("//*[@title='Log In']")).click();
    }

*/


}
