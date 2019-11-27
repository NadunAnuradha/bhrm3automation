package auto.pages;

import auto.utility.services;
import org.sikuli.script.FindFailed;

public class flightBook {

    public flightBook VerifyFlightBook() throws InterruptedException, FindFailed {
        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\Fortsett.png");
        services.screen.wait(services.pattern, 1000);
        services.screen.click();
        Thread.sleep(5000);

        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\Bestill.png");
        services.screen.wait(services.pattern, 1000);
        services.screen.click();
        Thread.sleep(10000);

        return this;

    }
}
