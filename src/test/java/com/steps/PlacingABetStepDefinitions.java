package com.steps;

import com.pages.AccountPage;
import com.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by John on 4/16/2017.
 */


public class PlacingABetStepDefinitions {


    private AccountPage accountPage;
    private LoginPage loginPage;
    private WebDriver driver;
    private double balance;

    //Setup before we begin testing, only executed once at the start
    @Before
    public void InitialiseTest(){

    	System.out.println("Opening the browser: Firefox");

        System.setProperty("webdriver.gecko.driver","C:\\SeleniumDrivers\\geckodriver-v0.15.0-win32\\geckodriver.exe");
        driver = new FirefoxDriver();
       
        
        //System.setProperty("webdriver.chrome.driver","  C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver(); 

        accountPage = new AccountPage(driver);
        loginPage = new LoginPage(driver);

    }

    //run below logic only at end of all tests, and only once!!!
    @After
    public void TearDown(Scenario scenario){

        System.out.println("Tear down ");

        if(scenario.isFailed() == true)
        {

            //get logs, and take screenshot!!!
            System.out.println("Scenario Failed, getting screenshot!!!");

        }

        //Closing the browser, releases the handle:
        driver.quit();


    }




    @Given("^I login with username: \"([^\"]*)\" and password: \"([^\"]*)\" and I have a credit balance on my account$")
    public void iLoginWithAndAndIHaveACreditBalanceOnMyAccount(String username, String password) throws Throwable {

    	
        // user navigates to website:
        loginPage.goToLoginPage();
        
        //sleeps would need to be replaced by wait for element!!!
        Thread.sleep(5000);

        loginPage.clickOnLogin1();

        Thread.sleep(5000);

        loginPage.enterLoginDetails(username, password);

        loginPage.clickOnLogin2();

        Thread.sleep(5000);

        balance = accountPage.getBalance();

        Assert.assertTrue("ASSERTION FAILED: Not enough credit on account",balance > 0);

        System.out.println("Logged in and balance available\n");
    }


    @When("^I select a sport: \"([^\"]*)\"$")
    public void iSelectA(String sport) throws Throwable {

        accountPage.selectSport(sport);

        //sleeps would need to be replaced by wait for element!!!
        Thread.sleep(2000);
        
        System.out.println("Sport selected: " + sport + "\n");


    }

    @And("^I enter a bet: \"([^\"]*)\" for the first active bet$")
    public void iEnterABetForTheFirstActiveBet(String bet) throws Throwable {
        
    
    	accountPage.clickActiveBet();

        Thread.sleep(2000);

        System.out.println("Active bet selected\n");

        //enter the bet:
        accountPage.placeABet(bet);

        Thread.sleep(2000);

        accountPage.clickPlaceBet();

        System.out.println("Bet placed: " + bet + "\n");

        //sleeps to be removed, only used for debugging!!!
        Thread.sleep(15000);

    }



    @Then("^I should get an indication of a return value$")
    public void iShouldGetAnIndicationOfAReturnValue() throws Throwable {
	
    	//open dropdown so I can see bet receipt:
        accountPage.showBetReceipt();
        Thread.sleep(1000);

        double retValue = accountPage.getReturnPrice();
        Assert.assertTrue("ASSERTION FAILED: Return value not indicated", retValue > 0);


    }

    @And("^I should get an indication of the total bet: \"([^\"]*)\" amount$")
    public void iShouldGetAnIndicationOfTheTotalAmount(double bet) throws Throwable {

        double totalValue = accountPage.getTotalStakePrice();
        Assert.assertEquals(totalValue,bet ,0 );


    }




    @And("^my balance is reduced by the bet: \"([^\"]*)\" amount$")
    public void myBalanceIsReducedByTheAmount(double bet) throws Throwable {


        double expectedBalance = this.balance - bet;
        double actualBalance = accountPage.getBalance();

        //Assert.assertEquals(expectedBalance,actualBalance ,0 );
        Assert.assertTrue("ASSERTION FAILED: Balance is not reduced",expectedBalance == actualBalance);


    }


}
