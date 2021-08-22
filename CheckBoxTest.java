// 5 test 2
package com.company;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class CheckBoxTest {

    public WebDriver driver = null;

    @BeforeEach
    public void initializeSelenium() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yelena\\QA-SELENIUM\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testTextBox() throws InterruptedException {
        driver.get("https://demoqa.com/checkbox");

        WebElement home = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/ol/li/span/label/span[1]"));
        home.click();
        Thread.sleep(3000);

        String text= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/span[1]")).getText();
        Assertions.assertEquals("You have selected :",text);

    }

    @AfterEach
    public void cleanUp() {
        driver.quit(); // close the browser
    }
}


