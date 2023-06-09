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