//5 test 3
package com.company;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class RadioButtonTest {
    public WebDriver driver = null;

    @BeforeEach
    public void initializeSelenium() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yelena\\QA-SELENIUM\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void testTextBox() throws InterruptedException {
        driver.get("https://demoqa.com/radio-button");

        WebElement yes = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/label"));
        yes.click();
        Thread.sleep(3000);

        String text= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/label")).getText();
        Assertions.assertEquals("Yes",text);
    }

    @AfterEach
    public void cleanUp() {
        driver.quit(); // close the browser
    }
}
