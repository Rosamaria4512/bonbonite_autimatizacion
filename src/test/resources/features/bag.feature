Feature: Bag buy
  i need buy a bag
  Scenario: Buy of Bag the Module "Mi carrito"
    Given he user enter the website
    When The user select a product in the Wallets module carrito and complete the forms for facturation
      | name            | surname | n_documento | email              | phone       | adrres   | code_zip      |
      | Cristian Camilo | Ruano   | 123456789   | camilo90@gmail.com | 09787654321 | Cra 3#42 | fr4frw3444555 |
    Then the user would have bought a bag


  Scenario: Aggregate of Bag Successfull the "Lista de deseos"
    Given he user enter the website
    When the user login and selects a product in the Wallets module, and selects the add to wish list
      | user  | pass       |
      | 55555 | 3felipe180 |
    Then the will veryfy that the product,that is in the my account module-wish list

  Scenario: Aggregate of Bag Successfull the "Mi carrito"
    Given he user enter the website
    When The user select a product in the Wallets module
    Then the user will buy a Bag



