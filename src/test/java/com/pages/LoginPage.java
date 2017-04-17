package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by John on 4/14/2017.
 */
public class LoginPage {


    private WebDriver driver;
    private static final String LOGIN_URL = "http://sports.williamhill.com/sr-admin-set-white-list-cookie.html";


    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
      
    }

    /******************** Declare all WebElements here ****************************/
    
    @FindBy(how = How.ID, using = "loginUsernameInput")
    public WebElement txtUserName;

    @FindBy(how = How.ID, using = "loginPasswordInput")
    public WebElement txtPassword;

    @FindBy(how = How.XPATH, using = ".//*[@id='accountTabButton']/span[2]/span")
    public WebElement btnLogin1;

    @FindBy(how = How.XPATH, using = ".//*[@id='loginButton']")
    public WebElement btnLogin2;

    /**********************************************************************************/

    public void goToLoginPage(){

        //Open the William Hill website:
        driver.navigate().to(LOGIN_URL);


    }
    
    
    public void enterLoginDetails(String username, String password){


        txtUserName.sendKeys(username);
        txtPassword.sendKeys(password);

    }


    public void clickOnLogin1(){

        btnLogin1.click();  // click the first login button

    }


    public void clickOnLogin2(){

        btnLogin2.click(); // click the second login button

    }


  

}
