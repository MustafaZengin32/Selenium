package seleniumday02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selenium04 {

    public static void main(String[] args) throws InterruptedException {

        //xpath i text ile almak

        //text i "Premium Indirim Gunleri"

        //xpath= //span[text()='Premium Indirim Gunleri'];

        //xpath= //span[.='Premium Indirim Gunleri'];//ya da text yerine . yazilir

        //span[.=contains(text() ,'Ev, Yaşam')] text deki herhangi ibareyi alabiliriz , birden fazla mi dikkat

        //css selector xpath gore daha hizli

        //css = tagName[attribute name='value’] xpath=//tagName[@attribute='value'];

        //css de xpath den farkli olarak // ve @ yok

        //css id almak "tagname#id" value ya da css="#id value"

        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //driver.get("http://www.hepsiburada.com");

        //WebElement search=driver.findElement(By.cssSelector("#SearchBoxOld_a7c3a770-a442-4bf2-66c0-43f8875a1347"));

        //search.getText(); web elementteki yaziyi getirir

        //search.getTagName(); tag ismini getirir

        //search.isEnabled(); web element erisilebilir mi onu kontrol eder

        //search.isDisplayed(); web element gorunur mu onu kontrol eder

        //search.isSelected(); web element secili mi diye kontrol eder

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        Thread.sleep(3000);

        WebElement adElement= driver.findElement(By.cssSelector("button[onclick='addElement()']"));

        adElement.click();

        Thread.sleep(3000);

        WebElement delete= driver.findElement(By.xpath("//button[text()='Add Element']"));

        if(delete.isDisplayed()){

            System.out.println("delete butonu gorundu");
        }

        else {
            System.out.println("malesef delete gorunmedi");
        }

        Thread.sleep(3000);

        WebElement addremoveYazisi=driver.findElement(By.xpath("//div/h3[.='Add/Remove Elements']"));

        if(addremoveYazisi.isEnabled()){

            System.out.println("Add/Remove Elements erisilebilir");
        }

        else {
            System.out.println("malesef Add/Remove Elements yazisina erisilemez");
        }

        //bazen elemente ulasilamaz gorunene kadar roll u asagi indirmek icin kullanilir


        //Özetle, isDisplayed() bir öğenin görünürlüğünü kontrol ederken,
        // isEnabled() bir öğenin etkinliğini kontrol eder.

        //add butonuna bastim sonra delete cikti isDisplay ile delete i kontrol ettim
        //delete basinca yukarda bir yazi cikti onu da isEnable ile kontrol ettim























    }
}
