package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by John on 4/15/2017.
 */
public class AccountPage {

	//constructor:
    public AccountPage(WebDriver driver) {
    	PageFactory.initElements(driver, this); 
    
    	}
    
    
    /******************** Declare all WebElements here ****************************/
    
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-football']/i")
    public WebElement footballLink;

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-tennis']/i")
    public WebElement tennisLink;


    @FindBy(how = How.XPATH, using = ".//*[starts-with(@id,'OB_OU')]")
    List<WebElement> list;

    @FindBy(how = How.XPATH, using = ".//*[starts-with(@id,'stake-input__')]")
    public WebElement betField;

    @FindBy(how = How.XPATH, using = ".//*[@id='place-bet-button']")
    public WebElement btnPlaceBet;

    @FindBy(how = How.XPATH, using = ".//*[@id='total-stake-price']")
    public WebElement totalStakePrice;

    @FindBy(how = How.XPATH, using = ".//*[@id='total-to-return-price']")
    public WebElement returnPrice;

    @FindBy(how = How.XPATH, using = ".//div[@id='bet-receipt']//header[@class='betslip-header']\n")
    public WebElement betReceiptHeader;

    @FindBy(how = How.XPATH, using = ".//*[@id='userBalance']")
    public WebElement userBalance;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='receipt-notice-box']")
    public WebElement receiptNoticeBox;
   

    public WebElement activeBetLink;
    
    

    /***********************************************************************************/

    public void selectSport(String sport){


        if("football".equalsIgnoreCase(sport)){
            footballLink.click(); // click on football link
            return;

        }

        if("tennis".equalsIgnoreCase(sport)){
        	

            tennisLink.click(); // click on tennis link
            return;
           
            

        }




    }


    public void clickActiveBet(){

        //need to get dynamic xpath here:
        activeBetLink = findXpath();  // get the xpath of the first active link

        //click on first active bet:
        activeBetLink.click();

    }


    public void placeABet(String amount){


        //place the bet in the text box:
        betField.sendKeys(amount);

    }


    public void clickPlaceBet(){


        btnPlaceBet.click();

    }

    public void showBetReceipt(){

        betReceiptHeader.click();
    }


    public double getTotalStakePrice(){

        return convertToDouble(totalStakePrice.getText());

    }

    public double getReturnPrice(){

       return convertToDouble(returnPrice.getText());

    }

    public double getBalance(){

        return convertToDouble(userBalance.getText());

    }


    private double convertToDouble(String s){

        s = s.replaceAll("[^\\d.]", "");
        return Double.valueOf(s);

    }

    public WebElement findXpath(){


        System.out.println("Number of elements: " + list.size());
        return list.get(0); //get first element in the list

    }
    
   


}
