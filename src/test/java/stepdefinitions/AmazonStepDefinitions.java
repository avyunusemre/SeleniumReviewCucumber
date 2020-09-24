package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici aramakutusuna {string} yazar")
    public void kullanici_aramakutusuna_yazar(String string) {
        amazonPage.searchBox.sendKeys(string + Keys.ENTER);

    }

    @Then("kullanici sonuc sayisiniekrana yazdirir")
    public void kullanici_sonuc_sayisiniekrana_yazdirir() {
        String sonucSayisi = amazonPage.numberOfResults.getText();
        System.out.println(sonucSayisi);
    }
}
