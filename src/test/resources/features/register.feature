Feature: Register

  Scenario: register correctly
    Given he user enter the website
    Then he user fills out data to be able to register on the page
        | nameuser       | emaiuser       | passworduser |
        | rosa1061785948 | rosa@gamil.com | Rosa4512     |
    When he user fill succesfully