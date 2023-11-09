package seleniumday01a;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Selenium03 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        String actualFacebookTitle = driver.getTitle();
        String expectedFacebookTitle = "facebook";
        if (actualFacebookTitle.equals(expectedFacebookTitle)) {
            System.out.println("Facebook title testi PASS");
        } else {
            System.out.println("Facebook title testi FAILED \nAktuel Facebook title : " + actualFacebookTitle + "\nExpected Facebook Title : " + expectedFacebookTitle);
        }

        String actualFacebookURL = driver.getCurrentUrl();
        String arananFacebookURLKelime = "facebook";
        if (actualFacebookURL.contains(arananFacebookURLKelime)) {
            System.out.println("Facebook URL aranan kelime testi PASS");
        } else {
            System.out.println("Facebook URL aranan kelime testi FAILED");
            System.out.println("Aktuel Facebook URL'i " + arananFacebookURLKelime + " kelimesini icermiyor");
        }

        driver.navigate().to("https://www.walmart.com/");
        String actualWallmartTitle = driver.getTitle();
        String arananKelimeWallmartTitle = "Walmart.com";
        if (actualWallmartTitle.contains(arananKelimeWallmartTitle)) {
            System.out.println("Wallmart title aranan kelime testi PASS");
        } else {
            System.out.println("Wallmart title aranan kelime testi FAILED");
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();
    }
}
