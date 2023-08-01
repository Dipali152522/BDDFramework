package pageObjects;

import browserControl.WebConnector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends WebConnector {

    /************* Locators **************/

    private String dropdownXpath = "//select[@id='dropdown']";
    private String dropdownSelectedOptionXpath = "//select[@id='dropdown']//option[@selected='selected']";






    /************** Getters & Setters ****************/

    /**
     * Method to select the given option from the dropdown
     * @param selectOption
     */
    public void setDropdown(String selectOption) {
        BasePage.findElementByXpath(10, dropdownXpath).sendKeys(selectOption);

    }

    /**
     * Method to return the selected option text
     * @return
     */
    public String getSelectedOption() {
        return BasePage.findElementByXpath(10,dropdownSelectedOptionXpath).getText();
    }

    /**
     * Select option from dropdown using Selenium Select Class
     * @param option
     */
    public void selectOptionFromDropdown(String option) {
        WebElement dropdown = BasePage.findElementByXpath(10,dropdownXpath);
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
    }
}
