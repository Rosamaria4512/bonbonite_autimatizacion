Feature: Bag buy
  i need buy a bag
  Scenario: Buy of Bag Successfull
    Given he user enter the website
    When The user select a product in the Wallets module
    Then the user will buy a Bag

  Scenario: Aggregate of Bag Successfull
    Given he user enter the website
    When the user selects a product in the Wallets module, and selects the add to wish list
    Then the will veryfy that the product,that is in the my account module-wish list