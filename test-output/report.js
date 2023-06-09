$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Flights_oneway.feature");
formatter.feature({
  "name": "Booking flight",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Flights"
    }
  ]
});
formatter.scenario({
  "name": "check the one way button is selected or not",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Flights"
    },
    {
      "name": "@Oneway_isenabled"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_on_the_flight_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user to check the one way button is selected or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Flight_oneway_trip.user_to_check_the_one_way_button_is_selected_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Booking of flight under one way",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Flights"
    },
    {
      "name": "@one_way"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_on_the_flight_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on one way button",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_click_on_one_way_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the from city",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_from_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the to city",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_to_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the date of traveling",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_date_of_traveling()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the details of passengers",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_enter_the_details_of_passengers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search",
  "keyword": "And "
});
formatter.match({
  "location": "Flight_oneway_trip.click_on_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to see the available flights",
  "keyword": "Then "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_able_to_see_the_available_flights()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "filter the flights using Popular Filters",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Flights"
    },
    {
      "name": "@Popular_filters"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_on_the_flight_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on one way button",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_click_on_one_way_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the from city",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_from_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the to city",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_to_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the date of traveling",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_date_of_traveling()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the details of passengers",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_enter_the_details_of_passengers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search",
  "keyword": "And "
});
formatter.match({
  "location": "Flight_oneway_trip.click_on_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to select the popular filters",
  "keyword": "Then "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_able_to_select_the_popular_filters()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "get selected filters text",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Flights"
    },
    {
      "name": "@Get_Applyfilter_text"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_on_the_flight_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on one way button",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_click_on_one_way_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the from city",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_from_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the to city",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_to_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the date of traveling",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_date_of_traveling()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the details of passengers",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_enter_the_details_of_passengers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search",
  "keyword": "And "
});
formatter.match({
  "location": "Flight_oneway_trip.click_on_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to selected filters text",
  "keyword": "Then "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_able_to_selected_filters_text()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "select the fare type student",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Flights"
    },
    {
      "name": "@select_fare_type_student"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_on_the_flight_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on one way button",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_click_on_one_way_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the from city",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_from_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the to city",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_to_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the date of traveling",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_date_of_traveling()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the details of passengers",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_enter_the_details_of_passengers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search",
  "keyword": "And "
});
formatter.match({
  "location": "Flight_oneway_trip.click_on_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user to select the fare type",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_to_select_the_fare_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to see the text",
  "keyword": "Then "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_able_to_see_the_text()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "see the flight details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Flights"
    },
    {
      "name": "@view_flight_details"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_on_the_flight_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on one way button",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_click_on_one_way_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the from city",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_from_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the to city",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_to_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the date of traveling",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_date_of_traveling()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the details of passengers",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_enter_the_details_of_passengers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search",
  "keyword": "And "
});
formatter.match({
  "location": "Flight_oneway_trip.click_on_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is to select view flight details",
  "keyword": "Then "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_to_select_view_flight_details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "get url\u0027s",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Flights"
    },
    {
      "name": "@Get_URLs"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_on_the_flight_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on different modules",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_click_on_different_modules()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "select the same from city and to city",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Flights"
    },
    {
      "name": "@Samecity_oneway"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_on_the_flight_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on one way button",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_click_on_one_way_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the from city",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_from_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the same city as from city",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_same_city_as_from_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to see error text",
  "keyword": "Then "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_able_to_see_error_text()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "select more infants for one adult",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Flights"
    },
    {
      "name": "@More_Infants"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_on_the_flight_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on one way button",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_click_on_one_way_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the from city",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_from_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the to city",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_to_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the date of traveling",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_the_date_of_traveling()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select more Infants than adults",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_select_more_Infants_than_adults()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to see the Infant error text",
  "keyword": "Then "
});
formatter.match({
  "location": "Flight_oneway_trip.User_is_able_to_see_Infant_ErrorText()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "go to My Profile",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Flights"
    },
    {
      "name": "@MyProfile"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "Flight_oneway_trip.user_is_on_the_flight_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user to click on profile",
  "keyword": "When "
});
formatter.match({
  "location": "Flight_oneway_trip.user_to_click_on_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on MyProfile",
  "keyword": "And "
});
formatter.match({
  "location": "Flight_oneway_trip.click_on_MyProfile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user be in myprofile page",
  "keyword": "Then "
});
formatter.match({
  "location": "Flight_oneway_trip.user_be_in_myprofile_page()"
});
formatter.result({
  "status": "passed"
});
});