package lt.rimutis.pom.tests.mohito;

import org.testng.annotations.Test;

public class RegistrationTest {

    @Test
    public void Login() {
        driver.get("https://puiki.lt/quick-order?rc=1&back=my-account");
        String valueA = "vardenis@gmail.com";
        String valueB = "Vardenis";
        String valueC = "Pavardenis";
        String valueD = "pavardenis";
//
//        WebElement sendValueToPastasField = driver.findElement(By.xpath(id="field_customer_email"));
//       sendValueToPastasField.sendKeys(valueA);
//        WebElement sendValueToVardasField = driver.findElement(By.xpath(id="field_customer_firstname"));
//        sendValueToVardasField.sendKeys(valueB);
//        WebElement sendValueToPavardeField = driver.findElement(By.xpath(id="field_customer_lastname");
//        sendValueToPavardeField.sendKeys(valueC);
//        WebElement sendValueToRePastasField = driver.findElement(By.xpath(id="field_customer_conf_email"));
//        sendValueToRePastasField.sendKeys(valueC);
//        WebElement sendValueToPasswordField = driver.findElement(By.xpath(id="field_customer_passwd"));
//        sendValueToPasswordField.sendKeys(valueD);
//        WebElement sendValueToRePasswordField = driver.findElement(By.xpath(id="field_customer_conf_passwd"));
//        sendValueToRePasswordField.sendKeys(valueD);
//        WebElement clickButtonIssaugotiInformacija = driver.findElement(By.xpath(id="div_save_customer"));
//        clickButtonIssaugotiInformacija.click();

    }
