//8
package com.company;
import io.appium.java_client.windows.WindowsDriver;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;
//import org.junit.runners.MethodSorters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class NotepadTest {

    static WindowsDriver driver;

    @BeforeAll
    public static void initDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
        capabilities.setCapability("deviceName", "Windows10");
        driver = new WindowsDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

   @AfterAll
    public static void quitDriver() {
        driver.closeApp();
        driver.findElementByName("Don't Save").click();
        driver.quit();
    }
    @Test
    public void test1() {
        WebElement element = driver.findElementByClassName("Edit");
        element.sendKeys("Hello world");
        element.sendKeys(Keys.ENTER);
        element.sendKeys("Time is");
        element.sendKeys(Keys.ENTER);
        element.sendKeys(Keys.F5);
    }

    @Test
    public void test2() throws IOException {
        driver.findElementByName("Edit").click();
        driver.findElementByName("Select All").click();
        File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss, new File("Np.png"));
    }
}



