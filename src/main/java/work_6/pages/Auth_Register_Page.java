package work_6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Auth_Register_Page {

    WebDriver driver;

    public Auth_Register_Page(WebDriver driver) {
        this.driver = driver;
    }

    public  By sponsor_field = By.xpath("//label[text()='Логин спонсора']//following-sibling::input");

    public  By users_login_field = By.xpath("//label[text()='Ваш логин']//parent::div//following-sibling::input");

    public  By users_email_field = By.xpath("//label[text()='Введите email']//parent::div//following-sibling::input");

    public  By password_field = By.xpath("//label[text()='Введите пароль']//parent::div//following-sibling::input");

    public  By confirm_password_field = By.xpath("//label[text()='Подтвердите пароль']//parent::div//following-sibling::input");

    public  By checkbox = By.xpath("//div[@class='web__StyledComponent-sc-1g5mbds-0 iLNYrL']");

    public  By register_button = By.xpath("//div[@class='web__StyledComponent-sc-1g5mbds-0 UpaNx']");


}
