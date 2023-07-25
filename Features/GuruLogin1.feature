Feature: Login with Valid Credentials

  @Sanity
  Scenario: Login page
    Given Opne Chorme  Browser
    And Open URL "https://www.demo.guru99.com/v4"
    When Login ID Login Password
    And Click on Submit
    Then Redirect to Bankpage
