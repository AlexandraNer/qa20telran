
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

    public class TestOpenTelRan {
        WebDriver dr;
        @BeforeClass
        public void setUp(){
            dr = new ChromeDriver();
            dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        @Test
        public void openTelRan() throws InterruptedException {
            dr.navigate().to("https://www.google.com/");
            dr.findElement(By.name("q")).sendKeys("tel ran");
            //Thread.sleep(10000);
            //dr.findElement(By.xpath("//b[contains(text(),'tel ran')]"));
            dr.findElement(By.xpath("//div[@class='VlcLAe']//input[@name='btnK']")).click();
            dr.findElement(By.xpath("//cite[@class='iUh30']//span[contains(text(),'https://www.tel-ran.com/')]")).click();
            //dr.findElement(By.cssSelector("#comp-j6ooj3kk3label")).click();

        }
        @AfterClass
        public void tearDown(){
            dr.quit();
        }
    }


