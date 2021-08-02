package work_6.util_methods;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util_meths {

    WebDriver driver;

    public Util_meths(WebDriver driver) {
        this.driver = driver;
    }

    public void driver_navigate_to(String url){
        driver.get(url);
    }

    public void send_keys(String str, By element){

        new WebDriverWait(driver,10)
                .until(ExpectedConditions.elementToBeClickable(element));
        try{
            driver.findElement(element).sendKeys(str);

        }
        catch (StaleElementReferenceException e){
            driver.findElement(element).sendKeys(str);
        }

    }

    public String get_text(By element){
        try {
            return new WebDriverWait(driver,10)
                    .until(ExpectedConditions.elementToBeClickable(element)).getText();

        }
        catch (StaleElementReferenceException e){
            return  new WebDriverWait(driver,10)
                    .until(ExpectedConditions.elementToBeClickable(element)).getText();
        }



    }

    public String get_attribute(By element, String attribute_name){

        new WebDriverWait(driver,10)
                .until(ExpectedConditions.elementToBeClickable(element));

        try{
            return driver.findElement(element).getAttribute(attribute_name);
        }
        catch (StaleElementReferenceException e){
            return driver.findElement(element).getAttribute(attribute_name);
        }
    }

    public void scroll_on_element(By element){

        new WebDriverWait(driver,10)
                .until(ExpectedConditions.elementToBeClickable(element));

        WebElement element1 = driver.findElement(element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            js.executeScript("arguments[0].scrollIntoView();", element1);
        }
        catch (StaleElementReferenceException e){
            js.executeScript("arguments[0].scrollIntoView();", element1);
        }



    }

    public void js_click(By element){

        new WebDriverWait(driver,10)
                .until(ExpectedConditions.elementToBeClickable(element));

        WebElement element1 = driver.findElement(element);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {

            js.executeScript("arguments[0].click()", element1);
        }
        catch (StaleElementReferenceException e){
            js.executeScript("arguments[0].click()",element1);
        }

    }

    public void clear_method(By element){
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.elementToBeClickable(element));
        try{
            driver.findElement(element).clear();

        }
        catch (StaleElementReferenceException e){
            driver.findElement(element).clear();
        }

    }
}
