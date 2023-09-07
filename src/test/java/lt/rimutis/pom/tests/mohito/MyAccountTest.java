package lt.rimutis.pom.tests.mohito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MyAccountTest {

    private WebDriver driver;

    @Test
    public void MyAccount() {

        driver.get("https://www.mohito.com/lt/lt/customer/account/edit/");
        String valueA = "Rastenytes";
        String valueB = "2";
        String valueC = "55555";
        String valueD = "Balbieriskis";
        String valueE = "66666666";
        WebElement sendValueToGatveField = driver.findElement(By.xpath(//*[@id="addressContainer"]/div[3]/div[2]/div[1]/div));
        sendValueToGatveField.sendKeys(valueA),
        WebElement sendValueToNumberField = driver.findElement(By.xpath(//*[@id="addressContainer"]/div[3]/div[2]/div[2]/div));
        sendValueToNumberField.sendKeys(valueB),
        WebElement sendValueToPostCodeField = driver.findElement(By.xpath(//*[@id="postcodeWrapper"]));
        sendValueToPostCodeField.sendKeys(valueC),
        WebElement sendValueToCityField = driver.findElement(By.xpath(//*[@id="addressContainer"]/div[4]/div[2]/div[2]/div));
        sendValueToCityField.sendKeys(valueD),
        WebElement sendValueToPhoneNumberField = driver.findElement(By.xpath(//*[@id="addressPhone"]));
        sendValueToPhoneNumberField.sendKeys(valueE),
        WebElement clickOnIssaugotiPakeitimusButton = driver.findElement(By.xpath(//*[@id="customer-shipping-data-form"]/div[4]/button));
        clickOnIssaugotiPakeitimusButton.click(),



    }
