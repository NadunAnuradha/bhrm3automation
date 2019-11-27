package auto.testcases;

import auto.pages.*;
import auto.utility.init;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestcheapestLHLight extends init {


    @Test (priority = 1)
    public void TestnavigateToM3 () throws InterruptedException, FindFailed, FindFailed {

        navigateToM3 NavigateToM3 = new navigateToM3 (driver);
        NavigateToM3.verifyM3PageTitle();
        NavigateToM3.ClickM3();
        NavigateToM3.clickTUA();
        NavigateToM3.selectPC();
        NavigateToM3.clickConnect();
        NavigateToM3.enterPassword();
        NavigateToM3.clickpasswordOk();

    }

    @Test (priority = 2)
    public void TestnavigatetoM3Flight () throws InterruptedException, FindFailed, FindFailed {

        navigatetoM3Flight NavigatetoM3Flight = new navigatetoM3Flight ();
        NavigatetoM3Flight.TACsearch();
        NavigatetoM3Flight.Legg_til_i_passasjerliste();

    }
    @Test (priority = 3)
    public void TestsearchFlight () throws InterruptedException, FindFailed, FindFailed {

        searchFlight SearchFlight= new searchFlight ();
        SearchFlight.NDCLHsearch();

    }

    @Test (priority = 4)
    public void TestflightResults () throws InterruptedException, FindFailed, FindFailed {

        flightResults FlightResults= new flightResults ();
        FlightResults.VerifyFlightResultsWithFeatures();

    }

    @Test (priority = 5)
    public void TestflightBook () throws InterruptedException, FindFailed, FindFailed {

        flightBook FlightBook_and_afterSummary= new flightBook();
        FlightBook_and_afterSummary.VerifyFlightBook();
        Assert.fail();
    }

    @Test (priority = 6, dependsOnMethods = { "TestflightBook" })
    public void TestflightafterSummary () throws InterruptedException, FindFailed, FindFailed {

        flightafterSummary FlightafterSummary= new flightafterSummary();
        FlightafterSummary.VerifyafterSummary();


    }

}
