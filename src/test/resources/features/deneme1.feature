
Feature: Google Arama Testi
  @nevzat
  Scenario: Arama Kutusu Testi

    Given Kullanici google sayfasina gider
    Then  Kullanici cookies i kabul eder
    Then  Arama Kutusuna karsilastirma yapmak istedigi para birimlerini girer
    Then  Para birimlerinin karsilastirmasini alir
    Then  Verilen degerleri dogrular
    And   Kullanici sayfayi kapatir

  Scenario: dolar kontrol testi

    Then Kullanici google sayfasina gider
