package Exersize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class E04_day03_C01 {
    public static void main(String[] args) {
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements");

        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[@id=\"content\"]")).click();

        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deletebutonElementi= driver.findElement(By.xpath("//*[@id=\"elements\"]"));
        if (deletebutonElementi.isDisplayed()){
            System.out.println("Delete butonu teasti PASSED");
        }else System.out.println("Delete butonu teasti FAILED");

        //4- Delete tusuna basin
        deletebutonElementi.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addElementyazisi=driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
        if (addElementyazisi.isDisplayed()){
            System.out.println("Add yazisi testi PASSED");
        }else  System.out.println("Add yazisi testi FAILED");
    }
}
