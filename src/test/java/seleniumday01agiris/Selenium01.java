package seleniumday01agiris;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {

    static WebElement googlecookiesaccept=null;


    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver","src//main//resources//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver(); //Web Driverdan bir Chrome Driver objesi olusturduk

        driver.get("http://www.google.com");

        Thread.sleep(2000);




        //driver.navigate().back(); // Burda ilk gidisi navigate ile degilde get ile yaptigim icin back islev
                                    //gostermez

        /*
        Not:Bu ozellik sadece shadow olan cookies sekmelerinde gecerlidir , aksine trt catch kullanilir
        Burada SearchContext den driver araciligi ile getShadowRoot yontemini ile cookiesleri otomatik kanul ya da red
        edebiliriz. Ilk olarak accept ya da rejekt butonlarina ait ana class i alip onun icinde bu elementleri arariz

        SearchContext searchContext=driver.findElement(By.xpath("//div[@id='CXQnmb']")).getShadowRoot();//genel class
        WebElement rejectbutton=searchContext.findElement(By.linkText("//div[text()='Alle ablehnen']"));//sadece reject button
        WebElement acceptbutton=searchContext.findElement(By.linkText("//div[text()='Alle akzeptieren']"));//sadece accept button

        rejectbutton.click();
        Thread.sleep(3000);

         */


        driver.manage().window().maximize();

        //driver.manage().window().minimize();

        //driver.manage().window().fullscreen();//Fullscreen de ust pencere gorunmez maximize de gorulur


        Thread.sleep(2000);



        try {
            WebElement googlecookiesaccept=driver.findElement(By.xpath("//*[text()='Alle ablehnen']"));

            googlecookiesaccept.click();
        }
        catch (Exception e) {

            System.out.println("Google Cookies Cikmadi");
        }

        Thread.sleep(2000);

       driver.navigate().to("http://www.hepsiburada.com.tr");//get den farkli ileri geri yapabiliriz

       driver.navigate().back();

       driver.navigate().forward();

        driver.navigate().refresh();

        String kaynakkodu=driver.getPageSource();//Sayfanin kaynak kodlarinin tamamini yazdirir

        //System.out.println(kaynakkodu);

        driver.close();













    }


}
