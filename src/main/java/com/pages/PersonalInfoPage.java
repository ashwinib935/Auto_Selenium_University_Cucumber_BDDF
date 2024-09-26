package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PersonalInfoPage {
    private WebDriver driver;

  By personalInfoHeading = By.xpath("//h2//slot");
  By preferedName =  By.xpath("//input[@name='Nickname__c']");
   By bDate =  By.xpath("//input[@name='Date_of_Birth__c']");
   By address =  By.xpath( "//input[@name='Address_Line_1__c']");
   By city = By.xpath("//input[@name='City__c']");

  public HomePage homePage;
    public PersonalInfoPage(WebDriver driver){
        this.driver = driver;

    }
    public String getPersonalInfoTitle(){
        return driver.getTitle();
    }
    public Boolean checkHeading(String heading){
          if(driver.findElement(personalInfoHeading).getText().equals(heading)){
              return true;
          }
          return false;
    }

    public void fillPersonalDetails(String pname,String bdate,String add,String cityName){

        driver.findElement(preferedName).clear();
        driver.findElement(preferedName).sendKeys(pname);

        driver.findElement(bDate).clear();
        driver.findElement(bDate).sendKeys(bdate);

        driver.findElement(address).clear();
        driver.findElement(address).sendKeys(add);

        driver.findElement(city).clear();
        driver.findElement(city).sendKeys(cityName);

    }


}
