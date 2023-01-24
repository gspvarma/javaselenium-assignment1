package com.page.objects;

import com.utilities.AutomationBase;
import com.utilities.Utility;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchPage extends Utility {

    //public static WebDriver driver;
    public static String newUserName="";
    public static String newUserPassword="";
    public SearchPage(WebDriver driverInstance) {
        driver = driverInstance;
    }

    public static void launchApp(String app) throws Exception {
        AutomationBase.launchApp(getAppUrl(app));
        explicitWait(2);
        logger.info("LM insurance is launched");
    }

    public static void loginApp() throws Exception {
//        clickElement(returnElement(PageObjects.LMSignInSignUpLink, "clickable"));
//        sendKeys(PageObjects.LMUserNameField, "userId_60823");
//        sendKeys(PageObjects.LMPasswordField, "password73035");
//        explicitWait(2);
//        clickElement(returnElement(PageObjects.LMLoginButton, "clickable"));
//        logger.info("LM insurance existing user login details entered");
    }

    public static void verifyHomePage() {
        Assert.assertTrue(isDisplayed(returnElement(PageObjects.LMLogo, "visible")), "LMLogo not displayed");
        Assert.assertTrue(isDisplayed(returnElement(PageObjects.LMLogoutLink, "visible")), "Logout link not displayed");
        Assert.assertTrue(isDisplayed(returnElement(PageObjects.LMDashboardMenu, "visible")), "LMDashboardMenu not displayed");
        Assert.assertTrue(isDisplayed(returnElement(PageObjects.LMProfileSection, "visible")), "LMProfileSection not displayed");
        logger.info("LM Insurance dashboard is launched without issues");
        explicitWait(2);
        clickElement(returnElement(PageObjects.LMLogoutLink, "clickable"));
        Assert.assertTrue(isDisplayed(returnElement(PageObjects.LMSignInSignUpLink, "visible")), "LM SignIn link not displayed");
        logger.info("Logged out from LM Insurance dashboard successfully");
    }

    public static void explicitWait(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void launchRegisterForm() {
        clickElement(returnElement(PageObjects.LMSignInSignUpLink, "clickable"));
        clickElement(returnElement(PageObjects.LMRegisterButton, "clickable"));
        explicitWait(2);
    }

    public static void searchResults(String searchKey){
        sendKeys(PageObjects.googleSearchField, searchKey);
        clickElement(returnElement(PageObjects.googleSearchButton, "clickable"));
        explicitWait(3);
    }

    public static void verifyResultsPage(String pageTitle){
        String expectedTitle  = pageTitle;
        Assert.assertTrue(AutomationBase.getTitle().equals(expectedTitle));
        explicitWait(3);
    }



    public static void fillRegisterDetails() {
        sendKeys(PageObjects.LMRegisterFirstNameField, "userFirstName_"+ RandomStringUtils.randomAlphanumeric(5));
        sendKeys(PageObjects.LMRegisterLastNameField, "userLastName_"+ RandomStringUtils.randomAlphanumeric(5));
        newUserName = "userId_"+ RandomStringUtils.randomNumeric(5);
        sendKeys(PageObjects.LMRegisterUserIdField, newUserName);
        sendKeys(PageObjects.LMRegisterYourEmailField, "user"+ RandomStringUtils.randomAlphanumeric(5)+"@gmail.com");
        sendKeys(PageObjects.LMRegisterMobileNumberField, "9999"+ RandomStringUtils.randomNumeric(6));
        sendKeys(PageObjects.LMRegisterDOBField, "1998-12-30");
        newUserPassword = "password"+ RandomStringUtils.randomNumeric(5);
        sendKeys(PageObjects.LMRegisterPwdField, newUserPassword);
        explicitWait(2);
        System.out.println("newUserName:"+newUserName);
        System.out.println("newUserPassword:"+newUserPassword);
    }

    public static void completeRegistration() {
        scrollToElement(PageObjects.LMIAgreeCheckbox);
        clickElement(returnElement(PageObjects.LMIAgreeCheckbox, "clickable"));
        scrollToElement(PageObjects.LMRegisterFormButton);
        clickElement(returnElement(PageObjects.LMRegisterFormButton, "clickable"));
        Assert.assertTrue(isDisplayed(returnElement(PageObjects.LmRegistrationSuccessMessage, "visible")), "LM Registration Success Message not displayed");
        explicitWait(2);
    }

    public static void loginAppAsNewUser() {
        clickElement(returnElement(PageObjects.GotoLoginPageButton, "GotoLoginPageButton"));
        clickElement(returnElement(PageObjects.LMSignInSignUpLink, "clickable"));
        sendKeys(PageObjects.LMUserNameField, newUserName);
        sendKeys(PageObjects.LMPasswordField, newUserPassword);
        explicitWait(2);
        clickElement(returnElement(PageObjects.LMLoginButton, "clickable"));
        logger.info("LM insurance new user registration is successful");

        Assert.assertTrue(isDisplayed(returnElement(PageObjects.LMLogo, "visible")), "LMLogo not displayed");
        Assert.assertTrue(isDisplayed(returnElement(PageObjects.LMLogoutLink, "visible")), "Logout link not displayed");
        Assert.assertTrue(isDisplayed(returnElement(PageObjects.LMDashboardMenu, "visible")), "LMDashboardMenu not displayed");
        Assert.assertTrue(isDisplayed(returnElement(PageObjects.LMProfileSection, "visible")), "LMProfileSection not displayed");
        logger.info("LM Insurance dashboard is launched without issues");
        explicitWait(2);
        clickElement(returnElement(PageObjects.LMLogoutLink, "clickable"));
        Assert.assertTrue(isDisplayed(returnElement(PageObjects.LMSignInSignUpLink, "visible")), "LM SignIn link not displayed");
        logger.info("Logged out from LM Insurance dashboard successfully");
        explicitWait(2);
    }
}
