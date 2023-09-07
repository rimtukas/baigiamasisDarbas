package lt.rimutis.pom.pages.mohito;

import lt.rimutis.pom.pages.Common;

public class CollectingBagPage {

    public static void open() {
        Common.setUpChromeDriver();
        Common.openUrl("https://www.mohito.com/lt/lt/");

    }
}
