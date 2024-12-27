Feature: feature to test login functionality

  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://magento.softwaretestingboard.com/"
    Then Click on Sign In link
    And User enters Email as "pawarpramod6154@gmail.com" and Password as "Pramod@123"
    And Click on SignIn
