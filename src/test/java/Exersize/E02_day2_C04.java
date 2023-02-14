package Exersize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class E02_day2_C04 {
    public static void main(String[] args) throws InterruptedException {
        // amazon anasayfaya gidin
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        // arama kutusunu locate edip bir webelement olarak kaydedin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        // id'si twotabsearchtextbox olan webelement seklinde locate edecegiz

        //Arama kutusuna  "Nutella " yazip aratalim
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();
        Thread.sleep(3000);
        driver.close();
    }
}
