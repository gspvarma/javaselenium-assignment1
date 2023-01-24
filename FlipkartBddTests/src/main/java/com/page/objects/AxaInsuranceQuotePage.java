package com.page.objects;

import com.utilities.AutomationBase;
import com.utilities.Utility;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AxaInsuranceQuotePage extends Utility {

    //public static WebDriver driver;
    public static String newUserName="";
    public static String newUserPassword="";
    public AxaInsuranceQuotePage(WebDriver driverInstance) {
        driver = driverInstance;
    }

    public static void launchApp(String app) throws Exception {
        AutomationBase.launchApp(getAppUrl(app));
        explicitWait(2);
        logger.info("AXA insurance is launched");
    }

    public static void submitQuoteGenerationForm() {
        scrollToElement(PageObjects.singleTripBtn);
        Assert.assertTrue(isDisplayed(returnElement(PageObjects.singleTripBtn, "visible")), "SingleTrip section not displayed");
        Assert.assertTrue(isDisplayed(returnElement(PageObjects.annualTripBtn, "visible")), "AnnualTrip button not displayed");

        //scrollToElement(PageObjects.journeyStartDateField);

        clickElementJS(returnElement(PageObjects.journeyStartDateField, "clickable"));
        clickElementJS(returnElement(PageObjects.currentDayLabel, "clickable"));

        scrollToElement(PageObjects.singleTripBtn);
        clickElementJS(returnElement(PageObjects.journeyEndDateField, "clickable"));
        clickElementJS(returnElement(PageObjects.futureDayLabel, "clickable"));

        clickElement(returnElement(PageObjects.adultDropdown, "clickable"));
        sendDownArrow();
        sendDownArrow();
        pressEnter();
        //clickElement(returnElement(PageObjects.AdultCount, "clickable"));
        explicitWait(2);

        clickElement(returnElement(PageObjects.childWithParentDropdown, "clickable"));
        sendDownArrow();
        sendDownArrow();
        pressEnter();
        //clickElement(returnElement(PageObjects.childCountWithPArent, "clickable"));

        clickElement(returnElement(PageObjects.childWihtoutParentDropdown, "clickable"));
        sendDownArrow();
        sendDownArrow();
        pressEnter();
        //clickElement(returnElement(PageObjects.childCountWithoutPArent, "clickable"));

        clickElement(returnElement(PageObjects.getQuoteBtn, "clickable"));

        logger.info("AXA travel insurance quote submitted without issues");

    }

    public static void verifyQuotePlans(String planA, String planB, String planC) {
        explicitWait(2);
        scrollToElement(PageObjects.annualCoverageLabel);
        Assert.assertTrue(isDisplayed(returnElement(PageObjects.budgetPlanLabel, "visible"))
                && getText(PageObjects.budgetPlanLabel).equals(planA), "BudgetPlannot displayed");
        Assert.assertTrue(isDisplayed(returnElement(PageObjects.EconomyPlanLabel, "visible"))
                && getText(PageObjects.EconomyPlanLabel).equals(planB), "EconomyPlan not displayed");
        Assert.assertTrue(isDisplayed(returnElement(PageObjects.SuperiorPlanLabel, "visible"))
                && getText(PageObjects.SuperiorPlanLabel).equals(planC), "SuperiorPlan not displayed");
        logger.info("Axa travel insurance page with various plans launched without issues");
        explicitWait(2);
    }

    public static void explicitWait(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
