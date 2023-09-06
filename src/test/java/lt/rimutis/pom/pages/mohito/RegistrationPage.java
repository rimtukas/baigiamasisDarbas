package lt.rimutis.pom.pages.mohito;

import lt.rimutis.pom.pages.Common;
import org.testng.annotations.Test;

public class RegistrationPage {

    public static void open() {
        Common.setUpChromeDriver();
        Common.openUrl("https://www.mohito.com/lt/lt/");

        }
}
