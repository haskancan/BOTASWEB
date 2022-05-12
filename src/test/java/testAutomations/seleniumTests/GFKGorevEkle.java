package testAutomations.seleniumTests;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class GFKGorevEkle extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//tbody/tr[4]/td[7]/a[1]")
    public WebElement projeSecimButonu;

    @FindBy(xpath = "//body/div[1]/div[4]/div[1]/div[2]/a[1]/img[1]")
    public WebElement haritaSecimButonu;

    @FindBy(xpath = "//header/div[2]/nav[1]/div[2]/ul[3]/li[2]/a[1]")
    public WebElement magazaButonu;

    @FindBy(xpath = "//p[contains(text(),'Mağaza Listesi')]")
    public WebElement magazaSorgulamaButonu;

    @FindBy(xpath = "//button[@id='btn-query-result']")
    public WebElement magazaSorgulaButonu;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement magazaHaritadaGit;

    @FindBy(xpath = "//body/div[@id='store_panel']/div[1]/div[1]/div[3]/div[6]/span[1]")
    public WebElement magazaPencereKapamaButonu;

    @FindBy(xpath = "//header/div[2]/nav[1]/div[2]/ul[3]/li[3]/a[1]")
    public WebElement gorevButonu;

    @FindBy(xpath = "//h4[contains(text(),'Görev Ekle')]")
    public WebElement gorevEkleButonu;


    @FindBy(xpath = "//a[contains(text(),'Haritadan Seçim')]")
    public WebElement haritadanSecimButonu;

    @FindBy(xpath = "//body/div[@id='TaskPanel']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/button[1]")
    public WebElement secinizButonu;

    @FindBy(xpath = "//html")
    public WebElement haritaSec;

    @Test
    public void testGFKGorevEkle() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(magazaButonu));
        magazaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(magazaSorgulamaButonu));
        magazaSorgulamaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(magazaButonu));
        magazaSorgulaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(magazaHaritadaGit));

        Actions haritadagit = new Actions(driver);
        haritadagit.doubleClick(magazaHaritadaGit).perform();

        Fwait.until(ExpectedConditions.visibilityOf(magazaPencereKapamaButonu));
        magazaPencereKapamaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(gorevButonu));
        gorevButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(gorevEkleButonu));
        gorevEkleButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(haritadanSecimButonu));
        haritadanSecimButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(secinizButonu));
        secinizButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(haritaSec));

        Actions builder1 = new Actions(driver);
        builder1.moveToElement(haritaSec).clickAndHold().moveByOffset(0, 100).release().perform();
        builder1.click().perform();

        Actions builder2 = new Actions(driver);
        builder2.moveToElement(haritaSec).clickAndHold().moveByOffset(500, 0).release().perform();
        builder2.click().perform();

        Actions builder3 = new Actions(driver);
        builder3.moveToElement(haritaSec).clickAndHold().moveByOffset(50, 0).release().perform();
        haritaSec.click();
        builder3.doubleClick().perform();

        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);



    }
}

