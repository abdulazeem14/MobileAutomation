package AppiumLearnings.MobileAutomation.Utilities;

import java.util.HashMap;

public class Constants {

    public static HashMap<String,String> productDetails= new HashMap<>();

    public static HashMap<String, String> getProductDetails() {
        return productDetails;
    }

    public static void setProductDetails(String productname, String price) {
        Constants.productDetails = new HashMap<>();
        Constants.productDetails.put(productname,price);
    }
}
