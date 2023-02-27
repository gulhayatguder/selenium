package Practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q6_odev_1 extends TestBase {
    @Test
    public void test01(){
        //...Exercise3...
        //    go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        WebElement cookies=driver.findElement(By.xpath("//*[@id=\"ez-accept-all\"]"));
        cookies.click();
        //    fill the firstname
        WebElement firstnametextbox =driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input"));
        firstnametextbox.sendKeys("Ayse");

        //    fill the lastname
        WebElement lastnemetextbox=driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[5]/input"));
        lastnemetextbox.sendKeys("Yilmaz");
        //    check the gender
        WebElement genderRadio=driver.findElement(By.xpath("//*[@id=\"sex-0\"]"));
        genderRadio.click();
        //    check the experience
        WebElement experienceRadio=driver.findElement(By.xpath("//*[@id=\"exp-2\"]"));
        experienceRadio.click();
        //    fill the date
        WebElement datetextbox=driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        datetextbox.sendKeys("01-01-2023");

        //    choose your profession -> Automation Tester
        WebElement professincheckbox=driver.findElement(By.xpath("(//*[@name=\"profession\"])[1]"));
        professincheckbox.click();

        //    choose your tool -> Selenium Webdriver
        WebElement toolscheckbox=driver.findElement(By.xpath("//*[@id=\"tool-2\"]"));
        toolscheckbox.click();
        //    choose your continent -> Antartica
        WebElement continent=driver.findElement(By.xpath("//*[@id=\"continents\"]/option[7]"));
        continent.click();

        //    choose your command  -> Browser Commands
        WebElement command=driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]"));
        command.click();
        //    click submit button

        WebElement button=driver.findElement(By.xpath("//*[@name=\"submit\"]"));
        button.click();

    }
}
