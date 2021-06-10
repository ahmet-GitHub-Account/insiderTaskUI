package com.insider.pages;

import com.insider.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CareerPage extends BasePage{

    public CareerPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@class='vc_custom_heading menu-head']")
    public List<WebElement> menuBarList;

    @FindBy(css = ".lazyloaded")
    public List<WebElement> imageList;

    @FindBy(xpath = "//*[@class='job QualityAssurance Istanbul,Turkey Full-Time']")
    public List<WebElement> positionList;

    @FindBy(xpath = "//li[@role = \"option\"]")
    public List<WebElement> dropdownOptions;

    @FindBy(xpath = "(//span[@role = \"textbox\"])[1]")
    public WebElement locationDropdown;

    @FindBy(xpath = "(//span[@role = \"textbox\"])[2]")
    public WebElement departmantDropdown;

    @FindBy(xpath = "//span[@title = \"Istanbul, Turkey\"]")
    public WebElement selectedLocation;

    @FindBy(xpath = "//span[@title = \"Quality Assurance\"]")
    public WebElement selectedDepartment;

    @FindBy (xpath = "//div[@class = \"position-location text-large\"]")
    public List<WebElement> openLocations;

    @FindBy(xpath = "//span[@class = \"position-department text-large font-weight-600 text-primary\"]")
    public List<WebElement> openDepartments;

    @FindBy(xpath = "(//p[@class = \"position-title font-weight-bold\"])[4]")
    public WebElement forSelectPosition;

    @FindBy(xpath = "(//a[text() = 'Apply Now'])[4]")
    public WebElement applyNowButton;


    public void checkLocations(){
        for (WebElement openLocation : openLocations) {
            Assert.assertEquals("Istanbul, Turkey", openLocation.getText());
        }
    }

    public void checkDepartments(){
        for (WebElement openDepartment : openDepartments) {
            Assert.assertEquals("Quality Assurance", openDepartment.getText());
        }
    }








    public void checkMenuBarItems() {

        /*for(int i=0; i<menuBarList.size(); i++){
            BrowserUtils.waitFor(2);
            menuBarList.get(i).click();
           for(int j=0; j<imageList.size(); j++){
               Assert.assertTrue(imageList.get(j).isDisplayed());
            }
        }*/

        menuBarList.get(0).click();
        for (int j = 0; j < imageList.size(); j++) {
            Assert.assertTrue(imageList.get(j).isDisplayed());
        }

    }

    public void selectLocation(String locationText) {


    }

    public void selectDepartment(String departmantText) {
        locationDropdown.click();
    }

    public void checkPosition() {
        for (int i = 0; i < positionList.size(); i++) {
            Assert.assertTrue(positionList.get(i).getText().contains(" "));
        }
    }
}
