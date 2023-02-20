package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q05_odev_3 {
    public static void main(String[] args) {
        //.......Exercise5........

        //    Navigate to website https://testpages.herokuapp.com/styled/index.html
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //    Under the ORIGINAL CONTENTS
        //    click on Alerts
        WebElement alerts=driver.findElement(By.xpath("//*[@id=\"alerts\"]"));
        alerts.click();
        //    print the URL
        driver.getCurrentUrl();
        //    navigate back
        driver.navigate().back();
        //    print the URL
        driver.getCurrentUrl();
        //    Click on Basic Ajax
        WebElement ajax=driver.findElement(By.xpath("//*[@id=\"basicajax\"]"));
        ajax.click();
        //    print the URL
        driver.getCurrentUrl();
        //    enter value 20 and ENTER
        WebElement value=driver.findElement(By.xpath("//*[@id=\"lteq30\"]"));
        value.sendKeys("20");
        //    and then verify Submitted Values is displayed open page
        value.isDisplayed();

        //    close driver
        driver.close();

    }
}
