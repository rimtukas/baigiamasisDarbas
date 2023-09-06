package lt.rimutis.pom.utilities;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
    }

    private void takeScreenshot() {

        TakesScreenshot screenshot = (TakesScreenshot) Driver.getInstance();
        File shceenshotFile = screenshot.getScreenshotAs(OutputType.FILE);

        String fileDirectory = "./screenshots/";

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss_SSS");
        String dateTime = localDateTime.format(formatter);

        // ./screenshots/yyyy_MM_dd_HH_mm_ss_SSS_screenshot_name.png
        File saveFile = new File(fileDirectory + dateTime + "_screenshot_name.png");

        try {
            FileUtils.copyFile(shceenshotFile, saveFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
