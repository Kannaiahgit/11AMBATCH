Feature: New Customer Form

  @Sanity
  Scenario: New Customer
    Given Opne Chorme  Browser
    And Open URL "https://www.demo.guru99.com/v4"
    When Login ID Login Password
    And Click on Submit
    And Redirect to Bankpage
    And Click on New Customer
    Then Fill the details and submit
