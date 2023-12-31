package seleniumday01c;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selenium06 {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.manage().window().maximize();

        Thread.sleep(2000L);

        driver.manage().window().setSize(new Dimension(1000, 700));

        driver.manage().window().setPosition(new Point(100, 100));

        Thread.sleep(2000L);

        driver.manage().window().setPosition(new Point(300, 300));

        Thread.sleep(2000L);

        driver.close();




    }
}