package auto.pages;

import auto.utility.services;
import org.sikuli.script.FindFailed;

public class flightafterSummary {

        public flightafterSummary VerifyafterSummary() throws InterruptedException, FindFailed {

            services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\TilleggstJenster.png");
            services.screen.wait( services.pattern,1000);
            services.screen.click();
            Thread.sleep(5000);

            services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\VelgSete.png");
            services.screen.wait( services.pattern,1000);
            services.screen.click();
            Thread.sleep(5000);
            return this;

        }
}
