package seleniumday01b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium04 {



    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(2000L);
        driver.navigate().back();
        Thread.sleep(2000L);
        driver.navigate().forward();
        Thread.sleep(2000L);
        driver.navigate().refresh();
        driver.quit();
    }
    }
