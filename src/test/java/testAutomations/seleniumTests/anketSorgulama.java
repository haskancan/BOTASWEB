package testAutomations.seleniumTests;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class anketSorgulama extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//tbody/tr[4]/td[7]/a[1]")
    public WebElement projeSecimButonu;

    @FindBy(xpath = "//body/div[1]/div[4]/div[1]/div[2]/a[1]/img[1]")
    public WebElement haritaSecimButonu;

    @FindBy(xpath = "//header/div[2]/nav[1]/div[2]/ul[3]/li[4]/a[1]")
    public WebElement AnketSorgulama;

    @FindBy(xpath = "//p[contains(text(),'Anket Sorgulama')]")
    public WebElement anketSorgulaIslevi;

    @FindBy(xpath = "//input[@id='survey-started-date']")
    public WebElement tarihSecimi;

    @FindBy(xpath = "//button[contains(text(),'Sorgula')]")
    public WebElement sorgulaButonu;


    @FindBy(xpath = "//td[contains(text(),'5004768')]")
    public WebElement anketAcButonu;


    @Test
    public void testanketSorgulama() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(2000);

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }
        Fwait.until(ExpectedConditions.visibilityOf(projeSecimButonu));
        projeSecimButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(haritaSecimButonu));
        haritaSecimButonu.click();

//        Fwait.until(ExpectedConditions.visibilityOf(magazaKatmaniAcmaButonu));
//        magazaKatmaniAcmaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(AnketSorgulama));
        AnketSorgulama.click();

        Fwait.until(ExpectedConditions.visibilityOf(anketSorgulaIslevi));
        anketSorgulaIslevi.click();

        Fwait.until(ExpectedConditions.visibilityOf(tarihSecimi));
        tarihSecimi.click();
        tarihSecimi.sendKeys("02052020");

        Fwait.until(ExpectedConditions.visibilityOf(sorgulaButonu));
        sorgulaButonu.click();


        Fwait.until(ExpectedConditions.visibilityOf(anketAcButonu));

        Actions haritadagit = new Actions(driver);
        haritadagit.doubleClick(anketAcButonu).perform();


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);

    }
}

