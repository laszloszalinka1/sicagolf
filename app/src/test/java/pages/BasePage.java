package pages;

import org.bouncycastle.util.Properties;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private static Actions action;
    
    static{
        ChromeOptions options = new ChromeOptions();
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\automation\\herculesCompensar\\app\\src\\test\\resources\\webDriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    
        action = new Actions(driver);
    }
    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }
    
    public static void navigateTo(String url){
        driver.get(url);

    }
    public static void logout(){
        driver.quit();
    }
    public WebElement find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public void clickElement(String locator){
        find(locator).click();
    }
    public void write(String locator,String textToWrite){
        find(locator).clear();
        find(locator).sendKeys(textToWrite);
    }
    public void selectedFromDropdownByValue(String locator, String valueToSelect){
        Select dropdown = new Select(find(locator));
        dropdown.selectByValue(valueToSelect);

    }
    public void selectedFromDropdownByIndex(String locator, int valueToSelect){
        Select dropdown = new Select(find(locator));
        dropdown.selectByIndex(valueToSelect);

    }
    public void selectedFromDropdownByText(String locator, String valueToSelect){
        Select dropdown = new Select(find(locator));
        dropdown.selectByVisibleText(valueToSelect);
    }
    public void hoverOverelement(String locator){
        action.moveToElement(find(locator));
    }
    public void doubleClick(String locator){
        action.doubleClick(find(locator));
    }
    public void rightClick(String locator){
        action.contextClick(find(locator));
    }
    public String getValueFromTable(String locator, int row, int column){
        String cellINeed = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        return find(cellINeed).getText();


    }
    public String textFromElement(String locator){
        return find(locator).getText();
    }
}
