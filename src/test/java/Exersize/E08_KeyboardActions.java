package Exersize;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class E08_KeyboardActions  extends TestBase {
    @Test
    public void test01 (){

        //1- Bir Class olusturalim KeyboardActions1
        //2- https://www.amazon.com sayfasina gidelim
        driver.get("https://www.amazon.com");
        //3- Arama kutusuna actions method’larine kullanarak Samsung A71 yazdirin ve
       WebElement aramaKutusu= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        Actions actions=new Actions(driver);
        actions.click(aramaKutusu).keyDown(Keys.SHIFT)
                .sendKeys("s")
                .keyUp(Keys.SHIFT)
                .sendKeys("amsung")
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("71")
                .sendKeys(Keys.ENTER)
                .perform();

        //Enter’a basarak arama yaptirin
        //4- aramanin gerceklestigini test edin
        String expectetResult="Samsung A71";
        String actualResult=driver.findElement(By.xpath("//*[@id=\"search\"]")).getText();
        Assert.assertTrue(actualResult.contains(expectetResult));


    }
}
