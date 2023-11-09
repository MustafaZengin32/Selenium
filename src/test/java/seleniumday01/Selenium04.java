package seleniumday01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selenium04 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://hepsiburada.com");

        driver.get("http://instagram.com");

        driver.get("http://youtube.com");

        driver.navigate().back();

        driver.navigate().back();

        String expectedurl = "hepsiburada";

        String actualurl = driver.getCurrentUrl();

        Thread.sleep(3000);

        if (actualurl.contains(expectedurl)) {
            System.out.println("Url testi gecti PASS");
        } else {
            System.out.println("Url testi kaldi FAILED");
            System.out.println("Actual Title aslinda " + actualurl);
        }

        Thread.sleep(3000);

        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());

        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(0, 60));

        driver.manage().window().setSize(new Dimension(800, 800));

        Dimension actualYeniSize = driver.manage().window().getSize();

        int yeniHeigh = actualYeniSize.height;

        int yeniWidth = actualYeniSize.width;

        if (yeniHeigh == 800 && yeniWidth == 800) {
            System.out.println("Size testi gecti PASS");
        } else {
            System.out.println("Size testi kaldi FAILED");
            System.out.println("Actual Size aslinda " + yeniWidth + " ve " + yeniHeigh);
        }

        Point actualPosition = driver.manage().window().getPosition();

        int x1 = actualPosition.x;
        int y1 = actualPosition.y;

        if (x1 == 0 && y1 == 60) {
            System.out.println("Positon testi gecti PASS");
        } else {
            System.out.println("Positon testi kaldi FAILED");
            System.out.println("Actual Positon aslinda " + x1 + " ve " + y1);
        }


    }   }
