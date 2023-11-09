package seleniumday02c;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Selenium01 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15L));

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys(new CharSequence[]{"city bike"});

        aramaKutusu.submit();//ya da enter a basabilirdik

        List<WebElement> sonucWebelementListe = driver.findElements(By.className("sg-col-inner"));

        /*for (WebElement w:sonucWebelementListe
             ) {
            System.out.println(w.getText());

        }

         */

        System.out.println(((WebElement)sonucWebelementListe.get(0)).getText());
        System.out.println(((WebElement)sonucWebelementListe.get(1)).getText());

        driver.findElement(By.className("s-image")).click();

        Thread.sleep(5000L);

        driver.close();
    }
}
