Feature: To search a job
Scenario: Positive Scenario
Given user navigated to naukri url using "https://www.naukri.com/"
When he enters designation as "Software Tester" and location as "Bengaluru"
And click on search button
Then it should list jobs available

