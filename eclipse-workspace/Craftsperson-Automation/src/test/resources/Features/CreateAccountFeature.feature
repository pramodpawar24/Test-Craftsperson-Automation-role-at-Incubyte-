#Author: Test Craftsperson-Automation role at Incubyte
#Date : 28-12-2024
#Description
Feature: feature to Create New Customer Account

  Scenario: Successful Create Account with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://magento.softwaretestingboard.com/"
    Then Click on Create an Account link
    Then Enter the First Name
    Then Enter the Last Name
    Then Fill up the Email id
    Then Fill up the Password
    Then Fill up the Confirm Password
    And Click on Create an Account button
    And close browser
