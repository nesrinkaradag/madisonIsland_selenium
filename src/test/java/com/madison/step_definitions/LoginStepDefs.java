package com.madison.step_definitions;

import com.madison.pages.LoginPage;
import com.madison.utilities.ConfigurationReader;
import com.madison.utilities.Driver;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @Given("the user navigates to login page")
    public void the_user_navigates_to_login_page() {
    loginPage.accountMain.click();
    loginPage.loginLink.click();

    }

    @When("the user login with invalid credentials")
    public void the_user_login_with_invalid_credentials() {
        String username = ConfigurationReader.get("invalid_username");
        String password = ConfigurationReader.get("invalid_password");
        loginPage.login(username,password);
    }

    @Then("the user should be able to see the error message")
    public void the_user_should_be_able_to_see_the_error_message() {
        Assert.assertEquals("Invalid login or password.",loginPage.errorMessageForInvalid.getText());
    }

    @When("the user login without credentials")
    public void the_user_login_without_credentials() {

        loginPage.login("","");
    }

    @Then("the user should be able to see validation appears")
    public void the_user_should_be_able_to_see_validation_appears() {
        Assert.assertEquals("This is a required field.",loginPage.errorMessageForEmpty.get(0).getText());
    }

    @When("the user login with valid credentials")
    public void the_user_login_with_valid_credentials() {
        String username = ConfigurationReader.get("valid_username");
        String password = ConfigurationReader.get("valid_password");
        loginPage.login(username,password);
    }

    @Then("the should be able to login successfully")
    public void the_should_be_able_to_login_successfully() {
        Assert.assertEquals("My Account",Driver.get().getTitle());

    }

}
