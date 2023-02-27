@smoke
Feature: Google Arama Testi

    Background: Before
    Given Kullanici google "https://www.google.com" sayfasina gider
    Then  Kullanici cookies i kabul eder

  Scenario Outline: Arama Kutusu Testi

    Then  Arama Kutusuna karsilastirma yapmak istedigi "<testEdilecekParaBirimleri>" para birimlerini girer
    Then  Para birimlerinin karsilastirmasini alir
    Then  Verilen degerlerin 21 den kucuk oldugunu dogrular
    And   Kullanici sayfayi kapatir
    Examples:
      | testEdilecekParaBirimleri |
      | Euro to dollar  |
      | Euro to Tl |
      | Dollar to TL |
      | Dollar to zloty  |
    |   Zloty to Tl                |


  Scenario: ARAMA KUTUSU TESTI 2
     Then  Arama Kutusuna karsilastirma yapmak istedigi "dollar to tl" para birimlerini girer
     Then  Para birimlerinin karsilastirmasini alir
     Then  Verilen degerlerin 21 den kucuk oldugunu dogrular
     And   Kullanici sayfayi kapatir




