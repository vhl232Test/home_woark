package work_5_selenium.util_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils_class {

        WebDriver driver;

        public WebDriver set_driver(){
                System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();

                //driver.get(url_login_form);
                driver.manage().window().maximize();
                return driver;
        }

        public String register_page_url = "https://kornoukh1.testfront.tcl.zendo.cloud/ru/authentication/register";

        public String admin_name = "admin";

        public String users_password = "123456a";

        public String users_name = "qq" + (int)(Math.random()*(100000+1));

        public String users_Email = users_name + "@g.com";




}
