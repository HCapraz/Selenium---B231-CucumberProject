package techproed.stepDefinitions;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.Driver;
import techproed.utilities.WaitUtils;

public class GoogleStepDefinition {

    GooglePage googlePage = new GooglePage();

    @When("google arama kutusunda {string} aratilir")
    public void googleAramaKutusundaAratilir(String arac) {
        googlePage.searchbox.sendKeys(arac, Keys.ENTER);
    }

    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String arac) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arac));
    }

    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int second) {
        WaitUtils.waitFor(second);
    }
}