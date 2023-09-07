package lt.rimutis.pom.tests.mohito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RegistrationTest {
    private WebDriver driver;
    @Test
    public void Registration() {

        driver.get("https://www.mohito.com/lt/lt/customer/account/login/");
        String valueA = "vardenis@gmail.com";
        String valueB = "Vardenis";
        String valueC = "Pavardenis";
        String valueD = "pavardenis";
        WebElement sendValueToPastasField = driver.findElement(By.xpath(//*[@id="loginRegisterRoot"]/div/div[2]/div/form/div[1]));
        sendValueToPastasField.sendKeys(valueA),
        WebElement sendValueToVardasField = driver.findElement(By.xpath(//*[@id="loginRegisterRoot"]/div/div[2]/div/form/div[2]));
        sendValueToVardasField.sendKeys(valueB),
        WebElement sendValueToPavardeField = driver.findElement(By.xpath(//*[@id="loginRegisterRoot"]/div/div[2]/div/form/div[3]));
        sendValueToPavardeField.sendKeys(valueC),
        WebElement sendValueToPasswordField = driver.findElement(By.xpath(//*[@id="loginRegisterRoot"]/div/div[2]/div/form/div[4]));
        sendValueToPasswordField.sendKeys(valueD),
        WebElement clickButtonSukurtiPaskyra = driver.findElement(By.xpath(//*[@id="loginRegisterRoot"]/div/div[2]/div/form/button));
       clickButtonSukurtiPaskyra.click(),


    }
}
