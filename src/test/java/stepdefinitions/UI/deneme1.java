package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.velocity.runtime.directive.Parse;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class deneme1 {
    String sonuc;
    GooglePage googlePage=new GooglePage();

    @Given("Kullanici google {string} sayfasina gider")
    public void kullaniciGoogleSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }
    @Then("Kullanici cookies i kabul eder")
    public void kullanici_cookies_i_kabul_eder() {
        googlePage.cookies.click();
    }
    @Then("Arama Kutusuna karsilastirma yapmak istedigi {string} para birimlerini girer")
    public void aramaKutusunaKarsilastirmaYapmakIstedigiParaBirimleriniGirer(String degerler) {
        googlePage.googleAramaKutusu.sendKeys(degerler+ Keys.ENTER);
    }
    @Then("Para birimlerinin karsilastirmasini alir")
    public void para_birimlerinin_karsilastirmasini_alir() {
     sonuc=googlePage.karsilastirmaSonucu.getText();
        System.out.println(sonuc);
    }
    @Then("Verilen degerlerin {int} den kucuk oldugunu dogrular")
    public void verilenDegerlerinDenKucukOldugunuDogrular(int sayi) {
        Assert.assertTrue(Double.parseDouble(sonuc)<sayi);
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
     Driver.closeDriver();
    }



}
