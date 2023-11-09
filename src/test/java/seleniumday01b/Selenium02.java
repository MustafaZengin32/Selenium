package seleniumday01b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium02 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        String expectedUrlIcerik = "Amazon";
        String actualUrl = driver.getCurrentUrl();
        String expectedTitleIcerik = "amazon";
        String actualTitle = driver.getTitle();
        if (actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("Url test PASSED");
        } else {
            System.out.println("Url test FAILED");
            System.out.println("actual Url : " + actualUrl);
            System.out.println("Actual Url aranan " + expectedUrlIcerik + " kelimesini icermiyor");
        }

        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Title Testi PASSED");
        } else {
            System.out.println("Title testi FAILED");
            System.out.println("Actual Title : " + actualTitle);
            System.out.println("Actual title aranan " + expectedTitleIcerik + " kelimesini icermiyor");
        }

    }
}
