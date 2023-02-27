package Exersize;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class E10_ActionsClass  extends TestBase {
    @Test
    public void test01 (){
        //1. "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
        //2. "Hover over Me First" kutusunun ustune gelin
        Actions actions=new Actions(driver);
        WebElement hoverOver=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/button"));
        actions.moveToElement(hoverOver).perform();

        //3. "Link 1" e tiklayin
        driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/div/a")).click();
        bekle(2);

        //4. Popup mesajini yazdirin
        driver.switchTo().alert().getText();
        bekle(2);
        //5. Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
        bekle(2);

        //6. "Click and hold" kutusuna basili tutun
        WebElement ClickAndHold=driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
        actions.clickAndHold().perform();
        bekle(2);
        //7. "Click and hold" kutusunda cikan yaziyi yazdirin
        WebElement ClickAndHoldButonu=driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
        ClickAndHoldButonu.getText();

        //8. "Double click me" butonunu cift tiklayin
        WebElement doubleClick=driver.findElement(By.xpath("//*[@id=\"double-click\"]/h2"));
        actions.doubleClick().perform();

    }
}
