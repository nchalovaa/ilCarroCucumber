package com.ilcarro.stepDefinitions;

//assert shouldHaveText : Car added

import com.ilCarro.pages.AddCarPage;
import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilCarro.pages.BasePage.driver;

public class AddCarSteps {

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


    @And("User clicks on Ok button")
    public void click_on_Ok_button(){
        new LoginPage(driver).clickOnOkButton();
    }

    @And("User clicks Let the car work")
    public void click_let_the_car_work(){
        new LoginPage(driver).clickOnLetTheCarWorkButton();

    }

    @And(" And User enters Location data")
    public void enters_Location_data(){
        new AddCarPage(driver).enterData("Haifa");
    }

    @And("And User enters Car details")
    public void enters_Car_details(DataTable table){
        new AddCarPage(driver).enterCarData(table);
    }

    @And("User enters the text About")
    public void enters_the_text_About(){
        new AddCarPage(driver).enterTheTextAbout("The car is new");
    }

    @And("User upload Photos of car")
    public void upload_Photos_of_car(){
        new AddCarPage(driver).uploadPhoto("C:/Tools/1.png");
    }

    @Then("User clicks Submit button")
    public void clicks_submit_button(){
        new AddCarPage(driver).clickSubmitButton().verifyMessage("Car added");
    }
}
