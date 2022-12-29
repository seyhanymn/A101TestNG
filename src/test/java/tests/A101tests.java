package tests;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.A101HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.File;
import java.io.IOException;


public class A101tests  extends TestBaseRapor {

    //Kullanıcı A101 sayfasına gider
    //      Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap ürününü seçer
    //      Açılan ürünün siyah olduğunu doğrular
    //      Sepete ekle butonuna tıklar
    //      Sepeti Görüntüle butonuna tıklar
    //      Sepeti Onayla butonuna tıklar
    //      Üye olmadan devam et butonuna tıklanır
    //      Mail ekranı gelir ve mail adresini girerek alışverişine devam eder
    //      Sonrasında adres ekranı gelir. Adres oluştur dedikten sonra ödeme ekranı gelir
    //      Siparişi tamamla butonunun oldugu görülür
    //
    @Test
    public void test01() throws InterruptedException, IOException {
        //extentTest = extentReports.createTest("alloverUrl", "Web automation Raporlama");
        TakesScreenshot ts=(TakesScreenshot)Driver.getDriver();
        File tumSayfaResmi=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tumSayfaResmi,new File("target/screenshots.jpeg"));

        extentTest=extentReports.createTest("pozitif Test","Web automation Raporlama");

        A101HomePage a101HomePage=new A101HomePage();
        Actions actions = new Actions(Driver.getDriver());

        ReusableMethods reusableMethods=new ReusableMethods();
        Faker faker=new Faker();
        String isAdresi="BarısMah.CumhuriyetCadd.Sinop";
        String adres="AliMah.AtatürkCaddesi";

        //Kullanıcı A101 sayfasına gider

        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        extentTest.info("Belirtilen url e gidildi");

        a101HomePage.cerezKabulEt.click();
        //      Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap ürününü seçer
        actions.moveToElement(a101HomePage.giyimAksesuar).perform();
        extentTest.info("Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap ürününü seçildi");
        a101HomePage.kadınIcGiyim.click();
        Thread.sleep(1000);
        a101HomePage.dizAltıCorap.click();
        extentTest.info("diz altı çorap seçildi");

        Thread.sleep(1000);

        //      Açılan ürünün ten olduğunu doğrular

        a101HomePage.urunSec.click();
        a101HomePage.siyahCorap.click();
        String gercekRenk=a101HomePage.siyahRenkYazısı.getText();

        String beklenenürünrenk = "SİYAH";
        Assert.assertEquals(beklenenürünrenk, gercekRenk);
        extentTest.info("beklenen Ürürnün siyah corap oldugu dogrulandı");

        //      Sepete ekle butonuna tıklar
        Thread.sleep(1000);
       a101HomePage.sepeteEkle.click();
        extentTest.info("istenen ürün sepete eklendi");


        //      Sepeti Görüntüle butonuna tıklar
        Thread.sleep(1000);
        a101HomePage.sepetiGoruntule.click();
        //      Sepeti Onayla butonuna tıklar
        Thread.sleep(1000);
        a101HomePage.sepetiOnayla.click();
        extentTest.info("sepet onaylandı");

        //      Üye olmadan devam et butonuna tıklanır
        reusableMethods.jsExecutorClick(a101HomePage.uyeOlmadanDevamEt);

        //      Mail ekranı gelir ve mail adresini girerek alışverişine devam eder
        a101HomePage.email.sendKeys(faker.internet().emailAddress());
        extentTest.info("email adresi girildi");
        a101HomePage.emailIleDevamEt.click();

        //      Sonrasında adres ekranı gelir. Adres oluştur dedikten sonra ödeme ekranı gelir
        a101HomePage.yeniAdresOlustur.click();
        Thread.sleep(1000);
        a101HomePage.adresBaslıgı.click();
        a101HomePage.adresBaslıgı.sendKeys(isAdresi);
        actions.click(a101HomePage.ad).sendKeys(faker.name().firstName());
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(faker.name().lastName());
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(faker.phoneNumber().cellPhone()).perform();
        a101HomePage.il.sendKeys("SİNOP");
        Thread.sleep(1000);
        a101HomePage.ilce.sendKeys("BAYKAN");
        Thread.sleep(1000);
        a101HomePage.mahalle.sendKeys("ADAKALE KÖYÜ ");
        Thread.sleep(1000);
        a101HomePage.adres.sendKeys(adres);
        a101HomePage.kaydet.click();
        reusableMethods.jsExecutorClick(a101HomePage.kaydet);
        extentTest.info("gerekli bilgiler girilerek kaydedildi ve yeni adres olusturuldu");


        //      Siparişi tamamla butonunun oldugu görülür
        Thread.sleep(1000);

        a101HomePage.kargo.click();
        extentTest.info("kargo seçildi");
        a101HomePage.kaydetDevamEt.click();
        extentTest.info("devam ete basıldı");
        Thread.sleep(1000);
        String gerceksonuc="Siparişi Tamamla";
        String beklenenSonuc=a101HomePage.siparisiTamamla.getText();
        System.out.println(beklenenSonuc);
        Assert.assertEquals(gerceksonuc, beklenenSonuc);
        extentTest.pass("sayfaya gidildi ve istenen islemler gerceklestirildi");







    }
}
