package Exersize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class E01_day2_C03 {
    public static void main(String[] args) {
      //  1.Yeni bir class olusturalim (Homework)
//2.ChromeDriver kullanarak, facebook sayfasina gidin
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");
//ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
     String expectetTitel="facebook";
     String actualTitle=driver.getTitle();
     if (expectetTitel.equals(actualTitle)){
         System.out.println("Facebook title testi PASSED");
     }else System.out.println("Facebook title testi FAILED");
//3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String expectetUrlTesti="facebook";
        String actualUrlTesti=driver.getCurrentUrl();
        if (actualUrlTesti.contains(expectetUrlTesti)){
            System.out.println("Facebook URL testi PASSED");
        }else System.out.println("Facebook URL testi FAILED");
//4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");
//5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String walmartExpecteTitelTesti="Walmart.com";
        String walmartActualTitelTesti=driver.getTitle();
        if (walmartActualTitelTesti.contains(walmartExpecteTitelTesti)){
            System.out.println("Walmart  title testi PASSED");
        }else System.out.println("Walmart  title testi FAILED");
//6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
//7. Sayfayi yenileyin
        driver.navigate().refresh();
//8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
//9.Browser’i kapatin
        driver.close();
    }
}
