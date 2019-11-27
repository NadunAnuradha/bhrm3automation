package auto.pages;
import org.sikuli.script.FindFailed;
import auto.utility.services;

public class navigatetoM3Flight {

    public navigatetoM3Flight TACsearch () throws FindFailed, InterruptedException {

        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\Expand.png");
        services.screen.wait( services.pattern,5000);
        services.screen.click();
        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\TAC.png");
        services.screen.wait( services.pattern,3000);
        services.screen.type("1057607");
        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\Sok.png");
        services.screen.wait( services.pattern,1000);
        services.screen.click();
        return this;
    }

    public navigatetoM3Flight Legg_til_i_passasjerliste () throws FindFailed, InterruptedException {

        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\TravellerName.png");
        services.screen.wait( services.pattern,1000);
        services.screen.rightClick();
        services.screen.wait( services.pattern,1000);
        services.pattern.setFilename("C:\\Exilesoft\\bhrm3automation\\SikuliObjects\\Legg_til_i_passasjerliste.png");
        services.screen.wait( services.pattern,1000);
        services.screen.click();

        return this;
    }

}
