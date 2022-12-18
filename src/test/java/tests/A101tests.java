package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.A101HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class A101tests {

    //Kullanıcı A101 sayfasına gider
    //      Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap ürününü seçer
    //      Açılan ürünün siyah olduğunu doğrular
    //      Sepete ekle butonuna tıklar
    //      Sepeti Görüntüle butonuna tıklar
    //      Sepeti Onayla butonuna tıklar
    //      Üye olmadan devam et butonuna tıklanır
    //      Mail ekranı gelir ve mail adresini girerek alışverişine devam eder
    //      Sonrasında adres ekranı gelir. Adres oluştur dedikten sonra ödeme ekranı gelir
    //      Siparişi tamamla butonuna tıklar
    //      ödeme ekranına gidildiği ,doğru ekrana yönlendiklerini kontrol edecekler.

    @Test
    public void test01() {
        //extentTest = extentReports.createTest("alloverUrl", "Web automation Raporlama");
        A101HomePage a101HomePage=new A101HomePage();
        Actions actions = new Actions(Driver.getDriver());


        //Kullanıcı A101 sayfasına gider


        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

        a101HomePage.cerezKabulEt.click();
        //      Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap ürününü seçer
        actions.moveToElement(a101HomePage.giyimAksesuar).perform();
        a101HomePage.kadınIcGiyim.click();
        a101HomePage.dizAltıCorap.click();


        //      Açılan ürünün siyah olduğunu doğrular

        //      Sepete ekle butonuna tıklar
        //      Sepeti Görüntüle butonuna tıklar
        //      Sepeti Onayla butonuna tıklar
        //      Üye olmadan devam et butonuna tıklanır
        //      Mail ekranı gelir ve mail adresini girerek alışverişine devam eder
        //      Sonrasında adres ekranı gelir. Adres oluştur dedikten sonra ödeme ekranı gelir
        //      Siparişi tamamla butonuna tıklar
        //      ödeme ekranına gidildiği ,doğru ekrana yönlendiklerini kontrol edecekler.



    }
}
