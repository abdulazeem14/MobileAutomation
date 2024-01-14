package AppiumLearnings.MobileAutomation.PageObjects;

import AppiumLearnings.MobileAutomation.Manager.AppiumDriverManager;
import AppiumLearnings.MobileAutomation.Utilities.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Hello world!
 *
 */
public class LandingPage extends AppiumDriverManager
{

   @AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
   private WebElement selectCountry;

   @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"android:id/text1\"]")
   private List<WebElement> listCountry;

   @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
   private WebElement txtName;

   @AndroidFindBy(xpath = "//android.widget.RadioGroup[@resource-id=\"com.androidsample.generalstore:id/radioGender\"]/android.widget.RadioButton")
   private List<WebElement> radioGender;

   @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
   private WebElement btnLetsShop;

   public LandingPage(){
      PageFactory.initElements(new AppiumFieldDecorator(driver), this);
   }

   public void selectCountryFromDropDown(String country){
      selectCountry.click();
      new Utility().scrollToElement(country);
      listCountry.stream().filter(we->we.getText().equalsIgnoreCase(country)).findFirst().get().click();
   }

   public void enterName(String name){
      txtName.sendKeys(name);
      driver.hideKeyboard();
   }

   public void selectGender(String gender){
      radioGender.stream().filter(we->we.getText().equalsIgnoreCase(gender)).findFirst().get().click();
   }

   public void clickLetsShop(){
      btnLetsShop.click();
   }

}
