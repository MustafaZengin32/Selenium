package seleniumday02awebelementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Selenium02 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.amazon.com");

        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));

        List<WebElement> tag=driver.findElements(By.tagName("input"));

        System.out.println(tag.size());

        Thread.sleep(3000);

        //linkedtext

        //href="/adresses">Adresses</a> : Buradaki Adresses alinir

        //partialLinktext : Burada esses aliriz mesela text in bir kismini

        //sendkeys yazi gonderme

        //Keys.ENTER

        //click

        //search.isDisplayed();

        //search.clear();

        //search.getText();

        //search.isEnabled();



        //








    }
}
