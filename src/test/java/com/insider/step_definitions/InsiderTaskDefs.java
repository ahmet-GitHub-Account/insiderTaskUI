package com.insider.step_definitions;

import com.insider.pages.ApplicationPage;
import com.insider.pages.CareerPage;
import com.insider.pages.HomePage;
import com.insider.pages.JobDescriptionPage;
import com.insider.utilities.BrowserUtils;
import com.insider.utilities.ConfigurationReader;
import com.insider.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InsiderTaskDefs {
    HomePage homePage = new HomePage();
    CareerPage careerPage = new CareerPage();
    JobDescriptionPage jobDescriptionPage = new JobDescriptionPage();
    ApplicationPage applicationPage = new ApplicationPage();


    @Given("Visit https:\\/\\/useinsider.com\\/ and check Insider home page is opened or not")
    public void visit_https_useinsider_com_and_check_Insider_home_page_is_opened_or_not() {
        Driver.get().get(ConfigurationReader.get("url"));
        String expectedTitle = "Insider | Platform for individualized, cross-channel customer experiences";
        Assert.assertEquals(expectedTitle, Driver.get().getTitle());
        System.out.println(Driver.get().getTitle());
    }

    @Given("Select “Career” menu in navigation bar and check Career page, its Culture, Locations, Teams, Jobs and Life at Insider blocks are opened or not")
    public void select_Career_menu_in_navigation_bar_and_check_Career_page_its_Culture_Locations_Teams_Jobs_and_Life_at_Insider_blocks_are_opened_or_not() {
        //Click Career button
        homePage.moreTab.click();
        BrowserUtils.waitFor(2);
        homePage.careersModule.click();
    }

    @Then("Scroll to Career Opportunities, filter jobs by Location - Istanbul, Turkey and department - Quality Assurance, check presence of jobs list")
    public void scroll_to_Career_Opportunities_filter_jobs_by_Location_Istanbul_Turkey_and_department_Quality_Assurance_check_presence_of_jobs_list() {
        BrowserUtils.scrollToElement(homePage.weAreHiring);
        BrowserUtils.waitFor(2);
        homePage.weAreHiring.click();
        BrowserUtils.waitFor(2);
        careerPage.cookies.click();
        careerPage.locationDropdown.click();
        List<WebElement> locationDropDownOptions = careerPage.dropdownOptions;
        locationDropDownOptions.get(2).click();
        BrowserUtils.waitFor(2);
        careerPage.departmantDropdown.click();
        List<WebElement> departmantOptions = careerPage.dropdownOptions;
        departmantOptions.get(14).click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(careerPage.selectedLocation.isDisplayed());
        Assert.assertTrue(careerPage.selectedDepartment.isDisplayed());

    }

    @Then("Check that all jobs’ Position contains “Quality Assurance”, Department contains “Quality Assurance”, Location contains “Istanbul, Turkey”")
    public void check_that_all_jobs_Position_contains_Quality_Assurance_Department_contains_Quality_Assurance_Location_contains_Istanbul_Turkey() {
        BrowserUtils.waitFor(2);

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,800)");

        BrowserUtils.waitFor(2);
        careerPage.checkLocations();
        careerPage.checkDepartments();
    }

    @When("Select one of the positions, check that correct position page is opened, presence of job description, requirements and “Apply for this job” button")
    public void select_one_of_the_positions_check_that_correct_position_page_is_opened_presence_of_job_description_requirements_and_Apply_for_this_job_button() {
        BrowserUtils.waitFor(1);
        String expectedJob = careerPage.forSelectPosition.getText();
        BrowserUtils.hover(careerPage.forSelectPosition);
        careerPage.applyNowButton.click();
        BrowserUtils.switchToWindow(expectedJob);
        BrowserUtils.waitFor(5);

    }

    @Then("Click “Apply for this job” button and check that this action redirects us to Application form page")
    public void click_Apply_for_this_job_button_and_check_that_this_action_redirects_us_to_Application_form_page() {
        jobDescriptionPage.applyBtns.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(applicationPage.formHeadText.getAttribute("class").contains("form"));
    }

}
