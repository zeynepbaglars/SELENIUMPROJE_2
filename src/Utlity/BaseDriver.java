package Utlity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseDriver {
    public static WebDriver driver; // SingletonDriver method
    public static WebDriverWait wait;

    static{  //bunun sarti extends olmasi ve basta yer almasi mi

        Logger logger= Logger.getLogger(""); // output yapılan logları al.
        logger.setLevel(Level.SEVERE); // sadece ERROR ları göster

        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public static void BekleVeKapat(){
        MyFunc.Bekle(5);
        driver.quit();
    }
    public static void login(){
        driver.get("https://demowebshop.tricentis.com/");

        WebElement login= driver.findElement(By.className("ico-login"));
        login.click();
        MyFunc.Bekle(2);

        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("selaniumteam9@gmail.com");
        MyFunc.Bekle(2);

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("Seleniumteam9");
        MyFunc.Bekle(2);

        WebElement remember= driver.findElement(By.id("RememberMe"));
        remember.click();
        MyFunc.Bekle(2);

        WebElement Loginbtn= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Loginbtn.click();
        MyFunc.Bekle(2);

    }

}


