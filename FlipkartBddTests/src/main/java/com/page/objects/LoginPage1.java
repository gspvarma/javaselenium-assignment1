package com.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.utilities.AutomationBase;
import com.utilities.Utility;

public class LoginPage1 extends Utility{
	
	public LoginPage1(WebDriver driverInstance) {
        driver = driverInstance;
    }

    public static void launchApp() throws Exception {
        AutomationBase.launchApp("https://www.amazon.in/");
        explicitWait(2);
        logger.info("Amazon app is launched");
    }
    
    public static void explicitWait(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void clicksignin()
    {
    	clickElement(PageObjects.SignIn);
    	explicitWait(2);
    }
    public static void userid(String user)
    {
    	sendKeys(PageObjects.emph,user);
    	explicitWait(2);
    }
    public static void password(String passw)
    {
    	sendKeys(PageObjects.pass, passw);
    	explicitWait(2);
    }
    public static void continu()
    {
    	clickElement(PageObjects.cont);
    	explicitWait(2);
    }
    public static void logina()
    {
    	clickElement(PageObjects.logsub);
    	explicitWait(2);
    }
    
    public static void search(String item1)
    {
    	sendKeys(PageObjects.search1,item1);
    	explicitWait(2);
    }
    public static void searchsum()
    {
    	clickElement(PageObjects.searchsub);
    	explicitWait(2);
    }

    public static void psearch1()
    {
    	clickElement(PageObjects.iphnsearch);
    	explicitWait(2);
    }
    public static void addcart()
    {
    	clickElement(PageObjects.addcart);
    	explicitWait(2);
    }
    public static void viewcart1()
    {
    	clickElement(PageObjects.viewcart1);
    	explicitWait(2);
    }
    public static void psearch2()
    {
    	clickElement(PageObjects.hpsearch);
    	explicitWait(2);
    }
    public static void delete1()
    {
//    	clickElement(PageObjects.delete1);
    	explicitWait(2);
    	PageObjects.delete1.click();
    	explicitWait(2);
    }
    
    public static void verifyResultsPage(String pageTitle){
        String expectedTitle  = pageTitle;
        System.out.println(AutomationBase.getTitle()+expectedTitle);
        Assert.assertTrue(AutomationBase.getTitle().equals(expectedTitle));
        explicitWait(3);
    }
    public static void verifypage1()
    {
    	 boolean a=driver.findElement(By.tagName("body")).getText().contains("Your Amazon Cart is empty.");

          Assert.assertTrue(a);
    }
    public static void buy1()
    {
    	clickElement(PageObjects.proceedbuy);
    	explicitWait(2);
    }
    public static void address1()
    {
    	clickElement(PageObjects.useaddress);
    	explicitWait(2);
    }
    
    public static void verifyselectpayment()
    {
    	  boolean a=driver.findElement(By.xpath("//span[text()='Order Total:']")).isDisplayed();

          Assert.assertTrue(a);
    }
    public static void verifyuseralert1()
    {
    	 boolean a=driver.findElement(By.tagName("body")).getText().contains("There was a problem");

          Assert.assertTrue(a);
    }
    public static void allnav()
    {
    	clickElement(PageObjects.allnav);
    	explicitWait(2);
    }
    public static void seeall()
    {
    	clickElement(PageObjects.seeall);
    	explicitWait(2);
    }
    public static void books1()
    {
    	clickElement(PageObjects.books1);
    	explicitWait(2);
    }
    public static void exambk()
    {
    	clickElement(PageObjects.exambk);
    	explicitWait(2);
    }
    public static void cs1()
    {
    	clickElement(PageObjects.CS1);
    	explicitWait(2);
    }
    public static void dsds()
    {
    	clickElement(PageObjects.DSDS);
    	explicitWait(2);
    }
    public static void kd1()
    {
    	clickElement(PageObjects.KD1);
    	explicitWait(2);
    }
}
