Feature: Register

  Scenario: register correctly
    Given he user enter the website
    Then he user fills out data to be able to register on the page
      | nameuser   | emaiuser                     | passworduser  |
      | 1061811717 | miltonerneymeneses@gamil.com | Rosa987654321 |
    When he user fill succesfully