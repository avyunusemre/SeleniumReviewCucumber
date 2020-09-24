@googleArama
Feature: Google arama

  Background: Kullanici google sayfasina gider
    Given kullanici google sayfasina gider

  @tecproeducationArama
  Scenario: TC01_kullanici google'da techproeducation aramasi yapar
    And arama kutusuna techproeducation yazar
    Then arama sonuclari sayfasinin basligini kontrol eder

  @seleniumArama
  Scenario: TC02_kullanici google'da selenium araması yapar
    And arama kutusuna selenium yazar
    Then arama sonuclari sayfasinin sonuc sayisini kontrol eder