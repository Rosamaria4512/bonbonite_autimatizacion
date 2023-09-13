Feature: Register

  Scenario: register correctly
    Given he user enter the website
    When he user fills out data to be able to register on the page
      | nameuser   | emaiuser                     | passworduser  |
      | 1061811717 | miltonerneymeneses@gamil.com | Rosa987654321 |
    Then he user fill succesfully