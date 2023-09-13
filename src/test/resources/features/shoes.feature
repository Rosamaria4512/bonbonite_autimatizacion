Feature: ShoesBuy
  i need buy a shoes
  Scenario: Buy Shoes
    Given he user enter the website
    When  the user select the module shoes_tenis
    Then the user will buy a product

    Scenario: Agregate a product a list_wish
      Given he user enter the website
      When the user select the module shoes-tenis and selecte option list_wish
      Then the will veryfy that the shoes,that is in the my account module-wish list

