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

public class magazaEkleme extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//tbody/tr[4]/td[7]/a[1]")
    public WebElement projeSecimButonu;

    @FindBy(xpath = "//body/div[1]/div[4]/div[1]/div[2]/a[1]/img[1]")
    public WebElement haritaSecimButonu;

//    @FindBy(xpath = "//body/div[@id='main-content']/div[@id='layer-control']/div[@id='layersplit']/div[@id='layer-list']/div[@id='mCSB_1']/div[@id='mCSB_1_container']/ul[1]/li[2]/span[1]/div[1]")
//    public WebElement magazaKatmaniAcmaButonu;

    @FindBy(xpath = "//header/div[2]/nav[1]/div[2]/ul[3]/li[2]/a[1]")
    public WebElement magazaButonu;

    @FindBy(xpath = "//p[contains(text(),'Mağaza Listesi')]")
    public WebElement magazaSorgulamaButonu;

    @FindBy(xpath = "//button[@id='btn-query-result']")
    public WebElement magazaSorgulaButonu;

    @FindBy(xpath = "//thead/tr[2]/th[2]/input[1]")
    public WebElement idFiltreleme;


    @FindBy(xpath = "//td[contains(text(),'5004760')]")
    public WebElement magazaHaritadaGit;

    @FindBy(xpath = "//body/div[@id='store_panel']/div[1]/div[1]/div[3]/div[6]/span[1]")
    public WebElement magazaPencereKapamaButonu;


    @FindBy(xpath = "//h4[contains(text(),'Mağaza Ekle')]")
    public WebElement magazaEklemeButonu;

    @FindBy(xpath = "//html")
    public WebElement haritaSec;

    @FindBy(xpath = "//body/div[@id='store_panel']/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/input[1]")
    public WebElement tabelaAdıEkle;


    @FindBy(xpath = "//button[@id='btn_add_store']")
    public WebElement ekleButonu;

    @FindBy(xpath = "//body/div[15]/div[1]/div[1]/div[3]/button[1]")
    public WebElement uyarıMesajı;

    @Test
    public void testmagazaEkleme() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(magazaButonu));
        magazaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(magazaSorgulamaButonu));
        magazaSorgulamaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(magazaSorgulaButonu));
        magazaSorgulaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(idFiltreleme));
        idFiltreleme.sendKeys("5004760");
        idFiltreleme.sendKeys(Keys.ENTER);

        Fwait.until(ExpectedConditions.visibilityOf(magazaHaritadaGit));

        Actions haritadagit = new Actions(driver);
        haritadagit.doubleClick(magazaHaritadaGit).perform();

        Fwait.until(ExpectedConditions.visibilityOf(magazaPencereKapamaButonu));
        magazaPencereKapamaButonu.click();


        Fwait.until(ExpectedConditions.visibilityOf(magazaButonu));
        magazaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(magazaEklemeButonu));
        magazaEklemeButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(haritaSec));
        haritaSec.click();

        Fwait.until(ExpectedConditions.visibilityOf(tabelaAdıEkle));
        tabelaAdıEkle.sendKeys("otomasyontest");


        js.executeScript("window.scrollBy(0,10000)");


        Fwait.until(ExpectedConditions.visibilityOf(ekleButonu));
        ekleButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(uyarıMesajı));
        uyarıMesajı.click();



        Thread.sleep(3000);

        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);



    }
}

