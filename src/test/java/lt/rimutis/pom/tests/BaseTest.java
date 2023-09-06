package lt.rimutis.pom.tests;

import lt.rimutis.pom.pages.Common;
import lt.rimutis.pom.utilities.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class BaseTest {

    @BeforeMethod
    public abstract void setUp();

    @AfterMethod
    public void tearDown() {
      //  Common.quitDriver();
    }
}
