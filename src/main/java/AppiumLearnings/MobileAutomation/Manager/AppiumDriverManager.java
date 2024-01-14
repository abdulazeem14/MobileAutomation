package AppiumLearnings.MobileAutomation.Manager;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppiumDriverManager {

    public static AndroidDriver driver;
    public static AppiumDriverLocalService service;

    public  static void getDriver()  {
        try {
            if (driver == null) {
                service = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                        .withIPAddress("127.0.0.1").usingPort(4723).build();
                service.start();
                UiAutomator2Options options = new UiAutomator2Options();
                options.setDeviceName("AzeemPhone");
                options.setApp("/Users/abdulazeem/Appium/MobileAutomation/src/main/java/resources/General-Store.apk");
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
               // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }
        }
        catch (MalformedURLException exception){
            exception.printStackTrace();
        }
//        finally {
//            return driver;
//        }
    }
}
