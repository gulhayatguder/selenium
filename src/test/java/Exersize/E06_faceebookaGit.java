package Exersize;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class E06_faceebookaGit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com ");


        //2- cookies cikarsa kabul et butonuna bas

       driver.findElement(By.xpath("//*[@id=\"u_0_e_Gw\"]")).click();
        //3- e- posta kutusuna rasgele bir mail girin
       WebElement ePostaKutusu= driver.findElement(By.xpath("//*[@id=\"email\"]"));
        ePostaKutusu.sendKeys("asdetghfzugjngih,khm");
        //4- sifre kismina rasgele bir mail girn.
        WebElement sifreKutusu=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        sifreKutusu.sendKeys("12345234");
        // 5- Giris yap butonuna bas
        driver.findElement(By.xpath("//*[@id=\"u_0_5_vQ\"]")).click();
        // 6- uyari olarak"The mail or mobile number you enterent isn't....." mesajinin ciktigini test edin.
        driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]"));

        // 7- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
