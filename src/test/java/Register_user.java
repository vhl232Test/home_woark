import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import work_5_selenium.pages.Cabinet_Page;
import work_5_selenium.pages.Register_Auth_Pages;
import work_5_selenium.util_class.Utils_class;

public class Register_user {

    WebDriver driver;
    Utils_class utils_class = new Utils_class();
    Register_Auth_Pages register_auth_pages;
    Cabinet_Page cabinet_page;

    @BeforeClass
    void set_prop(){
        driver = utils_class.set_driver();

        register_auth_pages = new Register_Auth_Pages(driver);
        cabinet_page = new Cabinet_Page(driver);
    }

    @Test
    void reg_user(){

        register_auth_pages.register_user(utils_class.register_page_url,utils_class.admin_name,
                utils_class.users_name,utils_class.users_Email,utils_class.users_password);

        String name_page_from_cab = cabinet_page.return_page_name();

        String for_check = "Кабине";
        Assert.assertEquals(name_page_from_cab, for_check);

    }
    @AfterClass
    void quit(){
        driver.quit();
    }

}
