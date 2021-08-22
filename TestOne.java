// 5 test 1
package com.company;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
import java.util.List;
    public class TestOne {
        public WebDriver driver = null;

        @BeforeEach
        public void initializeSelenium() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\yelena\\QA-SELENIUM\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

    @Test
        public void testTextBox() throws InterruptedException {
         driver.get("https://demoqa.com/text-box");

        WebElement uName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[1]/div[2]/input"));
        uName.sendKeys("john doe");
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[2]/div[2]/input"));
        email.sendKeys("j@d.com");
        Thread.sleep(3000);
        WebElement caddres = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[3]/div[2]/textarea"));
        caddres .sendKeys("nowhere 51");
        Thread.sleep(3000);
        WebElement paddress = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[4]/div[2]/textarea"));
        paddress.sendKeys("the universe");
        Thread.sleep(3000);
        WebElement submit = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[6]/div/p[4]"));
        submit.click();
        Thread.sleep(5000);

         String text= driver.findElement(By.id("name")).getText();
         Assertions.assertEquals("Name:john doe",text);
         //Thread.sleep(5000);
         String text1= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[6]/div/p[2]")).getText();
         Assertions.assertEquals("Email:j@d.com",text1);
        // Thread.sleep(5000);
         String text2= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[6]/div/p[3]")).getText();
         Assertions.assertEquals("Current Address :nowhere 51",text2);
        // Thread.sleep(5000);
         String text3= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[6]/div/p[4]")).getText();
         Assertions.assertEquals("Permananet Address :the universe",text3);
        // Thread.sleep(5000);
    }
        @AfterEach
        public void cleanUp() {
            driver.quit(); // close the browser
        }
    }

