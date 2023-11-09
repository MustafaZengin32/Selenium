package seleniumday02c;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selenium02 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15L));

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys(new CharSequence[]{"Nutella"});

        aramaKutusu.clear();

        aramaKutusu.sendKeys(new CharSequence[]{"Java"});

        System.out.println(aramaKutusu.getSize());

        System.out.println(aramaKutusu.getTagName());

        System.out.println(aramaKutusu.getAttribute("name"));

        System.out.println(aramaKutusu.getRect().getX());

        System.out.println(aramaKutusu.isDisplayed());

        System.out.println(aramaKutusu.isEnabled());

        aramaKutusu.isSelected();

        driver.close();

}
}