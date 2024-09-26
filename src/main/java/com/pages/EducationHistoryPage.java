package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EducationHistoryPage {
    private WebDriver driver;
    By educationHistoryHeading = By.xpath("//h2//slot");
By collegeOrUnivercityName = By.xpath("//input[@class='element__input']");
By startDate = By.xpath("//input[@name='College_Start_Date__c']");
By endDate = By.xpath("//input[@name='College_End_Date__c']");
By majorOrFieldOfStudy = By.xpath("//input[@name='College_Major__c']");

    public EducationHistoryPage(WebDriver driver){
        this.driver = driver;
    }

    public String getEducationHistoryTitle(){
        return driver.getTitle();
    }
    public Boolean checkHeading(String heading){
        if(driver.findElement(educationHistoryHeading).getText().equals(heading)){
            return true;
        }
        return false;
    }

    public void fillEducationDetails(String collegeOrUnivercityNm, String dateBegun, String dateEnd, String majorFieldOfStudy ){
        driver.findElement(collegeOrUnivercityName).clear();
        driver.findElement(collegeOrUnivercityName).sendKeys(collegeOrUnivercityNm);

        driver.findElement(startDate).clear();
        driver.findElement(startDate).sendKeys(dateBegun);

        driver.findElement(endDate).clear();
        driver.findElement(endDate).sendKeys(dateEnd);

        driver.findElement(majorOrFieldOfStudy).clear();
        driver.findElement(majorOrFieldOfStudy).sendKeys(majorFieldOfStudy);
    }
}
