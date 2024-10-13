package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage {
 private WebDriver driver;
 private By navList = By.xpath("//div[@class='app-header__nav']//ul//li");

 private  By personalInfoLink = By.xpath("//ul[@role='tablist']//li[1]");
 private By educationHistoryLink =  By.xpath("//ul[@role='tablist']//li[2]");

    WebDriverWait wait;
 public  HomePage(WebDriver driver){
     this.driver = driver;
     wait = new WebDriverWait(driver,10);

 }

 public String getHomeTitle(){
     return driver.getTitle();
 }

 public boolean myProfileTagIsDisplayed(String myProfile) throws InterruptedException {
    wait.until(ExpectedConditions.visibilityOfElementLocated(personalInfoLink));
     List<WebElement> list = driver.findElements(navList);
     System.out.println("list"+list);
      for (WebElement e :list){
          if(e.getText().equals(myProfile)){
              return true;
          }

      }
      return false;
 }

 public PersonalInfoPage getPersonalInfoPage() throws InterruptedException {
        driver.findElement(personalInfoLink).click();
        return  new PersonalInfoPage(driver);
 }

 public EducationHistoryPage getEducationHistoryPage()throws InterruptedException{
     driver.findElement(educationHistoryLink).click();
     return  new EducationHistoryPage(driver);
 }

}
