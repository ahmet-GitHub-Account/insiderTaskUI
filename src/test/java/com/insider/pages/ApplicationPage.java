package com.insider.pages;

import com.insider.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationPage {
    public ApplicationPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//div[@class='section page-centered application-form'])[1]")
    public WebElement formHeadText;


}
