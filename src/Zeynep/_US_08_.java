package Zeynep;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class _US_08_ extends BaseDriver {
    @Test
    public void test() {
        //Login olma feyzaddan aldım :)
        driver.get("https://demowebshop.tricentis.com/");
        WebElement LogIn = driver.findElement(By.xpath("//a[@href='/login']"));
        LogIn.click();
        MyFunc.Bekle(5);
        WebElement mail = driver.findElement(By.id("Email"));
        mail.sendKeys("asudeniben123@gmail.com");
        MyFunc.Bekle(5);
        WebElement sifre = driver.findElement(By.id("Password"));
        sifre.sendKeys("asudeniben1");
        MyFunc.Bekle(2);
        WebElement sub = driver.findElement(By.xpath("//input[@value='Log in']"));
        sub.click();
        MyFunc.Bekle(5);

        //sipariş verme
        WebElement books = driver.findElement(By.xpath("(//a[@href='/books'])[1]"));
        books.click();
        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/books"));
        WebElement addToCart = driver.findElement(By.xpath("(//*[@class='button-2 product-box-add-to-cart-button'])[1]"));
        addToCart.click();
        WebElement shoppingCart = driver.findElement(By.cssSelector("[id='topcartlink'] [class='ico-cart']"));
        shoppingCart.click();
        WebElement ulke = driver.findElement(By.id("CountryId"));
        Select ulkeMenu = new Select(ulke);
        ulkeMenu.selectByIndex(8);
        WebElement agree = driver.findElement(By.id("termsofservice"));
        agree.click();
        WebElement checkout = driver.findElement(By.cssSelector("[class='button-1 checkout-button']"));
        checkout.click();

        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/onepagecheckout"));
        WebElement company = driver.findElement(By.id("BillingNewAddress_Company"));
        Actions actions = new Actions(driver);
        MyFunc.Bekle(2);
        actions.click(company).sendKeys(Keys.TAB)
                .sendKeys("AsudeAş").sendKeys(Keys.TAB)
                .sendKeys(Keys.DOWN).sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB).sendKeys("istanbul")
                .sendKeys(Keys.TAB).sendKeys("istanbul/Maltepe")
                .sendKeys(Keys.TAB).sendKeys("istanbul/Çekmeköy")
                .sendKeys(Keys.TAB).sendKeys("34920")
                .sendKeys(Keys.TAB).sendKeys("02122121613")
                .sendKeys(Keys.TAB).sendKeys("02122121614")
                .build().perform();
        WebElement continue1 = driver.findElement(By.cssSelector("[onclick='Billing.save()']"));
        continue1.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick='Shipping.save()']")));
        WebElement continue2 = driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
        continue2.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick='ShippingMethod.save()']")));
        WebElement continue3 = driver.findElement(By.cssSelector("[onclick='ShippingMethod.save()']"));
        continue3.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick='PaymentMethod.save()']")));
        WebElement continue4 = driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()']"));
        continue4.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick='PaymentInfo.save()']")));
        WebElement continue5= driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"));
        continue5.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick='ConfirmOrder.save()']")));
        WebElement onay= driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
        onay.click();
        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/checkout/completed/"));

//      BİLGİSAYARA KAYDETME

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


}
