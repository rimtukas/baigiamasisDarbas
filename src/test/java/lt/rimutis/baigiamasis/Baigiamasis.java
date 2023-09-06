package lt.rimutis.baigiamasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Arrays;
import java.util.List;

public class Baigiamasis {
    private WebDriver driver;


    @Test
    public void Login() {
        System.out.println("Test 1");
        driver.get("http://puiki.lt");
        driver.get("https://puiki.lt/quick-order?rc=1&back=my-account");
        String valueA = "Vardenis";
        String valueB = "Pavardenis";
        String valueC = "vardenis@gmail.com";
        String valueD = "Vardenis";
//        WebElement sendValueToVardasField = driver.findElement(By.xpath(id="field_customer_firstname"));
//        sendValueToVardasField.sendKeys(valueA);
//        WebElement sendValueToPavardeField = driver.findElement(By.xpath(id="field_customer_lastname");
//        sendValueToPavardeField.sendKeys(valueB);
//        WebElement sendValueToPastasField = driver.findElement(By.xpath(id="field_customer_email"));
//        sendValueToPastasField.sendKeys(valueC);
//        WebElement sendValueToRePastasField = driver.findElement(By.xpath(id="field_customer_conf_email"));
//        sendValueToRePastasField.sendKeys(valueC);
//        WebElement sendValueToPasswordField = driver.findElement(By.xpath(id="field_customer_passwd"));
//        sendValueToPasswordField.sendKeys(valueD);
//        WebElement sendValueToRePasswordField = driver.findElement(By.xpath(id="field_customer_conf_passwd"));
//        sendValueToRePasswordField.sendKeys(valueD);
//        WebElement clickButtonIssaugotiInformacija = driver.findElement(By.xpath(id="div_save_customer"));
//        clickButtonIssaugotiInformacija.click();

    }


    @Test
    public void Account() {
        System.out.println("Test 2");
        driver.get("https://puiki.lt/my-account");
        String valueA = "Vardenis";
        String valueB = "Pavardenis";
        String valueC = "BirutesRastenytesgatve";
        String valueD = "55555";
        String valueE = "Balbieriskis";
        String valueF = "85555555";
        String valueH = "86666666";
        String valueJ = "Lietuva";

//        WebElement clickButtonPridetiAdresa = driver.findElement(By.xpath(<a href="https://puiki.lt/address" title="Pridėti adresą"));
//        clickButtonPridetiAdresa.click();
//        WebElement clickButtonAddNewAddress = driver.findElement(By.xpath(id="panel_address_delivery"));
//        clickButtonAddNewAddress.click();
//        WebElement sendValueToVardasField = driver.findElement(By.xpath(id="field_customer_firstname"));
//        sendValueToVardasField.sendKeys(valueA);
//        WebElement sendValueToPavardeField = driver.findElement(By.xpath(id="delivery_lastname"));
//        sendValueToPavardeField.sendKeys(valueB);
//        WebElement sendValueToAddressField = driver.findElement(By.xpath(id="field_delivery_address1"));
//        sendValueToAddressField.sendKeys(valueC);
//        WebElement chooseCountryFromList = driver.findElement(By.xpath(id="delivery_id_country"));
//        chooseCountryFromList.sendKeys(valueJ);
//        WebElement sendValueToPostField = driver.findElement(By.xpath(id="delivery_postcode"));
//        sendValueToPostField.sendKeys(valueD);
//        WebElement sendValueToCityField = driver.findElement(By.xpath(id="delivery_city"));
//        sendValueToCityField.sendKeys(valueE);
//        WebElement sendValueToPhoneNumber = driver.findElement(By.xpath(id="delivery_phone"));
//        sendValueToPhoneNumber.sendKeys(valueF);
//        WebElement sendValueToMobilePhone = driver.findElement(By.xpath(id="delivery_phone_mobile"));
//        sendValueToMobilePhone.sendKeys(valueH);
//        WebElement clickButtonAtnaujintiDuomenis = driver.findElement(By.xpath(id="btn_update_address_delivery"));
//        clickButtonAtnaujintiDuomenis.click();




    }

    @Test
    public void Search() {
        System.out.println("Test 3");
        String searchValue = "usb jungtis";
        List<String> searchResultCriteria = Arrays.asList("usb", "jungtis");
        boolean actualResult;

//       HomePage.clickOnSearchButton();
//        HomePage.enterSearchMessage(searchValue);
//        actualResult = HomePage.checkSearchResult(searchResultCriteria);
//
//        Assert.assertTrue(actualResult);
    }


    @Test
    public void Bag() {
        System.out.println("Test 4");
    }

    @Test
    public void Stock() {
        System.out.println("Test 5");
    }
    @AfterClass
    public void tearDown() {
        if(driver!=null)
            driver.quit();
    }

}


