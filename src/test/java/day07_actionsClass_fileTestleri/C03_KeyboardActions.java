package day07_actionsClass_fileTestleri;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_KeyboardActions  extends TestBase {
    @Test
    public void test01(){
        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        //2-Cookies'i kabul edip Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("//button[@data-cookiebanner=‘accept_only_essential_button’]")).click();//cokies butonu
        WebElement findElementButonu=driver.findElement(By.xpath("//*[@id=\"u_0_2_Ru\"]"));
        findElementButonu.click();

        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        //4- Kaydol tusuna basalim
    }
}
