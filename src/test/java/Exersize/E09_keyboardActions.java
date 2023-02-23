package Exersize;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class E09_keyboardActions extends TestBase {
    @Test
    public void test01(){
        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body"));


        //2- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("//*[@id=\"u_0_0_u9\"]")).click();
        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
         WebElement isimKutusu=driver.findElement(By.xpath("//*[@id=\"u_9_b_D+\"]"));
        Faker faker=new Faker();
        Actions actions=new Actions(driver);
        String fakeEmailAdresse=faker.internet().emailAddress();
        actions.click(isimKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(fakeEmailAdresse)
                .sendKeys(Keys.TAB)
                .sendKeys(fakeEmailAdresse)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB).sendKeys("45").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        //4- Kaydol tusuna basalim
        bekle(10);

    }
}
