package nCDay01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverMethods {
    WebDriver driver;
    String https="https://";
    @Before
    public void  setUp(){
        WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



    }
    @Test
    public void test01(){
        driver.get(https+"www.google.com");
        driver.navigate().to(https+"amazon.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandle());
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println(driver.getWindowHandle());
        driver.get(https+"google.com");
        driver.switchTo().newWindow(WindowType.TAB);


        driver.switchTo().newWindow(WindowType.WINDOW);

    }

    @After
    public void  tearDown(){
      //  driver.close();
        driver.quit();

    }
}
