package seleniumday02b;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        WebElement textBox = driver.findElement(By.id("twotabsearchtextbox"));

        textBox.sendKeys(new CharSequence[]{"city bike" + Keys.ENTER});

        WebElement results = driver.findElement(By.xpath("//*[@id='search']/span/div/span/h1/div/div[1]/div/div/span[1]"));

        System.out.println("Listelenen urunlerin sayisi = " + results.getText());

        driver.navigate().to("https://www.amazon.com/Shopping/b?ie=UTF8&node=9408875011");

        WebElement shopping = driver.findElement(By.id("nav-search-submit-button"));

        shopping.click();

        WebElement clickPhoto = driver.findElement(By.className("s-image"));

        clickPhoto.click();

        Thread.sleep(2000L);

        driver.quit();

    }
}
