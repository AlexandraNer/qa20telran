package com.telranQa20GradleSwleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SearchGoogle {
    WebDriver driver;
@BeforeClass
    public void setUp(){
    driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test
    public void googleSearch() throws InterruptedException {
    driver.navigate().to("https://www.google.com/");
    driver.findElement(By.name("q")).sendKeys("WebDriver");
    Thread.sleep(10000);

}
    @Test
    public void googleSearch1() throws InterruptedException {
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.id("gsr")).click();
        //Thread.sleep(10000);

    }

@AfterClass
    public void tearDown(){
    driver.quit();

}
}
