package com.ilCarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchCarPage extends BasePage{

    public SearchCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/let-car-work']")
    WebElement letTheCarWorkButton;
    public AddCarPage clickOnLetTheCarWorkButton() {
        click(letTheCarWorkButton);
        return new AddCarPage(driver);
    }
}
