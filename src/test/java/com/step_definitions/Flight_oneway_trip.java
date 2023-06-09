package com.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.PageFactory.Flights_oneway_pagefactory;
import com.driverSetup.Setup_driver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flight_oneway_trip {
	WebDriver driver;
	Flights_oneway_pagefactory fpg;
	
//----------------------------------------Oneway_isenabled-----------------------------------------//
	
	@Given("user is on the flight booking page")
	public void user_is_on_the_flight_booking_page() 
	{
		driver = Setup_driver.chromeDriver();
	    driver.get("https://www.makemytrip.com/");
	    System.out.println("-------------User is in Home Page-------------");
	}
	
	@Then("user to check the one way button is selected or not")
    public void user_to_check_the_one_way_button_is_selected_or_not() 
	{
    	fpg = new Flights_oneway_pagefactory(driver);
		fpg = PageFactory.initElements(driver, Flights_oneway_pagefactory.class);
		System.out.println("-------------It Checked the Button-------------");
		fpg.oneway_enable_check();
        driver.quit();
    }

//------------------------------------Available Flights text----------------------------------------//
	
	
	@When("user click on one way button")
	public void user_click_on_one_way_button() throws Exception 
	{
		fpg = new Flights_oneway_pagefactory(driver);
		fpg = PageFactory.initElements(driver, Flights_oneway_pagefactory.class);
		fpg.Oneway();
		System.out.println("-------------One Way Button is Clicked on MakeMyTrip-------------");
	   
	}

	@When("user select the from city")
	public void user_select_the_from_city() 
	{
	    fpg.From();
	    System.out.println("-------------From is Clicked-------------");
	}

	@When("user select the to city")
	public void user_select_the_to_city() 
	{
	    fpg.To();
	    System.out.println("-------------From City is Selected-------------");
	}

	@When("user select the date of traveling")
	public void user_select_the_date_of_traveling() 
	{
	    fpg.Date();
	    System.out.println("-------------Date field is Clicked-------------");
	    System.out.println("-------------Date is selected-------------");
	}

	@When("user enter the details of passengers")
	public void user_enter_the_details_of_passengers() 
	{
	    fpg.Traveller_Class();
	    fpg.Adult_1();
	    fpg.Child_0();
	    fpg.Infant_0();
	    fpg.Choose_Travel_Class_BU();
	    fpg.Choose_Travel_Class_ECO();
	    fpg.Apply_Button();
	    System.out.println("-------------Details selected under Traveller And Class-------------");
	    
	    
	}

	@When("click on search")
	public void click_on_search() 
	{
	    fpg.Search_Button();
	    System.out.println("-------------Search Button Clicked Successfully-------------");
	}

	@Then("user is able to see the available flights")
	public void user_is_able_to_see_the_available_flights() 
	{
	   fpg.Available_Flights_Page_Text();
	   System.out.println("-------------Successfully go to Available Flights Page-------------");
	   driver.quit();
	}
	

//---------------------------------------Popular Filter-----------------------------------------------//
	
	@Then("user is able to select the popular filters")
	public void user_is_able_to_select_the_popular_filters() 
	{
		fpg.Popular_Filter();
		System.out.println("-------------Popular Filters is Selected-------------");
		driver.quit();
	}

//-----------------------------------Getting Applied Filter Text------------------------------------//
	
	@Then("user is able to selected filters text")
	public void user_is_able_to_selected_filters_text() 
	{
	    fpg.Popular_Filter();
	    fpg.Applied_Filter_Text();
	    System.out.println("-------------Popular Filters is Selected-------------");
	    System.out.println("-------------Applied Filter Text is Printed-------------");
	    driver.quit();
	}

	
//---------------------------------------FareType Student---------------------------------------------//
	
	
	@When("user to select the fare type")
	public void user_to_select_the_fare_type() throws Exception 
	{
		fpg.FareType_Student();
    	fpg.Search_for_student();
    	System.out.println("-------------Fare Type is Selected Successfully-------------");
    	System.out.println("-------------Search button is clicked-------------");
	}
	
    
    @Then("user is able to see the text")
    public void user_is_able_to_see_the_text() 
    {
    	fpg.Text_after_selecting_student();
    	System.out.println("-------------Text is Printed about Student Fare-------------");
    	driver.quit();
    }
    
//---------------------------------------View Flight details-----------------------------------------//
    
    @Then("user is to select view flight details")
    public void user_is_to_select_view_flight_details() throws Exception 
    {
        fpg.View_Flight_Details();
        System.out.println("-------------The text Of Flight Details is Printed-------------");
        System.out.println("-------------The text Of Fare Summary is Printed-------------");
        driver.quit();
    }

//-------------------------------------------getting URL's-------------------------------------------//
    
    @When("user click on different modules")
    public void user_click_on_different_modules() 
    {
    	fpg = new Flights_oneway_pagefactory(driver);
		fpg = PageFactory.initElements(driver, Flights_oneway_pagefactory.class);
        fpg.GetURL();
        System.out.println("-------------URL of the Current Page is Printed-------------");
        driver.quit();
    }
    
	
//---------------------------------Scenario for user selecting same city-------------------------------//

	
	@When("user select the same city as from city")
	public void user_select_the_same_city_as_from_city() 
	{
		fpg = new Flights_oneway_pagefactory(driver);
		fpg = PageFactory.initElements(driver, Flights_oneway_pagefactory.class);
	    fpg.Same_City();
	    System.out.println("-------------Same city selected as From city-------------");
	}
	
	@Then("user is able to see error text")
	public void user_is_able_to_see_error_text() 
	{
		fpg = new Flights_oneway_pagefactory(driver);
		fpg = PageFactory.initElements(driver, Flights_oneway_pagefactory.class);
	    fpg.OneWay_error();
	    System.out.println("-------------Error Message for same city is printed-------------");
	    driver.quit();
	}

	
//----------------------------------selecting more infants than adults-------------------------------//
	
	@When("user select more Infants than adults")
	public void user_select_more_Infants_than_adults() 
	{
		fpg = new Flights_oneway_pagefactory(driver);
		fpg = PageFactory.initElements(driver, Flights_oneway_pagefactory.class);
		fpg.OnewayTrip_travellerClass2();
		fpg.OnewayTrip_adult();
		fpg.OnewayTrip_child();
		fpg.OnewayTrip_Infant();
		System.out.println("-------------Adult, Child And Infant is Selected-------------");
    }
	@Then("user is able to see the Infant error text")
	public void User_is_able_to_see_Infant_ErrorText() 
	{
	   fpg.Infant_error();
	   System.out.println("-------------Error Message for More Infants than Adults is printed-------------");
	   driver.quit();
	}
	
//------------------------------------------Myprofile page--------------------------------------------//
    
    @When("user to click on profile")
    public void user_to_click_on_profile() 
    {
    	fpg = new Flights_oneway_pagefactory(driver);
		fpg = PageFactory.initElements(driver, Flights_oneway_pagefactory.class);
        fpg.MyProfile();
        System.out.println("-------------Profile Icon is clicked-------------");
    }
    @And("click on MyProfile")
    public void click_on_MyProfile() 
    {
    	fpg.Click_on_profile();
    	System.out.println("-------------MyProfile is clicked-------------");
    }

    @Then("user be in myprofile page")
    public void user_be_in_myprofile_page() 
    {
        fpg.MyAccount();
        System.out.println("-------------Text Of the current page is printed -------------");
        driver.quit();
    }


}


