package seleniumday02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class Selenium03 {

    public static void main(String[] args) throws InterruptedException {

        //Absolut xpath : En tepedeki parenttan asagi gelerek alinir

        //Relative xpath en yaygin kulllanilir

        // //tagName[@attribute='value'];

        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.n11.com");

        Thread.sleep(3000);


        WebElement search=driver.findElement(By.xpath("//input[@id='searchData']"));

        search.sendKeys("Iphone"+ Keys.ENTER);








    }
}
