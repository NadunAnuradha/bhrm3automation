package auto.pages;


import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;
import org.sikuli.script.FindFailed;
import auto.utility.services;

public class navigateToM3  {
    WebDriver driver;

    final static String TITLE = "RD Web Access";
    public navigateToM3(WebDriver driver) {
        this.driver = driver;
    }
    public navigateToM3 verifyM3PageTitle() {
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, TITLE,
                "Actual title " + actualTitle + " should be same as expected " + TITLE);
        return this;
    }

    public navigateToM3 ClickM3() throws FindFailed, InterruptedException {


       services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\M3.png");
       services.screen.wait( services.pattern,2000);
       services.screen.doubleClick();
       Thread.sleep(1000);
       return this;
    }

    public  navigateToM3 clickTUA() throws FindFailed, InterruptedException {

        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\M3tua.png");
        services.screen.wait( services.pattern,2000);
        services.screen.click();
        Thread.sleep(1000);
        return this;
    }

    public  navigateToM3 selectPC () throws FindFailed, InterruptedException {

        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\SelectPc.png");
        services.screen.wait( services.pattern,2000);
        services.screen.click();
        Thread.sleep(1000);
        return this;
    }


    public  navigateToM3 clickConnect () throws FindFailed, InterruptedException {

        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\Connect.png");
        services.screen.wait( services.pattern,2000);
        services.screen.click();
        Thread.sleep(1000);
        return this;
    }

    public  navigateToM3 enterPassword () throws FindFailed, InterruptedException {

        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\password.png");
        services.screen.wait( services.pattern,2000);
        services.screen.type("October1213");
        Thread.sleep(1000);
        return this;
    }


    public  navigateToM3 clickpasswordOk () throws FindFailed, InterruptedException {

        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\passwordOK.png");
        services.screen.wait( services.pattern,2000);
        services.screen.click();
        Thread.sleep(1000);
        return this;
    }
}
