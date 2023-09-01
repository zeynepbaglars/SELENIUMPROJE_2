package feyza;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _oturumkapatma extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement LogIn = driver.findElement(By.xpath("//a[@href='/login']"));
        LogIn.click();

        WebElement mail = driver.findElement(By.id("Email"));
        mail.sendKeys("Asudebaykal1@gmail.com");
        MyFunc.Bekle(1);

        WebElement sifre = driver.findElement(By.id("Password"));
        sifre.sendKeys("Asude123");
        MyFunc.Bekle(2);

        WebElement sub = driver.findElement(By.xpath("//input[@value='Log in']"));
        sub.click();
        MyFunc.Bekle(2);

        //çıkışyapma
        WebElement LogOut = driver.findElement(By.xpath("//a[@href='/logout']"));
        LogOut.click();

        WebElement register = driver.findElement(By.xpath("//a[@href='/register']"));

        Assert.assertTrue("Çıkış işlemi başarısız", register.isDisplayed());

        BekleVeKapat();
    }
}