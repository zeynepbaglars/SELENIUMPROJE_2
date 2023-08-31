package SALIH;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends BaseDriver {
    @Test
    public void Selenium(){
      /*  driver.get("https://demowebshop.tricentis.com/");

        WebElement login= driver.findElement(By.className("ico-login"));
        login.click();
        MyFunc.Bekle(2);

        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("Asudebaykal123@gmail.com");
        MyFunc.Bekle(2);

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("Asude123");
        MyFunc.Bekle(2);

        WebElement remember= driver.findElement(By.id("RememberMe"));
        remember.click();
        MyFunc.Bekle(2);

        WebElement Loginbtn= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Loginbtn.click();
        MyFunc.Bekle(2);


        //WebElement Loginbtn= driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        //Loginbtn.click();




        BekleVeKapat();*/
    }
    /*@Test
    public void TC_0401A(){
        driver.get("https://demowebshop.tricentis.com/");

        WebElement login= driver.findElement(By.className("ico-login"));
        login.click();
        MyFunc.Bekle(2);

        WebElement Loginbtn= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Loginbtn.click();
        MyFunc.Bekle(2);

        WebElement msg= driver.findElement(By.xpath("//div[@class='validation-summary-errors']/span"));

        Assert.assertTrue("Test Başarısız",msg.getText().contains("Login was unsuccessful."));

        BekleVeKapat();
    }*/
   /* @Test
    public void TC_0402B(){
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(2);


        WebElement login= driver.findElement(By.className("ico-login"));
        login.click();
        MyFunc.Bekle(2);

        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("Asudebaykal123@gmail.com");
        MyFunc.Bekle(2);

        WebElement Loginbtn= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Loginbtn.click();
        MyFunc.Bekle(2);

        WebElement msg= driver.findElement(By.xpath("//div[@class='validation-summary-errors']/span"));

        Assert.assertTrue("Test Başarısız",msg.getText().contains("Login was unsuccessful."));

        BekleVeKapat();

    }

    @Test
    public void TC_0401C(){
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(2);

        WebElement login= driver.findElement(By.className("ico-login"));
        login.click();
        MyFunc.Bekle(2);

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("Asude123");
        MyFunc.Bekle(2);

        WebElement remember= driver.findElement(By.id("RememberMe"));
        remember.click();
        MyFunc.Bekle(2);

        WebElement Loginbtn= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Loginbtn.click();

        WebElement msg= driver.findElement(By.xpath("//div[@class='validation-summary-errors']/span"));

        Assert.assertTrue("Test Başarısız",msg.getText().contains("Login was unsuccessful."));

        BekleVeKapat();
    }*/
    @Test
    public void TC_0401D(){
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(2);

        WebElement login= driver.findElement(By.className("ico-login"));
        login.click();
        MyFunc.Bekle(2);

        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("TechnoStudy@gmail.com");
        MyFunc.Bekle(2);

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("Batch4");
        MyFunc.Bekle(2);

        WebElement remember= driver.findElement(By.id("RememberMe"));
        remember.click();
        MyFunc.Bekle(2);

        WebElement Loginbtn= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Loginbtn.click();
        MyFunc.Bekle(2);

        WebElement msg= driver.findElement(By.xpath("//div[@class='validation-summary-errors']/span"));

        Assert.assertTrue("Test Başarısız",msg.getText().contains("Login was unsuccessful."));

        BekleVeKapat();


    }
}


