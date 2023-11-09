package seleniumday01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium02 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src//main//resources//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver(); //Web Driverdan bir Chrome Driver objesi olusturduk

        driver.get("http://www.hepsiburada.com.tr");

        String title=driver.getTitle();

        System.out.println(title);












    }
}
