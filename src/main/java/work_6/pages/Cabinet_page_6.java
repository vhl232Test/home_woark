package work_6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cabinet_page_6 {

    WebDriver driver;

    public Cabinet_page_6(WebDriver driver) {
        this.driver = driver;
    }

    public By page_name = By.xpath("//div[@class = 'web__StyledComponent-sc-1g5mbds-0 iPEqQg']/p");

}
