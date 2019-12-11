Feature: Navigate to weathermap

Scenario Outline: Navigate to weathermap
Given Runmode is "<Runmode>"
Given I go to "AUT_url" on "<Browser>"
Then the "Navbar_Header" element should be present
When "test1212" is entered into the "City_Search_Textbox" editbox
And I click on "Search_Button"
Then the "Error_Message" element should be present
When "London" is entered into the "City_Search_Textbox" editbox
And I click on "Search_Button"
Then the "City_Name" element should be present
Then validate the response for "London" city through OpenWeather "GET" API 

Examples:
| Runmode | Browser | 
|    Y    | Chrome  | 
|    N    | Mozilla |