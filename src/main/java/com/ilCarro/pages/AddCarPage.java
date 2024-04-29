package com.ilCarro.pages;

import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Year;
import java.util.List;
import java.util.Map;

public class AddCarPage extends BasePage {

    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "pickUpPlace")     //(id="pickUpPlace")
    WebElement pickUpPlace;

    public AddCarPage enterData(String address) {
        type(pickUpPlace, address);
        return this;
    }

    public AddCarPage enterCarData(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps();

        String manufacture = dataTable.get(0).get("manufacture");
        String model = dataTable.get(0).get("model");
        String year = dataTable.get(0).get("year");
        enterDataCar(manufacture,model,year);
        return this;
    }


    @FindBy(id="make")
    WebElement firstRow;

    @FindBy(id="model")
    WebElement secondRow;

    @FindBy(id="year")
    WebElement thirdRow;


    public AddCarPage enterDataCar(String manufacture, String model, String year) {
        type(firstRow, manufacture);
        type(secondRow, model);
        type(thirdRow, year);
        return this;
    }


    @FindBy(id="about")
    WebElement about;

    public AddCarPage enterTheTextAbout(String text) {
        type(about, text);
        return this;
    }

    @FindBy(css = ".file-input-label")
    WebElement fileUpload;

    public AddCarPage uploadPhoto(String path) {
        fileUpload.sendKeys(path);
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement submitButton;

    public AddCarPage clickSubmitButton() {
        click(submitButton);
        return this;
    }

    @FindBy(css = "title")
    WebElement message;

    public AddCarPage verifyMessage(String text) {
        Assert.assertTrue(message.getText().contains(text));
        return this;
    }

    public AddCarPage enterCarDataSecondPart(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps();

        String seats = dataTable.get(0).get("seats");
        String carClass = dataTable.get(0).get("carClass");
        String carRegistrationNumber = dataTable.get(0).get("carRegistrationNumber");
        String carPrice = dataTable.get(0).get("carPrice");

        enterDataCarSecondPart(seats,carClass,carRegistrationNumber,carPrice);
        return this;
    }

    @FindBy(id="seats")
    WebElement fifthRow ;

    @FindBy(id="class")
    WebElement sixthRow;

    @FindBy(id="serialNumber")
    WebElement seventhRow;

    @FindBy(id="price")
    WebElement eightRow;

    public AddCarPage enterDataCarSecondPart(String seats, String carClass, String carRegistrationNumber, String carPrice) {

        type(fifthRow,seats);
        type(sixthRow, carClass);
        type(seventhRow, carRegistrationNumber);
        type(eightRow,carPrice);
        return this;
    }

    @FindBy(id="fuel")
    WebElement fourthRow;

    public AddCarPage selectOption(String petrol) {
            click(fourthRow);
            fourthRow.sendKeys(petrol);
            fourthRow.sendKeys(Keys.ENTER);
            return this;
    }
}
