Feature: Login

  Scenario: Login succesfully
    Given he user enter the website
    Then he user enter credentials in the website
      | nameuser   | passworduser  |
      | 1061811717 | Rosa987654321 |
    When he user successfully logged