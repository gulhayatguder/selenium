package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
    public static void main(String[] args) {

        //...........Exercise1.........
        //   1- Create a new class under Q1 create main method
        //   2- Set Path
        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        //   3-Create chrome driver
        WebDriver driver= new ChromeDriver();// Bu adimda hangi tarayici da calisacagimizi belirliyoruz. Cross teknikte ihtiyacimiz olacak
                             //Selenium otomatik destegi 3 Browser icindir.
                             // Chrome, FireFox ve Edge.
                             //Eger bu 3 ü disinda bir browser kullanmak gerekiyorsa.
                             // Driver’ini indirip System.setProperty(“driverini yazyoruz”,” driverin bulundugu yolunu yaziyoruz”); kullanmamaiz gerekiyor.

        //    Maximize the window
        driver.manage().window().maximize();
        //    Open google home page https://www.google.com/.
        driver.get("https://www.google.com");// ilk etapta get mi navigate mi nasil karar veriyoruz?
                                             //Get methodu  daha hizli calisir. Navigate ise bagimli senaryolarda tercih edilir


        //    On the same class, Navigate to amazon home page https://www.amazon.com/ Navigate back to google

        driver.navigate().to("https://www.amazon.com");
        //    Navigate forward to amazon
        driver.navigate().forward();

        //    Refresh the page

        driver.navigate().refresh();

        //    Close/Quit the browser

        driver.quit();// close bulunan son sayfayi quit ise butun sekmeleri  kapatir

        //    And last step : print "All Ok" on console
        System.out.println("All Ok");

    }


}
