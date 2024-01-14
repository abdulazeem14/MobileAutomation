//package AppiumLearnings.MobileAutomation;
//
//import java.io.File;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import com.google.common.collect.ImmutableMap;
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.android.Activity;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumServiceBuilder;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
//
//public class AppiumBasics extends BaseTest{
//
//	@Test
//	public void WifiSettingName() throws MalformedURLException {
//		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
//		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
//		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
//		driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
//		String alertTitle= driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
//		Assert.assertEquals(alertTitle,"WiFi settings");
//		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("AzeemWifi");
//		driver.findElement(AppiumBy.id("android:id/button1")).click();
//	}
//	@Test
//	public void longPressGesture(){
//		driver.findElement(AppiumBy.accessibilityId("Views")).click();
//		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
//		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
//		WebElement element= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='People Names']"));
//		longPressAction(element);
//		Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
//		String menuText= driver.findElement(By.id("android:id/title")).getText();
//		Assert.assertEquals(menuText,"Sample menu");
//	}
//
//	@Test
//	public void scrollDemo() throws InterruptedException {
//		// when we know element until the element found
//		driver.findElement(AppiumBy.accessibilityId("Views")).click();
////		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
////		Thread.sleep(2000);
//		Thread.sleep(2000);
//		boolean canScrollMore;
//		do {
//			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//					"left", 100, "top", 100, "width", 200, "height", 200,
//					"direction", "down",
//					"percent", 3.0));
//		}
//		while(canScrollMore);
//	}
//
//	@Test
//	public void openApplicationBasedOnActivity(){
//		Activity activity = new Activity("io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");
//		driver.startActivity(activity);
//		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
//		driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
//		String alertTitle= driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
//		Assert.assertEquals(alertTitle,"WiFi settings");
//		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("AzeemWifi");
//		driver.findElement(AppiumBy.id("android:id/button1")).click();
//	}
//
//}
