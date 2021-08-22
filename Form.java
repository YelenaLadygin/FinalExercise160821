//3
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

    public static void main(String[] args) throws
            InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yelena\\QA-SELENIUM\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:5500/FORM.html");

        String title = driver.getTitle();//Get the page title
        System.out.println("Page title is: " + title);

        String url = driver.getCurrentUrl();//Get the page Url
        System.out.println("Page address is: " + url);

        WebElement streetname = driver.findElement(By.id("idname"));
        streetname.sendKeys("Har Ha Tzofim");

        WebElement streetnumber = driver.findElement(By.id("idnum"));
        streetnumber.sendKeys("17");

        WebElement city = driver.findElement(By.id("idcity"));
        city.sendKeys("Rehovot");


        WebElement country = driver.findElement(By.id("idcountry"));
        country.sendKeys("Israel");

        driver.findElement(By.name("submit")).click();

        Thread.sleep(30000);

        driver.quit();//Close the browser and ChromeDriver
    }
}
