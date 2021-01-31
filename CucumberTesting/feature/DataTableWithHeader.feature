Feature: To verify naurkri Search functionality
Scenario: To Verifying the home page search button
Given We are in mariiott page and the url is "https://www.naukri.com/"
When We enter intputs in the home page
| Designation 	  | Location  |
| Software Tester | Bengaluru |
Then We can see job lists based ont the inputs entered


