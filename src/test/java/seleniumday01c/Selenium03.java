package seleniumday01c;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium03 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println(driver.getWindowHandle());

        System.out.println(driver.getWindowHandles());

        driver.get("https://www.amazon.com");

        System.out.println(driver.getPageSource());

        driver.close();
    }
}
