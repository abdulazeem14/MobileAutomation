package StepClass;

import AppiumLearnings.MobileAutomation.Manager.AppiumDriverManager;
import AppiumLearnings.MobileAutomation.PageObjects.LandingPage;
import AppiumLearnings.MobileAutomation.PageObjects.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductPageSteps extends AppiumDriverManager {

    ProductsPage productsPage;
    public ProductPageSteps(){
        productsPage= new ProductsPage();
    }

    @And("user select {string} product and add to cart")
    public void addToCartTheProduct(String product){
           productsPage.addToCartTheProduct(product);
    }


}
