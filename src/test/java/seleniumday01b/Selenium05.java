package seleniumday01b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selenium05 {

    public static void main(String[] args) throws InterruptedException {



     System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

     WebDriver  driver = new ChromeDriver();


     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

     driver.manage().window().maximize();

     driver.manage().window().fullscreen();

     System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
     System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

     Thread.sleep(2000L);

     driver.manage().window().maximize();
     System.out.println("maximize position " + driver.manage().window().getPosition());
     System.out.println("maximize size" + driver.manage().window().getSize());

     Thread.sleep(2000L);

     driver.manage().window().minimize();
     System.out.println("minimize position " + driver.manage().window().getPosition());
     System.out.println("minimize size" + driver.manage().window().getSize());

     Thread.sleep(2000L);

     driver.close();



    }
}