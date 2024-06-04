
  @US002
  Feature: US002 BlueRentalCar sayfasinda Login test

    Scenario: TC01 Verilen email ve password ile login olunur

      Given kullanici blueRentalCar sayfasina gider
      But kullanici 5 saniye bekler
      When login butonuna tiklar
      But kullanici 5 saniye bekler
      And email ve password bilgileri ile login olur
      But kullanici 5 saniye bekler
      And sayfayi kapatir
