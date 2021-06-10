package com.insider.pages;

import com.insider.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobDescriptionPage {

    public JobDescriptionPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//a[text() = 'Apply for this job']")
    public WebElement applyBtns;


}
