package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Samplecode {
	WebDriver driver;
	static WebDriverWait wait;
//-----------------------------------------------------------------------------------------
	//user to check the one way is selected or not
	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[1]/span")
	WebElement oneway_button1;
	
	public void oneway_enable_check() {
		
		boolean enable = oneway_button1.isSelected();
		System.out.println(enable);
		if(enable == false)
		{
			System.out.println("The oneway button is not selected");
		}
		else {
		    System.out.println("it is selected");
		}
	}
//==================================================================================================================	
	
	//Booking the flight under one way
	
	@FindBy(how=How.XPATH, using="//li[@data-cy='oneWayTrip']")
	WebElement onewaytrip_button;

	@FindBy(how=How.ID, using="fromCity")
	WebElement from;
	
	@FindBy(how=How.XPATH, using="//li[@id='react-autowhatever-1-section-1-item-5']")
	WebElement from_city;
	
	@FindBy(how=How.ID, using="toCity")
	WebElement to;
	
	@FindBy(how=How.XPATH, using = "//li[@id='react-autowhatever-1-section-1-item-3']")
	WebElement to_city;
	
	@FindBy(how=How.XPATH, using = "//div[@aria-label='Wed Jun 28 2023']")
	WebElement date;
	
	@FindBy(how=How.XPATH, using = "//div[@data-cy='flightTraveller']")
	WebElement travellers_n_class;
	
	@FindBy(how=How.XPATH, using = "//li[@data-cy='adults-1']")
	WebElement adult_1;
	
	@FindBy(how=How.XPATH, using = "//li[@data-cy='adults-2']")
	WebElement adult_2;
	
	@FindBy(how=How.XPATH, using = "//li[@data-cy='adults-3']")
	WebElement adult_3;
	
	@FindBy(how=How.XPATH, using = "//li[@data-cy='children-0']")
	WebElement child_0;
	
	@FindBy(how=How.XPATH, using = "//li[@data-cy='children-1']")
	WebElement child_1;
	
	@FindBy(how=How.XPATH, using = "//li[@data-cy='children-2']")
	WebElement child_2;
	
	@FindBy(how=How.XPATH, using = "//li[@data-cy='infants-0']")
	WebElement infant_0;
	
	@FindBy(how=How.XPATH, using = "//li[@data-cy='infants-1']")
	WebElement infant_1;
	
	@FindBy(how=How.XPATH, using = "//li[@data-cy='infants-2']")
	WebElement infant_2;
	
	@FindBy(how=How.XPATH, using = "//li[@data-cy='infants-3']")
	WebElement infant_3;
	
	@FindBy(how=How.XPATH, using = "//li[@data-cy='travelClass-0']")
	WebElement travel_class_eco;
	
	@FindBy(how=How.XPATH, using = "//li[@data-cy='travelClass-1']")
	WebElement travel_class_PE;
	
	@FindBy(how=How.XPATH, using = "//li[@data-cy='travelClass-2']")
	WebElement travel_class_BU;
	
	@FindBy(how=How.XPATH, using = "//button[@data-cy='travellerApplyBtn']")
	WebElement apply_button;
	
	@FindBy(how=How.XPATH, using = "//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
	WebElement search_button;
	
	@FindBy(how=How.XPATH, using = "//p[@class='font24 blackFont whiteText appendBottom20 journey-title']")
	WebElement available_flights_text;
	
	public Samplecode(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, 30);
	}
	
	public void Oneway() throws Exception {
		Thread.sleep(5000);
		if(!onewaytrip_button.isSelected()) 
		{
    		onewaytrip_button.click();
		}
	}
	
	public void From() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(from));
		from.click();
		wait.until(ExpectedConditions.elementToBeClickable(from_city));
	}
	
	public void To() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(to));
		to.click();
		wait.until(ExpectedConditions.elementToBeClickable(to_city));
		to_city.click();
	}
	
	public void Date() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(date));
		date.click();
	}
	
	public void Traveller_Class() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(travellers_n_class));
		travellers_n_class.click();
	}
	
	public void Adult_1() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(adult_1));
		adult_1.click();
	}
	
	public void Adult_2() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(adult_2));
		adult_2.click();
	}
	
	public void Adult_3() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(adult_3));
		adult_3.click();
	}
	
	public void Child_0() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(child_0));
		child_0.click();
	}
	
	public void Child_1() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(child_1));
		child_1.click();
	}
	
	public void Child_2() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(child_2));
		child_2.click();
	}
	
	public void Infant_0() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(infant_0));
		infant_0.click();
	}
	
	public void Infant_1() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(infant_1));
		infant_1.click();
	}
	
	public void Infant_2() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(infant_2));
		infant_2.click();
	}
	
	public void Infant_3() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(infant_3));
		infant_3.click();
	}
	
	public void Choose_Travel_Class_ECO() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(travel_class_eco));
		travel_class_eco.click();
	}
	
	public void Choose_Travel_Class_PE() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(travel_class_PE));
		travel_class_PE.click();
	}
	
	public void Choose_Travel_Class_BU() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(travel_class_BU));
		travel_class_BU.click();
	}
	
	public void Apply_Button() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(apply_button));
		apply_button.click();
	}
	
	public void Search_Button() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(search_button));
		search_button.click();
	}
	
	public void Available_Flights_Page_Text() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(available_flights_text));
		String Available_Flights = available_flights_text.getText();
		System.out.println(Available_Flights);
	}
	
//-------------------------------------------------------------------------------------------
    //User selecting the Popular Filters
	
	@FindBy(how=How.XPATH, using = "//span[@class='linkText pointer']")
	WebElement click_on_more;
	
	@FindBy(how=How.XPATH, using = "//span[@class='commonCheckbox sizeSm primaryCheckbox']")
	WebElement select_indigo_filter;
	
	public void Popular_Filter() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(click_on_more));
		click_on_more.click();
		wait.until(ExpectedConditions.elementToBeClickable(select_indigo_filter));
		select_indigo_filter.click();
	}
	
//---------------------------------------------------------------------------------------------------------------
	
	//Selected filter text
		
	@FindBy(how=How.XPATH, using = "//p[@class='filtersHeading appendBottom15']")
	WebElement applied_filter_text;
	public void Applied_Filter_Text() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(applied_filter_text));
		String Filter_text = applied_filter_text.getText();
		System.out.println(Filter_text);
		}

	
	
	
//--------------------------------------------------------------------------------------------
	
	//selecting the fare type student
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/header/div[2]/div/ul/li[3]/span[1]")
	WebElement select_student;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"search-button\"]/span")
	WebElement select_search;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/p[1]/font")
	WebElement student_text;
	
	
	public void FareType_Student() {
    	wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(select_student));
        select_student.click();
	}
	
	public void Search_for_student() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(select_search));
		select_search.click();
	}
	
	public void Text_after_selecting_student() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(student_text));
		String student_message = student_text.getText();
		System.out.println(student_message);
	}
	
//--------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using = "//*[@id=\"flightDetailsTab-0-tabpane-1\"]/div/p")
	WebElement Onboarding_date;
	
	@FindBy(how=How.ID, using = "flightDetailsTab-0-tab-2")
	WebElement Fare_Summary;
	
	
	public void View_Flight_Details() throws Exception {
//		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
//        jsExecutor.executeScript("arguments[0].click();", Onboarding_date);
		

		Thread.sleep(6000);
		String onboard = Onboarding_date.getText();
		System.out.println(onboard);
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Fare_Summary));
		Fare_Summary.click();
		String fare = Fare_Summary.getText();
		System.out.println(fare);
	}
	
//-------------------------------------------------------------------------------------------
	////span[@class='chNavText darkGreyText']
//getting URL's
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/div/a/span[2]")
	WebElement flight;
	
	public void GetURL() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(flight));
		flight.click();
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String title = driver.getTitle();
		System.out.println(title);
	}

//----------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using = "//p[@data-cy='loggedInUser']")
	WebElement click_profile;
	
	@FindBy(how=How.XPATH, using = "//p[@class=\"font16 latoBold blackText appendBottom5 makeFlex hrtlCenter\"]")
	WebElement click_myProfile;
	
	@FindBy(how=How.XPATH, using = "//h3[@class='font30 latoBold blackText']")
	WebElement profile_text;
	
	public void MyProfile() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(click_profile));
		click_profile.click();
		wait.until(ExpectedConditions.elementToBeClickable(click_myProfile));
		click_myProfile.click();
	}
	
	public void MyAccount() {
		String pro_text = profile_text.getText();
		System.out.println(pro_text);
	}
	
//------------------------------------------------------------------------------------------------------------------
	
//same from and to City
	
	@FindBy(how=How.XPATH, using="//li[@id='react-autowhatever-1-section-1-item-5']")
	WebElement to_city_1;

	@FindBy(how=How.XPATH, using="//span[@data-cy=\"sameCityError\"]")
	WebElement Error_msg;
	


	public void Same_City() {
		wait = new WebDriverWait(driver, 30);
		to.click();
		to_city_1.click();
	}

	public void OneWay_error() {
		String ERROR=Error_msg.getText();
		System.out.println(ERROR);
		String error_text =driver.getTitle();
		System.out.println("The Error message is:" + error_text);
	}

//------------------------------------------------------------------------------------------
	//MoreInfant

	@FindBy(how=How.XPATH, using ="//p[@data-cy=\"infantWarning\"]")
	WebElement Infant_Error;

	public void Oneway_1() {
		if(!onewaytrip_button.isSelected()) {
			onewaytrip_button.click();

		}
	}


	public void OnewayTrip_travellerClass2() {
		//wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(traveller_class_roundtrip));
		travellers_n_class.click();

	}


	public void OnewayTrip_adult() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(One_adult_roundtrip));
		adult_2.click();

	}



	public void OnewayTrip_child() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(zero_child_roundtrip));
		child_0.click();

	}


	public void OnewayTrip_Infant() {
		infant_3.click();
	}

	public void Infant_error2() {
		String INFANT_ERROR=Infant_Error.getText();
		System.out.println(INFANT_ERROR);
		String INFANT_ERROR1 =driver.getTitle();
		System.out.println("PAGE :" + INFANT_ERROR1);
	}

	

}
