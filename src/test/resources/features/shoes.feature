Feature: ShoesBuy
  i need buy a shoes
  Scenario: Buy Shoes
    Given he user enter the website with his credentials
      | user  | pass       |
      | 55555 | 3felipe180 |
    When  the user select the nmodule bolsos-bomboneras
    Then the user will buy a product