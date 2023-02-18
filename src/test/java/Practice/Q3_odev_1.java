package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3_odev_1 {
    public static void main(String[] args) {
        //...Exercise3...
        //    go to url : https://www.techlistic.com/p/selenium-practice-form.html
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15));
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        WebElement cerezbuton=driver.findElement(By.xpath("//*[@id=\"ez-accept-all\"]"));
        cerezbuton.click();

        //    fill the firstname
        WebElement firtnamebuton=driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input"));
        firtnamebuton.sendKeys("Ayse");

        //    fill the lastname
        WebElement lastnamebuton=driver.findElement(By.xpath("//*[@name='lastname']"));
        lastnamebuton.sendKeys("Guzel");

        //    check the gender
        WebElement genderradio=driver.findElement(By.xpath("//*[@id='sex-1']"));
        genderradio.click();

        //    check the experience
        WebElement Experienceradio=driver.findElement(By.xpath("//*[@id='exp-2']"));
        Experienceradio.click();

        //    fill the date
        WebElement datebuton=driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        datebuton.sendKeys("11.04.1990");

        //*   choose your profession -> Automation Tester
       WebElement automationtester=driver.findElement(By.xpath("//*[@id=\"profession-1\"]"));
        automationtester.click();

        //    choose your tool -> Selenium Webdriver
        WebElement seleniumWebdriverradio=driver.findElement(By.xpath("//*[@id=\"tool-2\"]"));
        seleniumWebdriverradio.click();

        //    choose your continent -> Antartica
        WebElement continent=driver.findElement(By.xpath("//*[@id=\"continents\"]"));
        continent.click();

        //    choose your command  -> Browser Commands
        WebElement Commands=driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]"));

        //    click submit button
        WebElement submitbutton=driver.findElement(By.xpath("//*[@class='btn btn-info']"));
        submitbutton.click();

        driver.close();

    }
}
