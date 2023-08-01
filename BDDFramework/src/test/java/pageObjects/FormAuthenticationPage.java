package pageObjects;

import browserControl.WebConnector;


public class FormAuthenticationPage extends WebConnector {

    /****************** Locators ******************/

    private String usernameFieldXpath = "//input[@id='username']";
    private String passwordFieldXpath = "//input[@id='password']";
    private String loginButtonXpath = "//button[@type='submit']";



    /****************** Getters and Setters *****************/

    /**
     * Set Username Field
     * @param username
     */
    public void setUserName(String username) {
        BasePage.findElementByXpath(10,usernameFieldXpath).sendKeys(username);
//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(usernameFieldXpath))).sendKeys(username);
    }

    /**
     * Set Password field
     * @param password
     */
    public void setPassword (String password){
        BasePage.findElementByXpath(10,passwordFieldXpath).sendKeys(password);

//            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(passwordFieldXpath))).sendKeys(password);
        }

    /**
     * Click on login Button
     */

    public void clickLogin () {
        BasePage.findElementByXpath(10,loginButtonXpath).click();

//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(loginButtonXpath))).click();
    }



}
