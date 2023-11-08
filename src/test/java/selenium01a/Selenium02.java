package selenium01a;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium02 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String actualResult = driver.getTitle();
        String expectedResult = "google";
        if (actualResult.equals(expectedResult)) {
            System.out.println("Page Title testi PASS");
        } else {
            System.out.println("Page Title testi FAILED");
            System.out.println("Actual Page Title : " + actualResult);
        }

        driver.navigate().to("https://www.youtube.com/");
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.youtube.com";
        if (actualURL.equals(expectedURL)) {
            System.out.println("URL testi PASS");
        } else {
            System.out.println("URL testi FAILED");
            System.out.println("Actual URL : " + actualURL);
        }

        driver.close();
    }


}
