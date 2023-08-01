package pageObjects;

import browserControl.WebConnector;

public class JSAlertsPage extends WebConnector {

    /***************** Locators *****************/

private String jsAlertButtonXpath = "//button[@onclick='jsAlert()']";
private String jsConfirmButtonXpath = "//button[@onclick='jsConfirm()']";
private String jsPromptButtonXpath = "//button[@onclick='jsPrompt()']";



    /***************** Getters & Setters *****************/

    /**
     * Method to click on JS Alert Button
     */
    public void clickOnJSAlertButton () {
        BasePage.findElementByXpath(10,jsAlertButtonXpath).click();

    }

    /**
     * Method to click on JS Confirm button
     *
     */

    public void clickOnJSConfirm () {
        BasePage.findElementByXpath(10,jsConfirmButtonXpath).click();
    }

    /**
     * Method to click on JS Prompt Button
     */
    public void clickOnJSPrompt () {
        BasePage.findElementByXpath(10,jsPromptButtonXpath).click();
    }
}

