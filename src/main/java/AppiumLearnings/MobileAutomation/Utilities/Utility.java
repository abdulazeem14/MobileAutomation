package AppiumLearnings.MobileAutomation.Utilities;

import AppiumLearnings.MobileAutomation.Manager.AppiumDriverManager;
import com.aventstack.extentreports.reporter.FileUtil;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Utility extends AppiumDriverManager {

    public void scrollToElement(String text){
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
    }
    public static void getScreenshot(Scenario scenario, AppiumDriver driver){

        try {
            DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
            LocalDateTime date= LocalDateTime.now();
            String currentDate= date.format(formatter);
            File sourcefile=driver.getScreenshotAs(OutputType.FILE);
            File destinationFile = new File("test-output/screenshots/"+scenario.getName()+"/"+scenario.getStatus()+"/"+currentDate+".png");
            FileUtils.copyFile(sourcefile,destinationFile);
            URI uri= destinationFile.toURI();
           System.out.println(uri);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
