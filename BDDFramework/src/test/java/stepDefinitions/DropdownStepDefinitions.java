package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.DropdownPage;

public class DropdownStepDefinitions extends WebConnector {

    private DropdownPage dropdownPage = new DropdownPage();

    @When("the user selects {string} option from the dropdown list")
    public void the_user_selects_option_from_the_dropdown_list(String selectOption) {
//        dropdownPage.setDropdown(selectOption);
        dropdownPage.selectOptionFromDropdown(selectOption);



    }
    @Then("the user should see {string} option is selected in the dropdown list")
    public void the_user_should_see_option_is_selected_in_the_dropdown_list(String selectOption) {
        String actualText = dropdownPage.getSelectedOption();
        Assert.assertEquals(selectOption, actualText);

    }


}
