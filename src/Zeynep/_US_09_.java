package Zeynep;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _US_09_ extends BaseDriver {
    @Test
    public void test() {
        ///!!!!ÇALIŞTIRMADAN ÖNCE MAİLİ VE ŞİFREEYİ  DEĞİŞTİRİN
        //!!!!Tek atımlık olduğu için tekrar denemek için kayıtlı fake mail :asude19sd@gmail.com
        //şifresi :asude19sd


        driver.get("https://demowebshop.tricentis.com/");

//      login olma//feyzadan aldım :)
        WebElement LogIn = driver.findElement(By.xpath("//a[@href='/login']"));
        LogIn.click();
        MyFunc.Bekle(5);

        WebElement mail = driver.findElement(By.id("Email"));
        mail.sendKeys("assude1547@gmail.com");
        MyFunc.Bekle(5);

        WebElement sifre = driver.findElement(By.id("Password"));
        sifre.sendKeys("assude1s");
        MyFunc.Bekle(2);

        WebElement sub = driver.findElement(By.xpath("//input[@value='Log in']"));
        sub.click();
        MyFunc.Bekle(5);


//      Oylama Yapma Kısmı
        WebElement ex = driver.findElement(By.id("pollanswers-1"));
        ex.click();
        WebElement vote = driver.findElement(By.cssSelector("[value='Vote']"));
        vote.click();
        wait.until(ExpectedConditions.textToBe(By.cssSelector("[class='poll-display-text']"), "Do you like nopCommerce?"));
        for (int i = 1; i <= 4; i++) { // XPath indeksi 1'den başlar
            String text = "//ul[@class='poll-results']/li[" + i + "]";
            WebElement choice = driver.findElement(By.xpath(text));
            System.out.println(choice.getText());
        }
        WebElement votes = driver.findElement(By.cssSelector("[class='poll-total-votes']"));
        Assert.assertTrue("oylama hatalı", votes.getText().contains("vote(s)..."));
        BekleVeKapat();


    }

}
