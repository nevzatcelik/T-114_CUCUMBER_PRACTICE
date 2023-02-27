package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {

    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Reject all']")
    public WebElement cookies;

    @FindBy(xpath = "//input[@class='gLFyf']")
    public WebElement googleAramaKutusu;

    @FindBy(xpath = "//span[@class='DFlfde SwHCTb']")
    public WebElement karsilastirmaSonucu;
}
