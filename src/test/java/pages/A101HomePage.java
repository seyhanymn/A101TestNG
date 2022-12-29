package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class A101HomePage {

    public A101HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Kabul Et']")
    public WebElement cerezKabulEt;

    @FindBy(xpath = "(//*[@title='GİYİM & AKSESUAR'])[1]")
    public WebElement giyimAksesuar;

    @FindBy(xpath = "//*[text()='Kadın İç Giyim']")
    public WebElement kadınIcGiyim;


    @FindBy(xpath = "(//*[@class='js-filter-link '])[2]")
    public WebElement dizAltıCorap;

    @FindBy(xpath = "(//*[@title='Penti Kadın 50 Denye Pantolon Çorabı Siyah'])[1]")
    public WebElement urunSec;

    @FindBy(xpath = "(//*[@class='slick-slide slick-current slick-active'])[2]")
    public WebElement siyahCorap;

    @FindBy(xpath = "//*[text()='SİYAH']")
    public WebElement siyahRenkYazısı;

    @FindBy(xpath= "//*[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepeteEkle;

    @FindBy(xpath= "//*[@class='go-to-shop']")
    public WebElement sepetiGoruntule;

    @FindBy(xpath= "//*[@class='button green checkout-button block js-checkout-button']")
    public WebElement sepetiOnayla;

    @FindBy(xpath= "//*[@class='auth__form__proceed js-proceed-to-checkout-btn']")
    public WebElement uyeOlmadanDevamEt;

    @FindBy(xpath= "//*[@name='user_email']")
    public WebElement email;

    @FindBy(xpath= "//*[@class='button block green']")
    public WebElement emailIleDevamEt;

    @FindBy(xpath= "(//*[@class='new-address js-new-address'])[1]")
    public WebElement yeniAdresOlustur;

    @FindBy(xpath= "//*[@placeholder='Ev adresim, iş adresim vb.']")
    public WebElement adresBaslıgı;
    @FindBy(xpath= "(//*[@name='first_name'])[1]")
    public WebElement ad;

    @FindBy(xpath= "//*[@name='city']")
    public WebElement il;

    @FindBy(xpath= "//*[@name='township']")
    public WebElement ilce;

    @FindBy(xpath= "//*[@name='district']")
    public WebElement mahalle;

    @FindBy(xpath= "//*[@name='line']")
    public WebElement adres;

    @FindBy(xpath= "//*[@class='button green address-modal-submit-button js-set-country js-prevent-emoji js-address-form-submit-button']")
    public WebElement kaydet;

    @FindBy(xpath= "//*[@class='js-checkout-cargo-item'][1]")
    public WebElement kargo;

    @FindBy(xpath= "//*[@class='button green js-proceed-button block']")
    public WebElement kaydetDevamEt;

    @FindBy(xpath= "//span[@class='order-complete']")
    public WebElement siparisiTamamla;
}
