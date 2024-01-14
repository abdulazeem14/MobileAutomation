package AppiumLearnings.MobileAutomation.PageObjects;

import AppiumLearnings.MobileAutomation.Manager.AppiumDriverManager;
import AppiumLearnings.MobileAutomation.Utilities.Constants;
import AppiumLearnings.MobileAutomation.Utilities.Utility;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.XMLFormatter;

public class ProductsPage extends AppiumDriverManager {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productPrice\"]")
    private List<WebElement> productPrice;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productName\"]")
    public List<WebElement> productName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productName\"]")
    private List<WebElement> addToCart;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    private WebElement cart;
    public ProductsPage(){
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void addToCartTheProduct(String product){
        int index=0;
       new Utility().scrollToElement(product);
       for(WebElement we:productName){
           if(we.getText().equalsIgnoreCase(product)){
               break;
           }
           index++;
       }
       String price= productPrice.get(index).getText();
       addToCart.get(index).click();
        Constants.setProductDetails(product,price);
        System.out.println("####################");
        System.out.println(Constants.productDetails);
        }

}
