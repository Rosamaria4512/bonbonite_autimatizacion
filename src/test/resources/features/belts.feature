Feature: Belts

  Scenario: make a purchase of belts
    Given he user enter the website
    When he user makes a purchase
      | nameuser   | passworduser  | name   | lastname | identification | phone      | addrees | codigo |
      | 1061811717 | Rosa987654321 | Milton | Meneses  | 1061785948     | 3164706984 | jungla  | 2330   |
    Then he user makes a purchase succesfully