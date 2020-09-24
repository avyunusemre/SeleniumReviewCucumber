Feature: Amazon Urun Arama
  @amazonurunarama
  Scenario Outline: TC06_kullanici amazonda urun aramasi yapar
    Given kullanici "http://amazon.com" sayfaya gider
    And kullanici aramakutusuna "<kelime>" yazar
    Then kullanici sonuc sayisiniekrana yazdirir

    Examples:
      | kelime |
      |headphones|
      |tv        |
      |sponge    |

