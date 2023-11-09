package seleniumday01agiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium03 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src//main//resources//driver//chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://hepsiburada.com.tr");

        String expectedtitle="hepsiburada";
        String actualtitle=driver.getTitle();

        if(actualtitle.equalsIgnoreCase(expectedtitle)){
            System.out.println("Title testi gecti PASS");
        }

        else {
            System.out.println("Title testi kaldi FAILED");
            System.out.println("Actual Title aslinda "+actualtitle);
        }

        String expectedurl ="hepsiburada";
        String actualurl =driver.getCurrentUrl();

        if (actualurl.contains(expectedurl)) {
            System.out.println("URL testi gecti PASS");
        }
        else {
            System.out.println("URL testi kaldi FAILED");
            System.out.println("Actual URL aslinda "+actualurl);
        }

        Thread.sleep(2000);

        driver.navigate().to("http://amazon.com");

        driver.navigate().back();

        driver.navigate().refresh();

        driver.navigate().forward();

        driver.manage().window().maximize();

        Thread.sleep(2000);

        String actualamazontitle=driver.getTitle();
        String expectedamazontitle="Amazon";

        if (actualamazontitle.contains(expectedurl)) {
            System.out.println("amazon title  testi gecti PASS");
        }
        else {
            System.out.println("amazon title testi kaldi FAILED");
            System.out.println("Actual amazon title aslinda "+actualamazontitle);
        }

        Thread.sleep(2000);

        String actualamazonurl=driver.getCurrentUrl();
        String expectedamazonurl="http://amazon.com";

        if (actualamazonurl.equals(expectedamazonurl)) {
            System.out.println("amazon url  testi gecti PASS");
        }
        else {
            System.out.println("amazon url testi kaldi FAILED");
            System.out.println("Actual amazon url aslinda "+actualamazonurl);
        }



        driver.quit();






    }
}
