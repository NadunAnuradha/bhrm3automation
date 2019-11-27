package auto.utility;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class init extends driverfactory{
protected WebDriver driver = null;

@BeforeMethod (alwaysRun = true)
    public void setup(){
    if (driver==null) {
        driver = getDriver();
        driver.get(driverfactory.prop.getProperty("db.m3url"));
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
}

@AfterMethod (alwaysRun = true)
    public void teardown(){

    if (driver != null)
        driver.quit();
}


}
