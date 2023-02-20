package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q04_odev_2 {
    public static void main(String[] args) {
        //...............Exercise4..............
        //Navigate to  https://testpages.herokuapp.com/styled/index.html

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //Click on  Calculater under Micro Apps
        WebElement calculator=driver.findElement(By.xpath("//*[@id=\"calculatetest\"]"));
            calculator.click();
        //Type any number in the first input
         WebElement number1=driver.findElement(By.xpath("//*[@id=\"number1\"]"));
         number1.sendKeys("15");
        //Type any number in the second input
        WebElement number2=driver.findElement(By.xpath("//*[@id=\"number2\"]"));
        number2.sendKeys("5");
        //Click on Calculate
        WebElement calculate=driver.findElement(By.xpath("//*[@id=\"calculate\"]"));
        calculate.click();
        //Get the result
       WebElement answer=driver.findElement(By.xpath("/html/body/div/div[3]/div/p"));
       answer.getText();
        //Print the result
        System.out.println(" Islem sonucu= "+answer.getText());
    }
}
