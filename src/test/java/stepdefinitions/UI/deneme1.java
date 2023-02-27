package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

public class deneme1 {
    @Given("Kullanici google sayfasina gider")
    public void kullanici_google_sayfasina_gider() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("Kullanici cookies i kabul eder")
    public void kullanici_cookies_i_kabul_eder() {

    }
    @Then("Arama Kutusuna karsilastirma yapmak istedigi para birimlerini girer")
    public void arama_kutusuna_karsilastirma_yapmak_istedigi_para_birimlerini_girer() {

    }
    @Then("Para birimlerinin karsilastirmasini alir")
    public void para_birimlerinin_karsilastirmasini_alir() {

    }
    @Then("Verilen degerleri dogrular")
    public void verilen_degerleri_dogrular() {

    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {

    }
}
