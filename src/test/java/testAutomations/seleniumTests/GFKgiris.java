package testAutomations.seleniumTests;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class GFKgiris extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//tbody/tr[4]/td[7]/a[1]")
    public WebElement projeSecimButonu;

    @FindBy(xpath = "//body/div[1]/div[4]/div[1]/div[2]/a[1]/img[1]")
    public WebElement haritaSecimButonu;

    @Test
    public void testGFKgiris() throws Exception {
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

        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);





    }
}
