// 5 test 4
package com.company;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class WebTablesTest {
        public WebDriver driver = null;

        @BeforeEach
        public void initializeSelenium() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\yelena\\QA-SELENIUM\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        @Test
        public void testTextBox() throws InterruptedException {
            driver.get("https://demoqa.com/webtables");

            WebElement alden = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[7]/div/span[2]"));
            alden.click();
            Thread.sleep(3000);

            String text= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[7]/div/span[2]")).getText();
            Assertions.assertEquals("",text);
        }

        @AfterEach
        public void cleanUp() {
            driver.quit(); // close the browser
        }
    }

