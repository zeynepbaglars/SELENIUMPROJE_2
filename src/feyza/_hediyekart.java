package feyza;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _hediyekart extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement LogIn = driver.findElement(By.xpath("//a[@href='/login']"));
        LogIn.click();

        WebElement mail = driver.findElement(By.id("Email"));
        mail.sendKeys("Asudebaykal1@gmail.com");

        WebElement sifre = driver.findElement(By.id("Password"));
        sifre.sendKeys("Asude123");
        MyFunc.Bekle(2);

        WebElement sub = driver.findElement(By.xpath("//input[@value='Log in']"));
        sub.click();
        MyFunc.Bekle(5);

        WebElement computer = driver.findElement(By.cssSelector("[class='inactive']>a[href='/computers']"));
        computer.click();

        WebElement desktops = driver.findElement(By.xpath("//a[@title='Show products in category Desktops']"));
        desktops.click();

        WebElement add = driver.findElement(By.cssSelector("[value='Add to cart']"));
        add.click();

        WebElement toCart = driver.findElement(By.id("add-to-cart-button-72"));
        toCart.click();

        WebElement sepet = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        sepet.click();

        WebElement coupon = driver.findElement(By.name("applydiscountcouponcode"));
        coupon.click();


        WebElement msj1 = driver.findElement(By.xpath("//div[@class='message']"));
        Assert.assertTrue("Aranılan mesaj bulunamadı", msj1.getText().contains("The coupon code you entered"));


        WebElement gift = driver.findElement(By.name("applygiftcardcouponcode"));
        gift.click();


        WebElement msj2 = driver.findElement(By.xpath("//div[@class='message']"));
        Assert.assertTrue("Aranılan mesaj bulunamadı", msj2.getText().contains("The coupon code you entered"));

        WebElement agree = driver.findElement(By.id("termsofservice"));
        agree.click();

        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();

        BekleVeKapat();}}