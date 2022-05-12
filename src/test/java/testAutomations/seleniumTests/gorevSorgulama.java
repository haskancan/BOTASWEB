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

public class gorevSorgulama extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//tbody/tr[4]/td[7]/a[1]")
    public WebElement projeSecimButonu;

    @FindBy(xpath = "//body/div[1]/div[4]/div[1]/div[2]/a[1]/img[1]")
    public WebElement haritaSecimButonu;


    @FindBy(xpath = "//header/div[2]/nav[1]/div[2]/ul[3]/li[3]/a[1]")
    public WebElement gorevButonu;

    @FindBy(xpath = "//p[contains(text(),'Görev Sorgulama')]")
    public WebElement gorevSorgulamaButonu;

    @FindBy(xpath = "//body/div[@id='QueryTask']/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")
    public WebElement idFiltreleme;


    @FindBy(xpath = "//button[@id='query_task_button']")
    public WebElement gorevSorgulaButonu;

    @FindBy(xpath = "//td[contains(text(),'16552')]")
    public WebElement gorevHaritadaGit;

    @FindBy(xpath = "//body/div[@id='TaskPanel']/div[1]/div[1]/div[3]/div[6]/span[1]")
    public WebElement gorevPencereKapamaButonu;

    @FindBy(xpath = "//body/div[@id='TaskPanel']/div[2]/div[1]/div[2]/div[2]/button[1]")
    public WebElement haritadaGösterButonu;


    @Test
    public void testgorevSorgulama() throws Exception {
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


        Fwait.until(ExpectedConditions.visibilityOf(gorevButonu));
        gorevButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(gorevSorgulamaButonu));
        gorevSorgulamaButonu.click();


        Fwait.until(ExpectedConditions.visibilityOf(idFiltreleme));
        idFiltreleme.sendKeys("16552");

        Fwait.until(ExpectedConditions.visibilityOf(gorevSorgulaButonu));
        gorevSorgulaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(gorevHaritadaGit));

        Actions haritadagit = new Actions(driver);
        haritadagit.doubleClick(gorevHaritadaGit).perform();

        Fwait.until(ExpectedConditions.visibilityOf(haritadaGösterButonu));
        haritadaGösterButonu.click();



//        Fwait.until(ExpectedConditions.visibilityOf(magazaPencereKapamaButonu));
//        magazaPencereKapamaButonu.click();


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);



    }
}

