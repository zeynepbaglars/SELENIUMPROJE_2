package MuhammedAli;


import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utlity.BaseDriver.driver;

public class _01_ extends BaseDriver {
    @Test
    public void Test_US_01() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
        register.click();
        MyFunc.Bekle(2);

        WebElement gender = driver.findElement(By.cssSelector("[id='gender-female']"));
        Actions actions = new Actions(driver);
        MyFunc.Bekle(2);
        actions.click(gender).sendKeys(Keys.TAB)
                .sendKeys("Asude").sendKeys(Keys.TAB)
                .sendKeys("Baykal").sendKeys(Keys.TAB)
                .sendKeys("Asudebaykal123@gmail.com").sendKeys(Keys.TAB)
                .sendKeys("Asude123").sendKeys(Keys.TAB)
                .sendKeys("Asude123").sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).build().perform();

        WebElement msg = driver.findElement(By.xpath("//div[@class='result']"));
        Assert.assertTrue("Hesap oluşturulamadı..!!",msg.getText().contains("Your registration completed"));

        BekleVeKapat();
    }

