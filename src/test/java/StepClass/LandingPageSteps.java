package StepClass;

import AppiumLearnings.MobileAutomation.Manager.AppiumDriverManager;
import AppiumLearnings.MobileAutomation.PageObjects.LandingPage;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageSteps extends AppiumDriverManager {

    LandingPage landingPage;
    public LandingPageSteps(){
        landingPage= new LandingPage();
    }

    @Given("user open the General Store application")
    public void validateApplicationIsOpen(){

    }

    @When("user selects the country {string} from the dropdown list")
    public void userSelectsCountry(String country)
    {
        landingPage.selectCountryFromDropDown(country);
    }
    @And("enter the user name as {string}")
    public void enterUserName(String name){
        landingPage.enterName(name);
    }
    @Then("user selects the gender as {string}")
    public void selectGender(String gender){
        landingPage.selectGender(gender);
    }
    @When("user click on Lets Shop button")
    public void clickOnLetsShop(){
        landingPage.clickLetsShop();
    }
    @Then("user should be redirected to Products page")
    public void validateUserRedirectedToProductPage(){

    }


}
