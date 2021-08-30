Feature: Amazon Aramado

  Background:

  @amazonarama
  Scenario: TC01_kullanici amazon urun arare
    Given kullanici amazon sayfasina gider
    And kulanici aramakutusuna iphone yazar
    Then kullanici sonucu ekrana yazdiriran

    Scenario Outline: kullanici "W3school" sayfasina gider

      Example:  |amazon|
                |Walmart|
