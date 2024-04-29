package com.ilcarro.stepDefinitions;

import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilCarro.pages.BasePage.driver;

public class LoginSteps {

    @And("User clicks on Login link")
    public void clicks_on_Login_link(){
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters valid data")
    public void enters_valid_data(){
        new LoginPage(driver).enterData("nchalova93@gmail.com","Chalova2402@");
    }

    @And("User clicks on Yalla button")
    public void click_on_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();
    }

    @Then("User verifies Success Message is displayed")
    public void verifies_Success_Message(){
        new LoginPage(driver).isMessageDisplayed("Logged in success");
    }

    @And ("User enters valid email and invalid password")
    public void enter_invalid_password(DataTable table){
        new LoginPage(driver).enterInvalidPassword(table);
    }

    @Then("User verifies Error is displayed")
    public void verify_Error(){
        new LoginPage(driver).isMessageDisplayed("Login or Password incorrect");
    }
}
