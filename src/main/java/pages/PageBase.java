package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PageBase {
    protected WebDriver driver;
    public JavascriptExecutor jse;
    public Select select;
    public Actions actions;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected static void clickOnElement(WebElement element) {
        element.click();
    }

    protected static void setTxtElement(WebElement element, String text) {
        element.sendKeys(text);
    }

    protected static void clearTxtElement(WebElement element){
        element.clear();
    }

    protected static void openPage(WebElement pageLink) {
        pageLink.click();
    }

    public void scrollTo(String scroll) {
        jse = (JavascriptExecutor) driver;
        jse.executeScript("scrollBy(0," + scroll + ")");
    }
//0
    public LoginPage loginpage(){
        return new LoginPage(driver);
    }

    public RegistrationPage registrationPage(){
        return new RegistrationPage(driver);
    }

    public MyAccountPage myAccountPage(){
        return new MyAccountPage(driver);
    }

    public SearchPage searchPage(){
        return new SearchPage(driver);
    }

    public WishlistPage wishlistPage(){ return new WishlistPage(driver); }

    public FilterWithColorPage filterWithColorPage(){ return new FilterWithColorPage(driver); }

    public CategoriesPage categoriesPage(){ return new CategoriesPage(driver); }

    public CurrenciesPage currenciesPage(){ return new CurrenciesPage(driver); }

    public TagsPage tagsPage(){ return new TagsPage(driver); }

    public CompareListPage compareListPage(){ return new CompareListPage(driver); }

    public CartPage cartPage(){ return new CartPage(driver); }

    public OrderPage orderPage(){ return new OrderPage(driver); }

}
