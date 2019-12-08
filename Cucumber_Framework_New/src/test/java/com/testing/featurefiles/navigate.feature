Feature: Navigate to weathermap

Scenario Outline: Navigate to weathermap
Given Runmode is "<Runmode>"
Given I go to "https://www.rediff.com/" on "<Browser>"


Examples:
| Runmode | Browser | 
|    Y    | Chrome  | 
|    N    | Mozilla | 

