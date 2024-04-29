package com.ilCarro.pages;

import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Year;
import java.util.List;
import java.util.Map;

public class AddCarPage extends BasePage {

    @FindBy(id="pickUpPlace")
    WebElement pickUpPlace;

    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    public AddCarPage enterData(String address) {
        type(pickUpPlace, address);
        return this;
    }

    public AddCarPage enterCarData(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps();

        String manufacture = dataTable.get(0).get("manufacture");
        String model = dataTable.get(0).get("model");
        String year = dataTable.get(0).get("year");
        String fuel = dataTable.get(0).get("fuel");
        String seats = dataTable.get(0).get("seats");
        String carClass = dataTable.get(0).get("carClass");
        String carRegistrationNumber = dataTable.get(0).get("carRegistrationNumber");
        String carPrice = dataTable.get(0).get("carPrice");

        enterDataCar(manufacture,model,year, fuel,seats,carClass,carRegistrationNumber,carPrice);
        return this;
    }


    @FindBy(id="make")
    WebElement firstRow;

    @FindBy(id="model")
    WebElement secondRow;

    @FindBy(id="year")
    WebElement thirdRow;

    @FindBy(id="fuel")
    WebElement fourthRow;

    @FindBy(id="seats")
    WebElement fifthRow ;

    @FindBy(id="class")
    WebElement sixthRow;

    @FindBy(id="serialNumber")
    WebElement seventhRow;

    @FindBy(id="price")
    WebElement eightRow;


    public AddCarPage enterDataCar(String manufacture, String model, String year, String fuel, String seats, String carClass, String carRegistrationNumber, String carPrice) {
        type(firstRow, manufacture);
        type(secondRow, model);
        type(thirdRow, year);
        type(fourthRow, fuel);
        type(fifthRow,seats);
        type(sixthRow, carClass);
        type(seventhRow, carRegistrationNumber);
        type(eightRow,carPrice);
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
}
