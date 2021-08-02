package work_5_selenium.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_Auth_Pages {

    WebDriver driver;

    public Register_Auth_Pages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//label[text()='Логин спонсора']//following-sibling::input")
    WebElement sponsor_field;
    @FindBy(xpath = "//label[text()='Ваш логин']//parent::div//following-sibling::input")
    WebElement users_login_field;
    @FindBy(xpath = "//label[text()='Введите email']//parent::div//following-sibling::input")
    WebElement users_email_field;
    @FindBy(xpath = "//label[text()='Введите пароль']//parent::div//following-sibling::input")
    WebElement password_field;
    @FindBy(xpath = "//label[text()='Подтвердите пароль']//parent::div//following-sibling::input")
    WebElement confirm_password_field;
    @FindBy(xpath = "//div[@class='web__StyledComponent-sc-1g5mbds-0 iLNYrL']")
    WebElement checkbox;
    @FindBy(xpath = "//div[@class='web__StyledComponent-sc-1g5mbds-0 UpaNx']")
    WebElement register_button;


    public void register_user(String reg_url,String sponsor, String users_name,String users_email,
            String password){

        driver.get(reg_url);

        new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(sponsor_field))
                .sendKeys(sponsor);
        users_login_field.sendKeys(users_name);
        users_email_field.sendKeys(users_email);
        password_field.sendKeys(password);
        confirm_password_field.sendKeys(password);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", checkbox);
        executor.executeScript("arguments[0].click()", register_button);
        //register_button.click();

    }
}
