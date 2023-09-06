package lt.rimutis.pom.pages;
import lt.rimutis.pom.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {

    public static void setUpChromeDriver() {
        Driver.setChrome();
    }

    public static void setUpEdgeDriver() {
        Driver.setEdge();
    }

    public static void openUrl(String url) {
        Driver.getInstance().get(url);
    }

    public static void quitDriver() {
        Driver.quitWebDriver();
    }

    public static Alert getAlert() {
        return Driver.getInstance().switchTo().alert();
    }

    public static WebElement getElement(By locator) {
        return Driver.getInstance().findElement(locator);
    }

    public static List<WebElement> getElements(By locator) {
        return Driver.getInstance().findElements(locator);
    }

    public static void sendKeysToElement(By locator, String message) {
        getElement(locator).sendKeys(message);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static boolean isElementSelected(By locator) {
        return getElement(locator).isSelected();
    }

    public static boolean isElementEnabled(By locator) {
        return getElement(locator).isEnabled();
    }

    public static boolean isElementVisible(By locator) {
        return getElement(locator).isDisplayed();
    }

    public static List<Boolean> getSelectedStatusesOfCheckBoxGroup(By locator) {
        List<Boolean> statusList = new ArrayList<>();

        for (WebElement element : getElements(locator)) {
            statusList.add(element.isSelected());
        }

        return statusList;
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static void selectOptionByValue(By locator, String selectValue) {
        WebElement element = getElement(locator);
        Select select = new Select(element);
        select.selectByValue(selectValue);
    }

    public static void acceptAlert() {
        getAlert().accept();
    }

    public static String getTextFromAlert() {
        return getAlert().getText();
    }

    public static boolean isAlertPresent() {
        try {
            getAlert();
        } catch (NoAlertPresentException e) {
            return false;
        }

        return true;
    }

    public static void dismissAlert() {
        getAlert().dismiss();
    }

    public static void sendKeysAlert(String message) {
        getAlert().sendKeys(message);
    }

    public static void clickOnElementByAction(By locator) {
        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getInstance());
        action
                .moveToElement(element)
                .click()
                .perform();
    }

    public static void doubleClickOnElementByAction(By locator) {
        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getInstance());
        action
                .moveToElement(element)
                .doubleClick()
                .perform();
    }

    public static void rightClickOnElementByAction(By locator) {
        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getInstance());
        action
                .moveToElement(element)
                .contextClick()
                .perform();
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementAttributeContains(By locator, String attributeName, String attributeValue) {
        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.attributeContains(locator, attributeName, attributeValue));
    }

    public static boolean waitForElementToBeEnabledCustomised(By locator, int seconds) {

        for (int i = 1; i <= (seconds * 2); i++) {
            try {
                if (isElementEnabled(locator)) {
                    return true;
                }
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    public static boolean waitForElementToBeVisibleCustomised(By locator, int seconds) {

        for (int i = 1; i <= (seconds * 2); i++) {
            try {
                Thread.sleep(500);

                if (isElementVisible(locator)) {
                    return true;
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (NoSuchElementException e) {
            }
        }

        return false;
    }

    public static List<String> getSearchResult(By locator) {

        List<WebElement> elements = getElements(locator);
        List<String> searchResults = new ArrayList<>();

        for (WebElement element : elements) {
            searchResults.add(element.getText().toLowerCase());
        }

        return searchResults;
    }
}
