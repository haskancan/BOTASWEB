package testAutomations.seleniumTests;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class gorevSil extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//tbody/tr[4]/td[7]/a[1]")
    public WebElement projeSecimButonu;

    @FindBy(xpath = "//body/div[1]/div[4]/div[1]/div[2]/a[1]/img[1]")
    public WebElement haritaSecimButonu;

    @FindBy(xpath = "//header/div[2]/nav[1]/div[2]/ul[3]/li[3]/a[1]")
    public WebElement gorevSorgulamaButonu;

    @FindBy(xpath = "//h4[contains(text(),'Görev Sorgulama')]")
    public WebElement gorevSorgulaButonu;

    @FindBy(xpath = "//button[@id='query_task_button']")
    public WebElement sorgulaButonu;

    @FindBy(xpath = "//td[contains(text(),'otomasyontest')]")
    public WebElement gorevTıklamaButonu;

    @FindBy(xpath = "//button[@id='delete-task-btn']")
    public WebElement gorevSilButonu;

    @FindBy(xpath = "//body/div[12]/div[1]/div[1]/div[3]/button[1]/i[1]")
    public WebElement gorevSilOnaylamaButonu;




    @Test
    public void testgorevSil() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(gorevSorgulamaButonu));
        gorevSorgulamaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(gorevSorgulaButonu));
        gorevSorgulaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(sorgulaButonu));
        sorgulaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(gorevTıklamaButonu));
        Actions gorevtıkla = new Actions(driver);
        gorevtıkla.doubleClick(gorevTıklamaButonu).perform();

        Fwait.until(ExpectedConditions.visibilityOf(gorevSilButonu));
        gorevSilButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(gorevSilOnaylamaButonu));
        gorevSilOnaylamaButonu.click();


        Thread.sleep(3000);
        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);



    }
}

