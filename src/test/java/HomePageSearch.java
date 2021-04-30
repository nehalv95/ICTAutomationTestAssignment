
import com.aventstack.extentreports.model.Report;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.scene.layout.Priority;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.io.IOException;



public class HomePageSearch {

    private WebDriver driver;
    @BeforeMethod
    public void openBrowser()
    {
        driver= Browser.openBrowser();
    }

    @Test(dataProvider = "testdata",dataProviderClass = Dataprovider.class,priority = 0)
    public void validItemSearch(String searchItem1) throws IOException {
        Reports.createTest("Verify Home page Search - Positive");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.searchItem(searchItem1);
        homePage.verifySearchItem(searchItem1);
    }
   @Test(dataProvider = "testdata1",dataProviderClass = Dataprovider.class,priority = 1)
    public void validItemSearch1(String searchItem2) throws IOException {
        Reports.createTest("Verify Home Page Search -Negative");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.searchItem(searchItem2);
        homePage.verifyNoResultFound();
    }
  @Test(dataProvider = "testdata2",dataProviderClass = Dataprovider.class,priority = 2)
    public void validateAddCartFunctionality(String searchItem3) throws IOException{
        Reports.createTest("Verify Adding Item - Positive");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.searchItem(searchItem3);
        homePage.goToSearchItemDetailsPage(homePage.ElementsearchResultLink());
        homePage.addToCartFunctionality();
    }
   @Test(dataProvider = "testdata2",dataProviderClass = Dataprovider.class,priority = 3)
    public void validateRemoveItemFromCart(String searchItem3)throws IOException,InterruptedException{
        Reports.createTest("Verify Adding Item - Positive");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.searchItem(searchItem3);
        homePage.goToSearchItemDetailsPage(homePage.ElementsearchResultLink());
        homePage.addToCartFunctionality();
        homePage.removeFromCartFunctionality();
    }
    @Test(dataProvider = "testdata2",dataProviderClass = Dataprovider.class,priority = 4)
    public void sortFunctionality(String searchItem4) throws IOException, InterruptedException {
        Reports.createTest("Verify the Price of Item - Positive");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.searchItem(searchItem4);
        homePage.itemSortFunctionality();
    }
    @Test(priority = 5)
    public void validRegisteredAdress()throws IOException{
        Reports.createTest("Verify the Registered Address of flipkart - Positive");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.verifyRegisteredAddrs();
    }
    @Test(priority = 6)
    public void verifyOffersInOfferZone()throws IOException{
        Reports.createTest("Verify the offers in offerzone - Positive");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.verifyListOfOffers();
    }
   @Test(dataProvider = "testdata5",dataProviderClass = Dataprovider.class,priority = 7)
    public void verifyTheBuyNowButton(String searchItem5)throws IOException{
        Reports.createTest("Verify the offers in offerzone and buynow button click - Positive");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.searchItem(searchItem5);
        homePage.goToSearchItemDetailsPage(homePage.ElementsearchResultLink1());
        homePage.clickBuyNowForAnItem();
    }
   @Test(priority = 8)
    public void verifyTheFooterText()throws IOException{
        Reports.createTest("Verify the footer address - Positive");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.footerTextValidation();
    }
    @Test(priority = 9)
    public void verifyMoreOptionDropdown() throws IOException, InterruptedException {
        Reports.createTest("Verify the user is able to see the options in dropdown list - Positive");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.moreDropdownFunctionality();
    }
   @Test(dataProvider = "testdata6",dataProviderClass = Dataprovider.class,priority = 10)
    public void verifyTotalAmountInCart(String searchItem6)throws IOException{
        Reports.createTest("Verify the total amount in cart for single product - Positive");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.searchItem(searchItem6);
        homePage.validateTotalAmountInCart();

    }
    @Test(dataProvider = "testdata7",dataProviderClass = Dataprovider.class,priority = 11)
    public void validateMostExpensiveItemName(String searchItem7)throws IOException,InterruptedException{
        Reports.createTest("Verify the most expensive item in the list - Positive");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.searchItem(searchItem7);
        homePage.verifyTheMostExpensiveItemName(searchItem7);
    }

    @Test(dataProvider = "testdata8",dataProviderClass = Dataprovider.class,priority = 12)
    public void validateInvalidPincode(String searchItem, String pincode) throws IOException {
        Reports.createTest("Verify the most expensive item in the list - Positive");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.searchItem(searchItem);
        homePage.goToSearchItemDetailsPage(homePage.ElementsearchResultLink());
        homePage.VerifyInvalidPinCode(pincode);
    }

    @Test(dataProvider = "testdata9",dataProviderClass = Dataprovider.class,priority = 13)
    public void VerifyValidPinCode(String searchItem, String pincode) throws IOException {
        Reports.createTest("Verify the most expensive item in the list - Positive");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.searchItem(searchItem);
        homePage.goToSearchItemDetailsPage(homePage.ElementsearchResultLink());
        homePage.VerifyValidPinCode(pincode);
    }
    @Test(dataProvider = "testdata6",dataProviderClass = Dataprovider.class,priority = 14)
    public void verifyTotalAmountOfMultipleItem(String searchItem6)throws IOException{
        Reports.createTest("Verify the most expensive item in the list - Positive");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.searchItem(searchItem6);
        homePage.validateTotalAmountOfMultipleItem();
    }
    @Test(dataProvider = "testdata10",dataProviderClass = Dataprovider.class,priority = 15)
    public void verifyTheFilterOptions(String searchItem10)throws IOException{
        Reports.createTest("Verify the filter options - Positive");
        HomePage homePage=new HomePage(driver);
        homePage.loginPopupCloseIfPresent();
        homePage.searchItem(searchItem10);
        homePage.verifyFilterOption();
    }

    @AfterMethod
    public void closeBrowser()
    {
        Browser.closeBrowser(driver);
        driver.quit();
    }
}
