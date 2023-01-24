package com.stepdefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.page.objects.LoginPage1;
import com.page.objects.PageObjects;
import com.utilities.Utility;
import com.utilities.AutomationBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login1 extends Utility {
	
	public login1(WebDriver driverInstance) {
        super(driverInstance);
    }
	
    public login1() {
    }
	@Given("user launch the app")
	public void user_launch_the_app() throws Exception {
		try {
            LoginPage1.launchApp();
        } catch (Exception e) {
            throw e;
        }
	}

	@When("user click on signin")
	public void user_click_on_signin() {
		try {
	           LoginPage1.clicksignin();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

	@Then("user should be navigated to login page {string}")
	public void user_should_be_navigated_to_login_page(String PageTitle) {
			  LoginPage1.verifyResultsPage(PageTitle);
	
		   System.out.println("Login Page found...");
	}
	
	@Given("user launches the app")
	public void user_launches_the_app() throws Exception {
		try {
            LoginPage1.launchApp();
        } catch (Exception e) {
            throw e;
        }
	}

	@When("user clicks on signin")
	public void user_clicks_on_signin() {
		try {
	           LoginPage1.clicksignin();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

	@Then("user should be able to login using userId password {string}{string}")
	public void user_should_be_able_to_login_using_user_id_password(String user, String pass) {
		try {
	           LoginPage1.userid(user);
	           LoginPage1.continu();
	           LoginPage1.password(pass);
	           LoginPage1.logina();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

@Given("user open the app")
public void user_open_the_app() throws Exception {
	try {
        LoginPage1.launchApp();
    } catch (Exception e) {
        throw e;
    }
}

@When("user searches required item {string}")
public void user_searches_required_item(String items) {
	try {
	LoginPage1.search(items);
    LoginPage1.searchsum();
}
    catch (Exception e) {
        e.printStackTrace();
    }
}

@Then("user should be navigated to that page {string}")
public void user_should_be_navigated_to_that_page(String pagetitle) {
	LoginPage1.verifyResultsPage(pagetitle);
	System.out.println("page for required item found...");
}

@Then("user should be able to select required product")
public void user_should_be_able_to_select_required_product()throws Exception
{
	try {
        LoginPage1.psearch1();
        AutomationBase.switchToNewWindow(null);
        LoginPage1.verifyResultsPage("(Renewed) Redmi Note 5 Pro (Gold, 4GB RAM, 64GB Storage) : Amazon.in: Electronics");
        System.out.println("page found...");
    } catch (Exception e) {
        throw e;
    }
}

@Then("user should be able to select and add to cart")
public void user_should_be_able_to_select_and_add_to_cart()throws Exception
{
	try {
        LoginPage1.psearch2();
        AutomationBase.switchToNewWindow(null);
        LoginPage1.addcart();
        LoginPage1.viewcart1();
        System.out.println("page found...");
    } catch (Exception e) {
        throw e;
    }
}

@Then("user should be able to remove item from cart")
public void user_should_be_able_to_remove_item_from_cart()throws Exception
{
	try {
		LoginPage1.psearch1();
        AutomationBase.switchToNewWindow(null);
        //Utility.scrollToElement(PageObjects.hpsearch);
        LoginPage1.addcart();
        LoginPage1.viewcart1();
        LoginPage1.delete1();
        System.out.println("deleted from cart...");
//       LoginPage1.verifypage1();
        System.out.println("verified...");
    } catch (Exception e) {
        throw e;
    }
}
@Then("user able to click buy item and signin {string}{string}")
public void user_able_to_click_buy_item_and_signin(String user, String pass) {
	try {
		LoginPage1.psearch1();
        AutomationBase.switchToNewWindow(null);
        //Utility.scrollToElement(PageObjects.hpsearch);
        LoginPage1.buy1();
        System.out.println("moved to signin page...");
           LoginPage1.userid(user);
           LoginPage1.continu();
           LoginPage1.password(pass);
           LoginPage1.logina();
        } catch (Exception e) {
            e.printStackTrace();
        }
}


@Then("user should able to go to payment page")
public void user_should_able_to_go_payment_page()throws Exception
{
	try {
//		LoginPage1.psearch1();
//        AutomationBase.switchToNewWindow(null);
//        Utility.scrollToElement(PageObjects.hpsearch);
//        LoginPage1.buy1();
        System.out.println("moved to address page...");
        LoginPage1.address1();
        System.out.println("moved to payment page...");
        LoginPage1.verifyselectpayment();
        System.out.println("verified...");
    } catch (Exception e) {
        throw e;
    }
}

@Then("user should be able to check login using userId password {string}")
public void user_should_be_able_to_check_login_using_user_id_password(String user) {
	try {
           LoginPage1.userid(user);
           LoginPage1.continu();
           LoginPage1.verifyuseralert1();
//           LoginPage1.password(pass);
//           LoginPage1.logina();
        } catch (Exception e) {
            e.printStackTrace();
        }
}


@When("user clicks on allnav")
public void user_clicks_on_allnav() {
	try {
           LoginPage1.allnav();
           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("window.scrollBy(0,250)", "");
           LoginPage1.seeall();
        } catch (Exception e) {
            e.printStackTrace();
        }
}

@Then("user should able to search by category")
public void user_should_able_to_search_by_category() {
	try {
           LoginPage1.books1();
           LoginPage1.exambk();
        } catch (Exception e) {
            e.printStackTrace();
        }
}

@When("user clicks on customer support and clicks particular support")
public void user_clicks_on_customer_support_and_clicks_particular_support() {
	try {
           LoginPage1.cs1();
           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("window.scrollBy(0,350)", "");
           LoginPage1.dsds();
        } catch (Exception e) {
            e.printStackTrace();
        }
}

@Then("user should able to navigated to support page")
public void user_should_able_to_navigated_to_support_page() {
	try {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,400)", "");
           LoginPage1.kd1();
           System.out.println("page found...");
        } catch (Exception e) {
            e.printStackTrace();
        }
}

}


