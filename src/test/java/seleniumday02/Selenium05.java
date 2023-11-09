package seleniumday02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium05 {
    public static void main(String[] args) throws InterruptedException {
        //elemente bazen direk ulasmak imkansiz ya da zor olabilir
        //eczaneden saga don bakkaldan sola don gibi tarif vermek zorunda kalabiliriz
        //sartlari ortak tag name olmasi

        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        Thread.sleep(2000);

        WebElement Nyc= driver.findElement(By.cssSelector("img[src='bots/sl-statue-of-liberty-bot.png']"));

        WebElement Boston= driver.findElement(By.xpath("(//img[@class='ui-li-thumb'])[6]"));

        //Burada mesela Berlin i tarif edelim NYC nin altinda Boston in saginda
        //Ancak relativ locator kullanmak icin tag nameleri ayni olmali mesela burada hepsinin ki li



        WebElement berlin= driver.findElement(with(By.tagName("li")).below(Nyc).toRightOf(Boston));

        Thread.sleep(3000);


        berlin.click();












    }
}
