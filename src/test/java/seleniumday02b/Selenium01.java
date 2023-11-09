package seleniumday02b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenium01 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com");

        WebElement signInLinki = driver.findElement(By.linkText("Sign in"));

        signInLinki.click();

        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);

        WebElement emailTextBox = driver.findElement(By.id("session_email"));

        WebElement passwordTextBox = driver.findElement(By.id("session_password"));

        WebElement signInButonu = driver.findElement(By.name("commit"));

        emailTextBox.sendKeys(new CharSequence[]{"testtechproed@gmail.com"});

        passwordTextBox.sendKeys(new CharSequence[]{"Test1234!"});

        signInButonu.click();

        WebElement kullaniciAdi = driver.findElement(By.className("navbar-text"));

        if (kullaniciAdi.isDisplayed()) {

            System.out.println("kullanici adi testtechproed@gmail.com PASS");
        } else {
            System.out.println("kullanici adi testtechproed@gmail.com FAILED");
        }

        WebElement adresLinki = driver.findElement(By.linkText("Addresses"));
        if (adresLinki.isDisplayed()) {

            System.out.println("Adres linki gorundu testi PASS");
        } else {
            System.out.println("Adres linki gorundu testi FAILED");
        }

        WebElement signOutText = driver.findElement(By.linkText("Sign out"));

        if (signOutText.isDisplayed()) {

            System.out.println("Sign out gorundu testi PASS");
        } else {
            System.out.println("sign out gorundu testi FAILED");
        }

        List<WebElement> linkListesi = driver.findElements(By.tagName("a"));
        System.out.println("sayfada " + linkListesi.size() + " tane link var");
        System.out.println("sayfadaki linkler");
        Iterator var10 = linkListesi.iterator();

        while(var10.hasNext()) {
            WebElement w = (WebElement)var10.next();
            System.out.println(w.getText());
        }


        driver.close();
    }
}
