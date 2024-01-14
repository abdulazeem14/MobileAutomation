package Hooks;

import AppiumLearnings.MobileAutomation.Manager.AppiumDriverManager;
import AppiumLearnings.MobileAutomation.Utilities.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.Activity;
import io.cucumber.java.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Hooks extends AppiumDriverManager {

    @Before
    public static void setDriver(){
      AppiumDriverManager.getDriver();
    }
    @AfterStep
    public static void takeScreenshot(Scenario scenario){
        Utility.getScreenshot(scenario,driver);
    }


    @After
    public static void tearDown(){
        driver.quit();
        driver=null;
        service.stop();
    }

}
