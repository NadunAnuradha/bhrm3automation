package auto.utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.*;
import java.util.Properties;



public class driverfactory {

    private  String browser;
    public static Properties prop;
    public WebDriver getDriver (){
        browser = driverfactory.prop.getProperty("db.browser") ;
        //browser ="ie";
        if (browser.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("ie")){
            File file = new File("C:\\Exilesoft\\IE\\IEDriverServer.exe");
            System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
            return new InternetExplorerDriver();
        } else

        return new FirefoxDriver();
    }
    public  driverfactory(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Exilesoft\\bhrm3automation\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
