package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CurrenciesPage {

    public WebDriver driver ;
    public CurrenciesPage(WebDriver driver) {
        this.driver = driver;
    }

    private By go=  By.xpath("//div[@class=\"currency-selector\"]");
    public void go() {
         driver.findElement(go).click();
    }

    private By change=  By.xpath("//select [@id=\"customerCurrency\"]");
    public WebElement change() {
       return driver.findElement(change);
    }
}
