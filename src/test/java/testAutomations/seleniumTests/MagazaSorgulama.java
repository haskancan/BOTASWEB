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

public class MagazaSorgulama extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//tbody/tr[4]/td[7]/a[1]")
    public WebElement projeSecimButonu;

    @FindBy(xpath = "//body/div[1]/div[4]/div[1]/div[2]/a[1]/img[1]")
    public WebElement haritaSecimButonu;

    @FindBy(xpath = "//body/div[@id='main-content']/div[@id='layer-control']/div[@id='layersplit']/div[@id='layer-list']/div[@id='mCSB_1']/div[@id='mCSB_1_container']/ul[1]/li[2]/span[1]/div[1]")
    public WebElement magazaKatmaniAcmaButonu;

    @FindBy(xpath = "//header/div[2]/nav[1]/div[2]/ul[3]/li[2]/a[1]")
    public WebElement magazaButonu;

    @FindBy(xpath = "//p[contains(text(),'Mağaza Listesi')]")
    public WebElement magazaSorgulamaButonu;

    @FindBy(xpath = "//button[@id='btn-query-result']")
    public WebElement magazaSorgulaButonu;

    @FindBy(xpath = "//thead/tr[2]/th[2]/input[1]")
    public WebElement idFiltreleme;


    @FindBy(xpath = "//td[contains(text(),'5004694')]")
    public WebElement magazaHaritadaGit;

    @FindBy(xpath = "//body/div[@id='store_panel']/div[1]/div[1]/div[3]/div[6]/span[1]")
    public WebElement magazaPencereKapamaButonu;


    @Test
    public void testMagazaSorgulama() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(magazaKatmaniAcmaButonu));
        magazaKatmaniAcmaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(magazaButonu));
        magazaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(magazaSorgulamaButonu));
        magazaSorgulamaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(magazaButonu));
        magazaSorgulaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(idFiltreleme));
        idFiltreleme.sendKeys("5004694");
        idFiltreleme.sendKeys(Keys.ENTER);

        Fwait.until(ExpectedConditions.visibilityOf(magazaHaritadaGit));

        Actions haritadagit = new Actions(driver);
        haritadagit.doubleClick(magazaHaritadaGit).perform();

        Fwait.until(ExpectedConditions.visibilityOf(magazaPencereKapamaButonu));
        magazaPencereKapamaButonu.click();


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);



    }
}

