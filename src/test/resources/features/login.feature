Feature: Login

  Scenario: Login succesfully
    Given he user enter the website
    When he user enter credentials in the website
      | nameuser   | passworduser  |
      | 1061811717 | Rosa987654321 |
    Then he user successfully logged


    Scenario: Incorrect Login
      Given he user enter the website Bonbonite
      When he entre the wrong credential
        | nameuser   | passworduser  |
        | 10618117145| Rosa987654322 |
      Then he will log in incorrectly
