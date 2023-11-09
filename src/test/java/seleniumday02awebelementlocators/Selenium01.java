package seleniumday02awebelementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selenium01 {
    public static void main(String[] args) throws InterruptedException {

        //HTML de esitligin solu Atribute sagi tribute Value

        //Web elementleri essiz bulmak gerekir

        //8 adet metod var

        //xpath css popular , ancak ancak mulakatlarda id demek gerekir unique olmasi icin

        //1.iD :Ilk olarak elementin unique olup olmadigini kontrol ederiz ,eger ayni bir tane id varsa elemmenti id
        //ile aliriz

        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://www.amazon.com");

        WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));

        //WebElement searchbox=driver.findElement(By.name("field-keywords"));


        //Baska yerde id olarak kullanilmazsa by id kullanilir ,
        // id olmadiktan sonra baska bir elemntin attribute value su olmasi sorun olmaz


        searchbox.sendKeys("Iphone");

        Thread.sleep(3000);

        driver.get("https://www.hepsiburada.com");

        Thread.sleep(5000);

        WebElement searchBoxhepsiburada=driver.findElement(By.className("theme-IYtZzqYPto8PhOx3ku3c"));




        driver.quit();








    }
}
