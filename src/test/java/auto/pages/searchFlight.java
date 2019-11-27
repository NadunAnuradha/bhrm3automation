package auto.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.sikuli.script.FindFailed;
import auto.utility.services;
import org.sikuli.script.Key;
import org.sikuli.script.Match;
import org.sikuli.script.Region;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class searchFlight {


    final static String TITLE = "RD Web Access";

    public searchFlight NDCLHsearch () throws FindFailed, InterruptedException {
        Thread.sleep(5000);
        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\Fra.png");
        services.screen.wait( services.pattern,5000);
        services.screen.click();
        services.screen.type("Oslo Luftha");
        services.screen.type(Key.TAB);
        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\Til.png");
        services.screen.wait( services.pattern,3000);
        services.screen.click();
        services.screen.type("Frankfurt In");
        services.screen.type(Key.TAB);
        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\Flyselskap.png");
        services.screen.wait( services.pattern,1000);
        services.screen.click();
        services.screen.type("LH");        //Thread.sleep(5000);
        //services.screen.click(Key.TAB);
        services.screen.wait( services.pattern,1000);
        //services.screen.type("LH" + Key.TAB +Key.BACKSPACE + "20. november 2019" + Key.ENTER);
        Thread.sleep(1000);
        services.screen.type(Key.TAB );
        Thread.sleep(1000);
        //services.screen.type(Key.DELETE);
        Thread.sleep(1000);
        services.screen.type("10. 2020");
        services.screen.type(Key.LEFT );
        Thread.sleep(1000);
        services.screen.type("j");
        Thread.sleep(1000);
        services.screen.type(Key.TAB );
        services.screen.type("06:00 - 10:00");
        services.screen.type(Key.TAB+Key.TAB );
        services.screen.type("11. 2020");
        services.screen.type(Key.LEFT );
        Thread.sleep(1000);
        services.screen.type("j");
        services.screen.type(Key.TAB );
        services.screen.wait( services.pattern,1000);
        services.screen.type("15:00 - 19:00");
        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\Nybestling.png");
        services.screen.wait( services.pattern,1000);
        services.screen.click();
        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\Webgate.png");
        services.screen.wait( services.pattern,1000);
        services.screen.click();


        Thread.sleep(25000);


        return this;

    }
}
