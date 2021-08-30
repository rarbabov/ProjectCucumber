package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonAramaSD {

    AmazonPage page = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get("https:/www.amazon.com");

    }

    @Given("kulanici aramakutusuna iphone yazar")
    public void kulanici_aramakutusuna_iphone_yazar() {
        page.aramakutusu.sendKeys("iphone" + Keys.ENTER);


    }
    @Then("kullanici sonucu ekrana yazdiriran")
    public void kullanici_sonucu_ekrana_yazdiriran() {
        String sonuc = page.sonucSayisi.getText();

        System.out.println(sonuc);

    }
}
