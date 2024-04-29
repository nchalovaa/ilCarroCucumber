package com.ilcarro.stepDefinitions;

//assert shouldHaveText : Car added

import com.ilCarro.pages.AddCarPage;
import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LoginPage;
import com.ilCarro.pages.SearchCarPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilCarro.pages.BasePage.driver;

public class AddCarSteps {

    @And("User clicks on Ok button")
    public void click_on_Ok_button(){
        new LoginPage(driver).clickOnOkButton();
    }

    @And("User clicks Let the car work")
    public void click_let_the_car_work(){
        new SearchCarPage(driver).clickOnLetTheCarWorkButton();

    }

    @And(" And User enters Location data")
    public void enters_Location_data(){
        new AddCarPage(driver).enterData("Haifa");
    }

    @And("And User enters Car details")
    public void enters_Car_details(DataTable table){
        new AddCarPage(driver).enterCarData(table);
        new AddCarPage(driver).selectOption("Petrol");
        new AddCarPage(driver).enterCarDataSecondPart(table);
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
