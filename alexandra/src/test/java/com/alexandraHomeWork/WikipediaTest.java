package com.alexandraHomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WikipediaTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void searchWiki() throws InterruptedException{
        driver.get("https://www.google.com");
        Thread.sleep(10000);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
