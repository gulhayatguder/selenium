package Exersize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class E03_day02_C06 {
    public static void main(String[] args) {
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com");

        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkelementlerilist=driver.findElements(By.tagName("a"));
        int expectedLinkSayisi=147;
        int actualLinkSayisi=linkelementlerilist.size();
        if (expectedLinkSayisi==actualLinkSayisi){
            System.out.println("Link sayisi testi PASSED");
        }else System.out.println("Link sayisi testi FAILED");

        //4- Products linkine tiklayin
        driver.findElement(By.partialLinkText("Products")).click();


        //5- special offer yazisinin gorundugunu test edin


        //6- Sayfayi kapatin
        driver.close();
    }
}
