package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.JSAlertsPage;

import java.time.Duration;

public class JSAlertsStepDefinitions extends WebConnector {

    private JSAlertsPage jsAlertsPage = new JSAlertsPage();

    @When("the user clicks on JS Alert button")
    public void the_user_clicks_on_js_alert_button() {
 jsAlertsPage.clickOnJSAlertButton();

    }

    @Then("the user should see {string} text on the JS Alert")
    public void the_user_should_see_text_on_the_js_alert(String expectedText) {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        String actualText = alert.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Then("the user accepts the JS Alert")
    public void the_user_accepts_the_js_alert() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    @When("the user clicks on JS Confirm button")
    public void the_user_clicks_on_js_confirm_button() {
        jsAlertsPage.clickOnJSConfirm ();
    }
    @Then("the user should see {string} text on the JS Confirm")
    public void the_user_should_see_text_on_the_js_confirm(String expectedText) {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        String actualText = alert.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Then("the user accepts the JS Confirm")
    public void the_user_accepts_the_js_confirm() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        alert.accept();

    }

    @Then("the user dismisses the JS Confirm")
    public void the_user_dismisses_the_js_confirm() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        alert.dismiss();
    }

    @When("the user clicks on JS Prompt Button")
    public void the_user_clicks_on_js_prompt_button() {
        jsAlertsPage.clickOnJSPrompt();
    }

    @Then("the user should see {string} text on the JS Prompt")
    public void the_user_should_see_text_on_the_js_prompt(String expectedText) {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        String actualText = alert.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Then("the user enters {string} text in the prompt box and accepts the JS Prompt")
    public void the_user_enters_text_in_the_prompt_box_and_accepts_the_js_prompt(String prompt) {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        alert.sendKeys(prompt);
        alert.accept();

    }


}
