package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    private WebDriver driver;
    private By email = By.xpath("//input[@name='Email']");
    private By password = By.xpath("//input[@name='Password']");
    private By loginBtn = By.xpath("//div[@class='login-btn--wrapper']//button");
    HomePage homePage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // 3. page actions: features(behavior) of the page the form of methods:

    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public void enterUsernameAndPassword(String uname, String pwd) throws InterruptedException {
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        scrollIntoView(driver.findElement(By.xpath("//div[@class='login-btn--wrapper']//button")), driver);
        // driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.findElement(email).sendKeys(uname);
        driver.findElement(password).sendKeys(pwd);
    }


    public void clickOnLogin() {
        driver.findElement(By.xpath("//div[@class='login-btn--wrapper']//button")).click();
    }



    public HomePage doLogin(String uname, String pwd) throws InterruptedException {
        System.out.println("User login with:" + uname + " and " +pwd);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         scrollIntoView(driver.findElement(By.xpath("//div[@class='login-btn--wrapper']//button")), driver);
        driver.findElement(email).sendKeys(uname);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginBtn).click();
        return new HomePage(driver);

    }

    public static void scrollIntoView(WebElement element, WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
