Feature: Bag buy
  i need buy a bag

  Scenario: Buy of bag the module "Carrito",Login
    Given he user enter the website
    When he user enter with his credential and select a product of mudule bolsos-bonboneras and complete de facturation
      | user  | pass       |
      | 55555 | 3felipe180 |
    Then he user will see the price of his buy
  Scenario: Buy of Bag the Module "Mi carrito",not Login
    Given he user enter the website
    When The user select a product in the Wallets module carrito and complete the forms for facturation
      | name         | surname  | n_documento | email                 | phone      | adrres            | code_zip | user    | password |
      | Sebas Camilo | Ro Ortiz | 1212008089  | camilocpo90@gmail.com | 4524244242 | Cl.125A No. 56-26 | 110911   | 5550123 | 5550123  |
    Then the user would have bought a bag


  Scenario: Aggregate of Bag Successfull the "Lista de deseos",not Login
    Given he user enter the website
    When the user login and selects a product in the Wallets module, and selects the add to wish list
      | user  | pass       |
      | 55555 | 3felipe180 |
    Then the will veryfy that the product,that is in the my account module-wish list


  Scenario: Aggregate of Bag Successfull the "Mi carrito" not Login
    Given he user enter the website
    When The user select a product in the Wallets module
    Then the user will buy a Bag











