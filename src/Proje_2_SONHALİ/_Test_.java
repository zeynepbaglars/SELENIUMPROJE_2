package Proje_2_SONHALİ;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class _Test_ extends BaseDriver {
    @Test(priority = 1)//Kullanıcı Hesabı Oluşturma-Pozitif
    public void _US1_(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
        register.click();
        MyFunc.Bekle(2);

        WebElement gender = driver.findElement(By.cssSelector("[id='gender-female']"));
        Actions actions = new Actions(driver);
        MyFunc.Bekle(2);
        actions.click(gender).sendKeys(Keys.TAB)
                .sendKeys("Selanium").sendKeys(Keys.TAB)
                .sendKeys("Projesi").sendKeys(Keys.TAB)
                .sendKeys("selaniumteam9@gmail.com").sendKeys(Keys.TAB)
                .sendKeys("Seleniumteam9").sendKeys(Keys.TAB)
                .sendKeys("Seleniumteam9").sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).build().perform();

        WebElement msg = driver.findElement(By.xpath("//div[@class='result']"));
        Assert.assertTrue("Hesap oluşturulamadı..!!", msg.getText().contains("Your registration completed"));

        BekleVeKapat();

    }
    @Test(priority = 2)//Kullanıcı Hesabı Oluşturma-Negatif
    public void _US2_(){//PASS
        driver.get("https://demowebshop.tricentis.com/");
        WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
        register.click();
        MyFunc.Bekle(2);

        WebElement gender = driver.findElement(By.cssSelector("[id='gender-female']"));
        Actions actions = new Actions(driver);
        MyFunc.Bekle(2);
        actions.click(gender).sendKeys(Keys.TAB)
                .sendKeys("Selanium").sendKeys(Keys.TAB)
                .sendKeys("Projesi").sendKeys(Keys.TAB)
                .sendKeys("selaniumteam9@gmail.com").sendKeys(Keys.TAB)
                .sendKeys("Seleniumteam9").sendKeys(Keys.TAB)
                .sendKeys("Seleniumteam9").sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).build().perform();

        WebElement msg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']/ul/li"));
        Assert.assertTrue("Hesap oluşturuldu..!!",msg.getText().contains("The specified email already exists"));

        BekleVeKapat();

    }
    @Test(priority = 3)
    public void _US3_(){//Oturum Kapatma /Pozitif
        driver.get("https://demowebshop.tricentis.com/");
        WebElement LogIn = driver.findElement(By.xpath("//a[@href='/login']"));
        LogIn.click();

        WebElement mail = driver.findElement(By.id("Email"));
        mail.sendKeys("selaniumteam9@gmail.com");
        MyFunc.Bekle(1);

        WebElement sifre = driver.findElement(By.id("Password"));
        sifre.sendKeys("Seleniumteam9");
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
    @Test(priority = 4)
    public void _US4_(){//Oturum Açma (Login)//Pozitif
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
        BekleVeKapat();
    }
    @Test(priority = 5)
    public void _US5_1(){//Oturum Açma (Login)//Negatif//boş
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
    }
    @Test(priority = 6)
    public void _US5_2(){//Oturum Açma (Login)//Negaatif//boş mail
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(2);


        WebElement login= driver.findElement(By.className("ico-login"));
        login.click();
        MyFunc.Bekle(2);

        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("selaniumteam9@gmail.com");
        MyFunc.Bekle(2);

        WebElement Loginbtn= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Loginbtn.click();
        MyFunc.Bekle(2);

        WebElement msg= driver.findElement(By.xpath("//div[@class='validation-summary-errors']/span"));

        Assert.assertTrue("Test Başarısız",msg.getText().contains("Login was unsuccessful."));

        BekleVeKapat();

    }

    @Test(priority = 7)
    public void _US5_3(){//Oturum Açma (Login)//Negaatif//boş mail
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(2);

        WebElement login= driver.findElement(By.className("ico-login"));
        login.click();
        MyFunc.Bekle(2);

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("Seleniumteam9");
        MyFunc.Bekle(2);

        WebElement remember= driver.findElement(By.id("RememberMe"));
        remember.click();
        MyFunc.Bekle(2);

        WebElement Loginbtn= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Loginbtn.click();

        WebElement msg= driver.findElement(By.xpath("//div[@class='validation-summary-errors']/span"));

        Assert.assertTrue("Test Başarısız",msg.getText().contains("Login was unsuccessful."));

        BekleVeKapat();
    }
    @Test(priority = 8)
    public void _US5_4(){//hatalı mail ve şifre
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
    @Test(priority = 9)
    public void _US6_(){//sipariş verme
        login();

        MyFunc.Bekle(2);
        WebElement text1=driver.findElement(By.xpath("(//*[@href='/build-your-cheap-own-computer'])[1]"));
        String text1Str=text1.getText();

        WebElement urunEkleme=driver.findElement(By.xpath("(//*[@class='button-2 product-box-add-to-cart-button'])[3]"));
        urunEkleme.click();

        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/build-your-cheap-own-computer"));

        WebElement SepeteEkle=driver.findElement(By.id("add-to-cart-button-72"));
        SepeteEkle.click();

        WebElement shoppingCart=driver.findElement(By.xpath("(//*[@class='cart-label'])[1]"));
        shoppingCart.click();

        MyFunc.Bekle(4);
        WebElement text2=driver.findElement(By.linkText("Build your own cheap computer"));
        String text2Str=text2.getText();

        Assert.assertTrue("Yanlış ürün eklendi",text1Str.equals(text2Str));


        WebElement selectCountry=driver.findElement(By.id("CountryId"));
        Select secim=new Select(selectCountry);
        secim.selectByIndex(5);

        WebElement agreeButton=driver.findElement(By.id("termsofservice"));
        agreeButton.click();

        WebElement checkoutButton=driver.findElement(By.cssSelector("[class='button-1 checkout-button']"));
        checkoutButton.click();

        WebElement company=driver.findElement(By.id("BillingNewAddress_Company"));


        Actions actions = new Actions(driver);
        MyFunc.Bekle(2);
        actions.click(company)
                .sendKeys("Team9").sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB).sendKeys(Keys.DOWN)
                .sendKeys(Keys.TAB).sendKeys("istanbul")
                .sendKeys(Keys.TAB).sendKeys("Ankara/Çankaya")
                .sendKeys(Keys.TAB).sendKeys("ankara/Sincan")
                .sendKeys(Keys.TAB).sendKeys("7858")
                .sendKeys(Keys.TAB).sendKeys("02162121613")
                .sendKeys(Keys.TAB).sendKeys("02162121614")
                //    .sendKeys(Keys.TAB).sendKeys("0542542541")

                .build().perform();



        WebElement cntn1=driver.findElement(By.cssSelector("[onclick='Billing.save()']"));

        cntn1.click();

        WebElement inStore=driver.findElement(By.id("PickUpInStore"));
        inStore.click();

        MyFunc.Bekle(2);

        WebElement cntn=driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
        cntn.click();

        WebElement metinCard=driver.findElement(By.xpath("(//*[@for='paymentmethod_0'])[2]"));
        String card=metinCard.getText();


        WebElement cntn2=driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()']"));
        cntn2.click();

        WebElement metin2Card=driver.findElement(By.xpath("//*[text()='You will pay by COD']"));
        String card2=metinCard.getText();
        boolean cod=true;
        if ((card2.contains("COD")&&card.contains("COD"))){
            cod=false;}


        Assert.assertTrue("Ödeme yöntemi doğrulanmadı",cod);

        MyFunc.Bekle(2);
        WebElement cntn3=driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"));
        cntn3.click();

        WebElement subTotal=driver.findElement(By.xpath("(//*[@class='product-price'])[1]"));
        double a=Double.valueOf(subTotal.getText());

        WebElement sipfee=driver.findElement(By.xpath("(//*[@class='product-price'])[3]"));
        double b=Double.valueOf(sipfee.getText());

        WebElement sumtotal=driver.findElement(By.cssSelector("[class='product-price order-total'] strong"));
        double c=Double.valueOf(sumtotal.getText());

        Assert.assertTrue("Hatalı Sepet Tutarı", ((a+b)==c));

        MyFunc.Bekle(2);
        WebElement cnfirm=driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
        cnfirm.click();

        MyFunc.Bekle(2);
        WebElement success=driver.findElement(By.xpath("//*[text()='Your order has been successfully processed!']"));

        Assert.assertTrue("Sipariş verilemedi" , success.getText().contains("Your order has been successfully processed!"));


        BekleVeKapat();
    }

    @Test(priority = 10)
    public void _US7_(){//Negatif | Kupon ve Hediye Kartı Kullanma-Pozitif
        login();

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

        BekleVeKapat();

    }
    @Test(priority = 10)
    public void _US8_(){//Sipariş Geçmişini Bilgisayara İndirme
        login();
        WebElement mailAdress= driver.findElement(By.xpath("(//a[@href='/customer/info' and @class='account'])[1]"));
        mailAdress.click();
        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/customer/info"));
        WebElement orders=driver.findElement(By.cssSelector("[href='/customer/orders'][class='inactive']"));
        orders.click();
        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/customer/orders"));
        WebElement details=driver.findElement(By.cssSelector("[class='button-2 order-details-button']"));
        details.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='button-2 pdf-order-button']")));
        WebElement pdf=driver.findElement(By.cssSelector("[class='button-2 pdf-order-button']"));
        Assert.assertTrue("İndirme başarısız",pdf.isDisplayed());
        BekleVeKapat();

    }
    @Test(priority = 11)
    public void _US9_(){//Anket Yanıtlama
        login();
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
