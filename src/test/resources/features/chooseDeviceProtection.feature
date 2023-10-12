Feature: Device Protection

  Scenario Outline: Select specific value for device protection
    Given im in the device protection screen
    And I select the "<devicePurchasePrice>"
    Then I should see the "<price>" per month
    Examples:
      | devicePurchasePrice | price |
      | THB 6,001 - 10,000  | 59.00|

  Scenario: Select random value for device protection
    Given im in the device protection screen
    And I select any device protection
    Then I should see the respective price per month
