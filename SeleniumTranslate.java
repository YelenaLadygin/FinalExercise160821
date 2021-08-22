//2
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTranslate {

     public static void main(String[] args) throws InterruptedException {
        //Config the webdriver.chrome.driver which is a permanent key with the path value
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yelena\\QA-SELENIUM\\chromedriver.exe");
        //The web driver is an interface. The ChromeDriver inherits the WebDriver. ChromeDriver will open the chrome browser for us.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//Make the browser open on the whole screen
        driver.get("http://morfix.co.il");//Open the specified url in the browser

        String title = driver.getTitle();//Get the page title
        System.out.println("Page title is: " + title);//Print title to the console

        String url = driver.getCurrentUrl();
        System.out.println("Page address is: " + url);//Print url to the console

       Thread.sleep(2000);

        WebElement input= driver.findElement(By.id("searchField"));
        input.sendKeys("software");

       Thread.sleep(2000);

       driver.findElement(By.id("btnSearch")).click();

       Thread.sleep(2000);

        driver.quit();
    }
}


