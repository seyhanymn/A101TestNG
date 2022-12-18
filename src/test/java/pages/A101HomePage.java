package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
}
