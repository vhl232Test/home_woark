package work_5_selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cabinet_Page {

    WebDriver driver;

    public Cabinet_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class = 'web__StyledComponent-sc-1g5mbds-0 iPEqQg']/p")
    WebElement page_name;

    public String return_page_name(){
       return new WebDriverWait(driver,10)
               .until(ExpectedConditions.visibilityOf(page_name)).getText();

    }
}
