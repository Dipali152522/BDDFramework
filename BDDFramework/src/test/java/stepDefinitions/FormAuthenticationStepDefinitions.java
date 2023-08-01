package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FormAuthenticationPage;
import utilities.ConstantUtils;

import java.time.Duration;

public class FormAuthenticationStepDefinitions extends WebConnector {
   private FormAuthenticationPage formAuthPage = new FormAuthenticationPage();

    @Given("the user navigate to the home page")
    public void the_user_navigate_to_the_home_page() {
        driver.get(ConstantUtils.BASE_URL);
    }

    @Given("the user follows {string} link")
    public void the_user_follows_link(String linkText) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.linkText(linkText))).click();
    }

    @When("the user enters {string} in Username field")
    public void the_user_enters_in_username_field(String username) {
        formAuthPage.setUserName(username);

    }

    @When("the user enters {string} in password field")
    public void the_user_enters_in_password_field(String password) {

        formAuthPage.setPassword(password);
    }

    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {

        formAuthPage.clickLogin();
    }

    @Then("the user should see {string} text on the page")
    public void the_user_should_see_text_on_the_page(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }

    @When("the user login with {string} username and {string} password")
    public void the_user_login_with_username_and_password(String username, String password) {
        formAuthPage.setUserName(username);
        formAuthPage.setPassword(password);
        formAuthPage.clickLogin();

    }

}
