package selenium01b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(5000L);
        System.out.println("sayfa url'i : " + driver.getCurrentUrl());
        System.out.println("Sayfanin title'i : " + driver.getTitle());
        driver.close();
    }
}
