package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage {
 private WebDriver driver;
 private By navList = By.xpath("//div[@class='app-header__nav']//ul//li");

 private  By personalInfoLink = By.xpath("//ul[@role='tablist']//li[1]");
 private By educationHistoryLink =  By.xpath("//ul[@role='tablist']//li[2]");

 public  HomePage(WebDriver driver){
     this.driver = driver;

 }

 public String getHomeTitle(){
     return driver.getTitle();
 }

 public boolean myProfileTagIsDisplayed(String myProfile) throws InterruptedException {
     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     Thread.sleep(5000);
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
     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     Thread.sleep(5000);
        driver.findElement(personalInfoLink).click();
        return  new PersonalInfoPage(driver);
 }

 public EducationHistoryPage getEducationHistoryPage()throws InterruptedException{
     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     Thread.sleep(5000);
     driver.findElement(educationHistoryLink).click();
     return  new EducationHistoryPage(driver);
 }

}
