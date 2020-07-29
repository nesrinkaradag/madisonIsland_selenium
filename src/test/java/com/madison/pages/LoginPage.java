package com.madison.pages;


import com.madison.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage  extends BasePage{
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath="//*[@id='email']")
    public WebElement userName;

    @FindBy(css="#pass")
    public WebElement password;

    @FindBy(css="#send2")
    public WebElement submit;

    @FindBy(xpath="//*[text()='This is a required field.']")
    public List<WebElement> errorMessageForEmpty;

    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }
}

