package day04_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_BeforeAfterclass {
    // 3 test method'u olusturun
    // 1.amazon anasayfaya gidip, amazona gittiginizi test edin
    // 2.Nutella aratip arama sonuclarinin nutella icerdigini test edin
    // 3.Ilk urune tiklayip, urun isminde Nutella gectigini test edin
    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterClass
    public void test01(){
        // 1.amazon anasayfaya gidip, amazona gittiginizi test edin
        driver.get("https://www.amazon.com");
        String expectetIcerik="amazon";
        String actualURL=driver.getCurrentUrl();

    }


}
