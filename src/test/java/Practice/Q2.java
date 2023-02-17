package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {
    public static void main(String[] args) {
        //.............Exercise2..................
        // 1 - Driver olusturalim
        WebDriver driver =new ChromeDriver();
        // 2 - Java class'imiza chromedriver.exe'yi tanitalim

        // 3 - Driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();
        // 4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
        //     söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        // 5 - "https://www.otto.de" adresine gideli
        driver.get("https://www.otto.de");

        // 6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
       String ottoTitle= driver.getTitle();
       String ottoURL= driver.getCurrentUrl();
        // 7 - Title ve url'nin "OTTO" kelimesinin icerip icermedigini kontrol edelim


        // 8 - Ardindan "https://wisequarter.com/" adresine gidelim
        // 9 - Bu adresin basligini alalim ve "Quarter" kelimesini icerip icermedigini
        //     kontrol edelim
        // 10- Bir onceki web sayfamiza geri donelim
        // 11- Sayfayi yenileyelim
        // 12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        // 13- En son adim olarak butun sayfalarimizi kapatmis olalim
    }
}
