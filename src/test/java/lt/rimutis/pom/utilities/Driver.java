package lt.rimutis.pom.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


import java.time.Duration;

    public class Driver {

        private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

        public static void setChrome() {
            WebDriverManager.chromedriver().setup();
            System.setProperty("webdriver.http.factory", "jdk-http-client");

            ChromeOptions options = new ChromeOptions();
//        options.addArguments("user-data-dir=C:\\Users\\clacc\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
            options.addArguments("--start-maximized");
            options.addArguments("--force-device-scale-factor=0.75");
//            options.addArguments("--headless=new");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--ignore-ssl-errors=yes");
//        options.addArguments("--ignore-certificate-errors");

//        webDriver = new ChromeDriver(options);
            webDriver.set(new ChromeDriver(options));
//        webDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        }

        public static void setEdge() {
            WebDriverManager.edgedriver().setup();
            System.setProperty("webdriver.http.factory", "jdk-http-client");

            EdgeOptions options = new EdgeOptions();
//        options.addArguments("user-data-dir=C:\\Users\\clacc\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
            options.addArguments("--start-maximized");
            options.addArguments("--force-device-scale-factor=0.75");
//        optionsChrome.addArguments("--headless=new");

//        webDriver = new EdgeDriver(options);
            webDriver.set(new EdgeDriver(options));
//        webDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        }

        public static WebDriver getInstance() {
            return webDriver.get();
        }

        public static void quitWebDriver() {
            webDriver.get().quit();
            webDriver.remove();
        }
    }
