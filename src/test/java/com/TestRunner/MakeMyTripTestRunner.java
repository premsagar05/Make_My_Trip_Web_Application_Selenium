package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		junit = "--step-notifications",
//		plugin = {"json:target/cucumber.json", //create a HTML and JSON report in target folder
//		  "html:target"},
				plugin = {"pretty","json:target/Cucumber.json",                            //JSON, XML and HTML reports

		                "junit:target/Cucumber.xml",

		                "html:target/Cucumber.html",

		                "html:test-output"},
        features ="src\\test\\resources\\Features", //path of the feature file
        glue= {"com.step_definitions"},
      	//package name of step definition file
       
       tags = {"@Flights"}  //tags want to run
       // tags = {"@Oneway_isenabled"}
		//tags = {"@one_way"}
		//tags = {"@Popular_filters"}
		//tags = {"@Get_Applyfilter_text"}
		//tags = {"@view_flight_details"}
        //tags = {"@Get_URLs"}
       //tags = {"@MyProfile"}
       //tags = {"@Samecity_oneway"}
		//tags = {"@More_Infants"}
		
)

public class MakeMyTripTestRunner {

}
