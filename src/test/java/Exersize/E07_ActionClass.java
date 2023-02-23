package Exersize;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class E07_ActionClass  extends TestBase {
    @Test
    public void test01(){
        //1- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
        //2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin
       WebElement accountlistElementi= driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
        Actions actions=new Actions(driver);
        actions.moveToElement(accountlistElementi).perform();
        //mouse’u bu menunun ustune getirin
        //3- “Create a list” butonuna basin
        driver.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/a[1]/span")).click();
        //4- Acilan sayfada “Your Lists” yazisi oldugunu test edin
        driver.findElement(By.xpath("//*[@id=\"my-lists-tab\"]")).isDisplayed();


    }
}
