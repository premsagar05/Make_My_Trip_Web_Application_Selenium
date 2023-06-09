@Flights
Feature: Booking flight

@Oneway_isenabled
Scenario: check the one way button is selected or not
    Given user is on the flight booking page
     Then user to check the one way button is selected or not

@one_way
Scenario: Booking of flight under one way
    Given user is on the flight booking page
     When user click on one way button
     When user select the from city
     When user select the to city
     When user select the date of traveling
     When user enter the details of passengers
      And click on search
     Then user is able to see the available flights

@Popular_filters
Scenario: filter the flights using Popular Filters
    Given user is on the flight booking page
     When user click on one way button
     When user select the from city
     When user select the to city
     When user select the date of traveling
     When user enter the details of passengers
      And click on search
     Then user is able to select the popular filters

@Get_Applyfilter_text
Scenario: get selected filters text
    Given user is on the flight booking page
     When user click on one way button
     When user select the from city
     When user select the to city
     When user select the date of traveling
     When user enter the details of passengers
      And click on search
     Then user is able to selected filters text

@select_fare_type_student
Scenario: select the fare type student
    Given user is on the flight booking page
     When user click on one way button
     When user select the from city
     When user select the to city
     When user select the date of traveling
     When user enter the details of passengers
      And click on search
     When user to select the fare type
     Then user is able to see the text 


@view_flight_details
Scenario: see the flight details
    Given user is on the flight booking page
     When user click on one way button
     When user select the from city
     When user select the to city
     When user select the date of traveling
     When user enter the details of passengers
      And click on search
     Then user is to select view flight details

@Get_URLs
Scenario: get url's
    Given user is on the flight booking page
     When user click on different modules

@Samecity_oneway
Scenario: select the same from city and to city
    Given user is on the flight booking page
     When user click on one way button
     When user select the from city
     When user select the same city as from city
     Then user is able to see error text


@More_Infants
Scenario: select more infants for one adult
    Given user is on the flight booking page
     When user click on one way button
     When user select the from city
     When user select the to city
     When user select the date of traveling
     When user select more Infants than adults
     Then user is able to see the Infant error text


@MyProfile
Scenario: go to My Profile
    Given user is on the flight booking page
     When user to click on profile
      And click on MyProfile
     Then user be in myprofile page



