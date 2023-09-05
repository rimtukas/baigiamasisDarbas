package lt.rimutis.baigiamasis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baigiamasis {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void Login() {
        System.out.println("Test 1");
        driver.get("http://puiki.lt");
        driver.get("https://puiki.lt/quick-order?rc=1&back=my-account");

    }

    @Test
    public void Account() {
        System.out.prilntn("Test 2");

    }

    @Test
    public void Search() {
        System.out.prilntn("Test 3");
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
        public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
            if (testResult.getStatus() == ITestResult.FAILURE) {
                System.out.println(testResult.getStatus());
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-"
                        + Arrays.toString(testResult.getParameters()) +  ".jpg"));
    }
}

