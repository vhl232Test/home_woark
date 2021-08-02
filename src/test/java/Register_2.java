import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import work_6.pages.Auth_Register_Page;
import work_6.pages.Cabinet_page_6;
import work_6.util_class.Util_class_6;
import work_6.util_methods.Util_meths;

public class Register_2 {

    Auth_Register_Page auth_register_page;
    Util_class_6 util_class_6 = new Util_class_6();
    WebDriver driver;
    Util_meths util_meths;
    Cabinet_page_6 cabinet_page_6;

    @BeforeClass
    public void set_prop(){
        driver = util_class_6.set_driver();
        auth_register_page = new Auth_Register_Page(driver);
        util_meths = new Util_meths(driver);
        cabinet_page_6 = new Cabinet_page_6(driver);
    }


    @Test
    public void register(){
        util_meths.driver_navigate_to(util_class_6.register_page_url);

        util_meths.clear_method(auth_register_page.sponsor_field);

        util_meths.send_keys(util_class_6.admin_name, auth_register_page.sponsor_field);

        String atr = util_meths.get_attribute(auth_register_page.sponsor_field,"placeholder");
        System.out.println(atr);

        util_meths.send_keys(util_class_6.users_name, auth_register_page.users_login_field);
        util_meths.send_keys(util_class_6.users_Email, auth_register_page.users_email_field);
        util_meths.send_keys(util_class_6.users_password, auth_register_page.password_field);
        util_meths.send_keys(util_class_6.users_password, auth_register_page.confirm_password_field);

        util_meths.scroll_on_element(auth_register_page.checkbox);

        util_meths.js_click(auth_register_page.checkbox);
        util_meths.js_click(auth_register_page.register_button);

        String name_page_from_cab = util_meths.get_text(cabinet_page_6.page_name);

        String for_check = "Кабине";
        Assert.assertEquals(name_page_from_cab, for_check);
    }

    @AfterClass
    public void quit(){
        driver.quit();
    }


}
