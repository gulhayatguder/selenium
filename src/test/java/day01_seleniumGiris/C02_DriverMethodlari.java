package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        /*jar dosyalarini yukleyerek seleniumu kullanilir hale getirdik
         ancak her bir class'in hangi browser ile calismasini istiyorsak
         o browser ile ilgili  driver'i tanimlamamiz lazim
         Browser ile ilgili tercihimiz dogrultusunda ilgili ayarlari yapmak icin
         Java'daki System class'indan setProperty() kullanilabilir

          method'a 2 parametre ekleyecegiz
            1.parametre herkes icin ayni : webdriver.chrome.driver
            2.parametre bu driver'in dosya yolu
              herkesin bilgisayarinda farkli olabilir
              windows bilgisayarlarda sonunda .exe yazilmalidir
              mac'lerde .exe olmaz


           */
        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       // istenen sayfaya gitmak icin
        driver.get("https://amazon.com");
        Thread.sleep(3000);
        driver.close();
    }
}
