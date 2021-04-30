
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    private WebDriver driver;
    public HomePage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    private By loginPopupTitle=By.xpath("//span[text()='Login']");
    private By loginPopupCloseBtn=By.xpath("//button[text()='✕']");
    //Test 0&1
    private By searchTextbox=By.xpath("//input[@type='text']");
    private By firstSearchResultLink=By.xpath("(//div[@class='_4rR01T'])[1]");
    private By noResultFoundLabel=By.xpath("//div[text()='Sorry, no results found!']");
    private By searchResultLink=By.xpath("//a[@class='s1Q9rs']");
    //Test 2
    private By itemName_DetailsPage=By.xpath("//span[@class='B_NuCI']");
    private By addToCartBtn_DetailsPage=By.xpath("//button[text()='ADD TO CART']");
    private By addToCartPageTitle=By.xpath("//div[contains(text(),'My Cart')]");
    private By addToCartRemoveBtn=By.xpath("//div[text()='Remove']");
    private By addToCartItemName=By.xpath("//a[@class='_2Kn22P gBNbID']");
    //Test3

    private By alerttext=By.xpath("//div[text()='Are you sure you want to remove this item?']");
    private By alertCancelButton=By.xpath("//div[text()='Remove']");
    private By afterRemovePage=By.xpath("//div[text()='Missing Cart items?']");

    //Test 4
    private By sortFunctionLink=By.xpath("//div[text()='Price -- High to Low']");
    private By firstSortElement=By.xpath("(//a[@class='s1Q9rs'])[1]");
    private By itemPrice=By.xpath("//div[@class='_30jeq3']");
    private By searchResultLink1=By.xpath("(//div[@class='_4rR01T'])");
    //Test 5

    private By registeredOfficeAddress=By.xpath("//div[@class='_3JHi0r']");
    private By startFooter=By.xpath("//div[@class='LfkXVL']");
    //Test 6
    private By topOfferLink=By.xpath("//div[text()='Top Offers']");
    private By dealOfTheDay=By.xpath("//div[@class='_2N81D7']");
    //Test 7
    private By buyNowButton=By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']");
    private  By itemDetailsPage=By.xpath("//span[@class='B_NuCI']");
    private By loginOrSignupPage=By.xpath("//span[text()='Login or Signup']");
    //Test 8
    private By aboutInFooter=By.xpath("//div[text()='ABOUT']");
    private By contactUsUnderAbout=By.xpath("//a[text()='Contact Us']");
    private By careerUnderAbout=By.xpath("//a[text()='Careers']");
    private By pressUnderAbout=By.xpath("//a[text()='Press']");
    //Test 9
    private By moreOption=By.xpath("//div[@class='exehdJ']");
    private By moreOptionList=By.xpath("//li[@class='_2NOVgj']//div");
    //Test 10
    private By priceUnderMycart=By.xpath("//span[@class='_2-ut7f _1WpvJ7']");
    private By priceUnderPriceDetails=By.xpath("//span[text()=' ₹8,499']");
    private By mycartPageTitle=By.xpath("//div[@class='_3g_HeN']");
    private By searchResultLinkForMobile=By.xpath("(//a[@class='s1Q9rs'])[1]");
    private By itemDetailsPageName=By.xpath("//span[@class='B_NuCI']");
    //Test 11
    private By firstItemShown=By.xpath("(//a[@class='s1Q9rs'])[1]");
    private By sortLink=By.xpath("//div[text()='Price -- High to Low']");
    private By mostExpensiveItem=By.xpath("(//a[@class='s1Q9rs'])[1]");

    //Test 12
    private By pincodeTextField=By.xpath("//input[@placeholder='Enter Delivery Pincode']");
    private By pincodeCheckLinkBtn=By.xpath("//span[text()='Check']");
    private By pincodeValidationMsg=By.xpath("//div[text()='Not a valid pincode']");
    private By pincodeDelveryByLabel=By.xpath("//div[text()='Delivery by']");

    //Test 13

    private By firstItemInTheList=By.xpath("(//a[@class='s1Q9rs'])[1]");
    private By secondItemInTheList=By.xpath("(//a[@class='s1Q9rs'])[2]");
    private By firstItemDetailPage=By.xpath("//span[@class='B_NuCI']");
    private By secondItemDetailPage=By.xpath("//span[@class='B_NuCI']");
    private By addCartButton=By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");
    private By myCartTitle=By.xpath("//div[@class='_3g_HeN']");
    private By totalAmount=By.xpath("(//div[@class='_24KATy']/..//span)[4]");
    private By firstItemPrice=By.xpath("(//span[@class='_2-ut7f _1WpvJ7'])[1]");
    private By secondItemPrice=By.xpath("(//span[@class='_2-ut7f _1WpvJ7'])[2]");
    private By totalPriceDetailPage=By.xpath("//span[text()='Price details']");
    //Test 14

    private By filterOptionLink=By.xpath("(//a[text()='Clothing and Accessories'])[1]");
    private By filterPageTitle=By.xpath("//span[@class='_10Ermr']");
    private By filterSubOption=By.xpath("(//a[@class='_2SqgSY'])[5]");
    private By filterChangeLabel=By.xpath("(//a[@class='_2whKao'])[3]");


    public By ElementsearchResultLink(){

        return searchResultLink;
    }
    public By ElementsearchResultLink1()
    {

        return searchResultLink1;
    }

    public void waitForElement(By elementlocator)
    {
        int i=0;
        for(int j=0; j<5;j++)
        {
            try
            {
                WebDriverWait wait = new WebDriverWait(driver,10);
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(elementlocator)));
                break;
            }
            catch(Exception e)
            {
                i++;
            }
        }
    }

    public void loginPopupCloseIfPresent(){
        Boolean elementPresent = driver.findElement(loginPopupTitle).isDisplayed();
        if (elementPresent == true)
        {
        click(loginPopupCloseBtn);
        }
        else
        {
            System.out.println("There is no login popup to close");
        }
    }
    public void searchItem(String itemName)throws IOException{
        Actions actions = new Actions(driver);
        driver.findElement(searchTextbox).sendKeys(itemName);
        driver.findElement(searchTextbox).sendKeys(Keys.ENTER);
        actions.moveToElement(driver.findElement(searchTextbox)).perform();
        Reports.extentTest.log(Status.INFO,"Search Item is "+itemName, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
    }
    public void verifySearchItem(String itemName) throws IOException
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String actualItemName = driver.findElement(firstSearchResultLink).getText();
        try
        {
            Assert.assertTrue(actualItemName.contains(itemName),"Search Item not listing, actual search item listed is "+actualItemName);
            Reports.extentTest.log(Status.PASS,"Listed Search item contains "+actualItemName, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
        }
        catch (Exception e)
        {
            Reports.extentTest.log(Status.FAIL,"Search item not listed, actual search item listed is "+actualItemName,MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
        }
    }
    public void verifyNoResultFound()throws IOException{
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        boolean noResultLabel=driver.findElement(noResultFoundLabel).isDisplayed();
        Assert.assertTrue(noResultLabel,"No result found label not displayed");
        Reports.extentTest.log(Status.PASS,"No result found label is showing for invalid search ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
    }
    public void goToSearchItemDetailsPage(By searhResultLink) throws IOException{
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(searhResultLink)));
        String firstItemNameFromTheList=driver.findElement(searhResultLink).getText();
        click(searhResultLink);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ArrayList<String> windowhandleIds = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(windowhandleIds.get(1));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(addToCartBtn_DetailsPage)));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String itemNameDetailsPage = driver.findElement(itemName_DetailsPage).getText();
        Assert.assertEquals(firstItemNameFromTheList,itemNameDetailsPage,"Item name in the details page not matching with the selected item");
        Reports.extentTest.log(Status.PASS,"Selected item name = "+firstItemNameFromTheList+" and Item listed in the Details page = "+itemNameDetailsPage+" is same ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
    }
    public void addToCartFunctionality() throws IOException {
        String itemNameDetailsPage = driver.findElement(itemName_DetailsPage).getText();
        click(addToCartBtn_DetailsPage);
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(addToCartPageTitle)));
        String itemNameInAddCart = driver.findElement(addToCartItemName).getText();
        Assert.assertEquals(itemNameDetailsPage,itemNameInAddCart,"Item name in details page and Item name in Addcart not matching");
        Reports.extentTest.log(Status.PASS,"Item name in details page = "+itemNameDetailsPage+" and Item listed in the AddCart = "+itemNameDetailsPage+" is same ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
        click(addToCartRemoveBtn);
    }
    public void removeFromCartFunctionality() throws IOException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(alerttext)));
        click(alertCancelButton);
        boolean removePageLabel=driver.findElement(afterRemovePage).isDisplayed();
        Assert.assertTrue(removePageLabel,"Missing cart item label not displayed");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Reports.extentTest.log(Status.PASS,"Missing Cart items? label is showing for remove ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());

    }
    public void itemSortFunctionality() throws IOException, InterruptedException {
        click(sortFunctionLink);
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(firstSortElement)));
        String firstItemNameInList=driver.findElement(firstSortElement).getText();
        Reports.extentTest.log(Status.PASS,"First Item name in the list is = "+firstItemNameInList, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
        List<String> priceList=new ArrayList<String>();
        List<WebElement> listOfPrice=driver.findElements(itemPrice);
        for (WebElement itemPrice:listOfPrice)
        {
            Thread.sleep(2000);
            priceList.add(itemPrice.getText());
        }
        List<String> actualPriceList = priceList;
        Collections.sort(priceList);
        Assert.assertTrue(priceList.equals(actualPriceList));
        Reports.extentTest.log(Status.PASS,"Price list are in sort order of High to Low price", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
    }
    public void verifyRegisteredAddrs()throws IOException{
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(startFooter)));
        String flipkartaddress=driver.findElement(registeredOfficeAddress).getText();
        String expectedAddress="Mail Us:\n"+"Flipkart Internet Private Limited,\n" +
                "Buildings Alyssa, Begonia &\n" +
                "Clove Embassy Tech Village,\n" +
                "Outer Ring Road, Devarabeesanahalli Village,\n" +
                "Bengaluru, 560103,\n" +
                "Karnataka, India";
        Assert.assertEquals(expectedAddress,flipkartaddress,"Address in the footer is not matching with the given address");
        Reports.extentTest.log(Status.PASS,"Given Address  = "+expectedAddress+" and Address given in the footer = "+flipkartaddress+" is same ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());

    }

    public void verifyListOfOffers()throws IOException{
        click(topOfferLink);
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(dealOfTheDay)));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String firstNameInList=driver.findElement(dealOfTheDay).getText();
        Reports.extentTest.log(Status.PASS,"The offer name in the list is = "+firstNameInList, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
    }
    public void clickBuyNowForAnItem()throws IOException{
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(itemDetailsPage)));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        click(buyNowButton);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        boolean pageTitle=driver.findElement(loginOrSignupPage).isDisplayed();
        Assert.assertTrue(pageTitle,"User not navigated to the login/signupPage");
        Reports.extentTest.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());

    }
    public void footerTextValidation()throws IOException{
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(aboutInFooter)));
        boolean about=driver.findElement(aboutInFooter).isDisplayed();
        boolean contactUs=driver.findElement(contactUsUnderAbout).isDisplayed();
        boolean career=driver.findElement(careerUnderAbout).isDisplayed();
        boolean press=driver.findElement(pressUnderAbout).isDisplayed();
        Assert.assertTrue(about,"User not navigate to footer");
        Assert.assertTrue(contactUs,"ContactUs not listed under ABOUT");
        Assert.assertTrue(career,"Career not listed under ABOUT");
        Assert.assertTrue(press,"Press not listed under ABOUT");
        Reports.extentTest.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());

    }
    public void moreDropdownFunctionality()throws IOException,InterruptedException{

        WebDriverWait wait=new WebDriverWait(driver,10);
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(moreOption)).perform();
        List<WebElement> listElement=driver.findElements(moreOptionList);
        for (WebElement element:listElement) {
            Thread.sleep(1000);
            String optionText=element.getText();
            Reports.extentTest.log(Status.PASS,"Options in the list = "+optionText);
        }
        Reports.extentTest.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
    }
    public void validateTotalAmountInCart()throws IOException{
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(searchResultLinkForMobile)));
        String firstItemNameFromTheList=driver.findElement(searchResultLinkForMobile).getText();
        click(searchResultLinkForMobile);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ArrayList<String> windowhandleIds = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(windowhandleIds.get(1));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(addToCartBtn_DetailsPage)));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String itemNameInDetailsPage = driver.findElement(itemDetailsPageName).getText();
        Assert.assertTrue(itemNameInDetailsPage.contains(firstItemNameFromTheList),"Item name in the details page not matching with the selected item");
        Reports.extentTest.log(Status.PASS,"Selected item name = "+firstItemNameFromTheList+" and Item listed in the Details page = "+itemNameInDetailsPage+" is same ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        click(addToCartBtn_DetailsPage);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(mycartPageTitle)));
        String priceMycart=driver.findElement(priceUnderMycart).getText();
        String priceInDetails=driver.findElement(priceUnderPriceDetails).getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(priceMycart,priceInDetails,"Price under Mycart and Price under Pricedetails are not matching");
        Reports.extentTest.log(Status.PASS,"Price under Mycart  = "+priceMycart+" and Price given under the Pricedetails = "+priceInDetails+" is same ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());

    }
    public void verifyTheMostExpensiveItemName(String itemName) throws IOException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,60);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(firstItemShown)));
        String actualItemName = getText(firstItemShown);
        try
        {
            Assert.assertTrue(actualItemName.contains(itemName),"Search Item not listing, actual search item listed is "+actualItemName);
            Reports.extentTest.log(Status.PASS,"Listed Search item contains "+actualItemName, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
        }
        catch (Exception e)
        {
            Reports.extentTest.log(Status.FAIL,"Search item not listed, actual search item listed is "+actualItemName,MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
        }
        click(sortLink);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(mostExpensiveItem)));
        click(sortLink);
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        String firstItemInSortedList=driver.findElement(mostExpensiveItem).getText();
        Reports.extentTest.log(Status.PASS,"The most expensive item in the list is "+firstItemInSortedList,MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
    }
    public void VerifyInvalidPinCode(String pincode) throws IOException {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.CONTROL + "a");
        actions.sendKeys(Keys.DELETE);
        driver.findElement(pincodeTextField).sendKeys(pincode);
        click(pincodeCheckLinkBtn);
        Assert.assertTrue(driver.findElement(pincodeValidationMsg).isDisplayed(),"Invalid Pincode validation message not showing");
        Reports.extentTest.log(Status.PASS,"Invalid pincode validation message is showing",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
    }
    public void VerifyValidPinCode(String pincode) throws IOException {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.CONTROL + "a");
        actions.sendKeys(Keys.DELETE);
        driver.findElement(pincodeTextField).sendKeys(pincode);
        click(pincodeCheckLinkBtn);
        Assert.assertTrue(driver.findElement(pincodeDelveryByLabel).isDisplayed(),"Invalid Pincode validation message not showing");
        Reports.extentTest.log(Status.PASS,"Valid pincode Entered and Delivery By Label is showing",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
    }
    public void validateTotalAmountOfMultipleItem()throws IOException{
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(firstItemInTheList)));
        String firstNameFromTheList=driver.findElement(firstItemInTheList).getText();
        click(firstItemInTheList);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ArrayList<String> windowhandleIds = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(windowhandleIds.get(1));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(addCartButton)));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String itemNameInDetailsPage = driver.findElement(firstItemDetailPage).getText();
        Assert.assertTrue(itemNameInDetailsPage.contains(firstNameFromTheList),"Item name in the details page not matching with the selected item");
        Reports.extentTest.log(Status.PASS,"Selected item name = "+firstNameFromTheList+" and Item listed in the Details page = "+itemNameInDetailsPage+" is same ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        click(addCartButton);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(myCartTitle).isDisplayed(),"mycart page is not showing");
        Reports.extentTest.log(Status.PASS,"Mycart Label is showing",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.switchTo().window(windowhandleIds.get(0));
        Assert.assertTrue(driver.findElement(secondItemInTheList).isDisplayed(),"Home page is not showing");
        Reports.extentTest.log(Status.PASS,"Homepage is showing",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());



        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(secondItemInTheList)));
        String secondNameFromTheList=driver.findElement(secondItemInTheList).getText();
        click(secondItemInTheList);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        windowhandleIds = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(windowhandleIds.get(2));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(addCartButton)));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String secondItemInDetailsPage = driver.findElement(secondItemDetailPage).getText();
        Assert.assertTrue(secondItemInDetailsPage.contains(secondNameFromTheList),"Item name in the details page not matching with the selected item");
        Reports.extentTest.log(Status.PASS,"Selected item name = "+secondNameFromTheList+" and Item listed in the Details page = "+secondItemInDetailsPage+" is same ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
        click(addCartButton);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(totalPriceDetailPage)));
        String fullitemPrice1=driver.findElement(firstItemPrice).getText();
        String fullitemPrice2=driver.findElement(secondItemPrice).getText();
        String aitemPrice1 = fullitemPrice1.replace("₹","");
        String bitemPrice2 = fullitemPrice2.replace("₹","");
        String itemPrice1 = aitemPrice1.replace(",","");
        String itemPrice2 = bitemPrice2.replace(",","");
        int price1=Integer.parseInt(itemPrice1);
        int price2=Integer.parseInt(itemPrice2);
        int total=price1+price2;
        String expectedPrice=String.valueOf(total);
        String fullactualPrice=getText(totalAmount);
        String aactualPrice=fullactualPrice.replace("₹","");
        String actualPrice=aactualPrice.replace(",","");
        Assert.assertEquals(actualPrice,expectedPrice,"Total price is not matching when adding the two mobile prices");
        Reports.extentTest.log(Status.PASS,"Actual price is = "+actualPrice+" and Expected price  = "+expectedPrice+" is same ", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());

    }
    public void verifyFilterOption() throws IOException{
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        click(filterOptionLink);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(filterPageTitle)));
        click(filterSubOption);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(filterChangeLabel).isDisplayed(),"Filter is not applied");
        Reports.extentTest.log(Status.PASS,"Filter is applied",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());




    }
}