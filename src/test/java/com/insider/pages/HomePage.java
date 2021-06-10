package com.insider.pages;

import com.insider.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{


    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//a[text() = 'We’re Hiring!']")
    public WebElement weAreHiring;
}
