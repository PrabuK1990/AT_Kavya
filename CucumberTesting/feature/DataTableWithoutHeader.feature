Feature: Search functionality
Scenario: Verifying search button
Given I am in mariiott url as "https://www.naukri.com/"
When I enter credentials
| Software Tester | Bengaluru |
Then i can see job lists