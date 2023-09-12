Feature: Bag buy
  i need buy a bag
  Scenario: Buy of Bag Successfull
    Given he user enter the website with his credentials
      | user  | pass       |
      | 55555 | 3felipe180 |
    When the user select the module bolsos-bomboneras and select a product
    Then the user will buy a Bag