package seleniumday01b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.quit();
    }

}
