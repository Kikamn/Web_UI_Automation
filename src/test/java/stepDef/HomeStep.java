package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeStep extends BaseTest {
    public static HomePage homePage;
    @Then("User is on homepage")
    public void userIsOnHomepage(){
        homePage = new HomePage(driver);
        homePage.validateHomePage();
    }

    @Then("user can see image product")
    public void userCanSeeImageProduct() {
    }

    @Then("user can see price product")
    public void userCanSeePriceProduct() {
    }

    @When("User Click Add to cart button")
    public void userClickAddToCartButton() {
    }

    @Then("user add product in keranjang")
    public void userAddProductInKeranjang() {
    }

    @When("User Click remove button")
    public void userClickRemoveButton() {
    }

    @Then("User can remove product in keranjang")
    public void userCanRemoveProductInKeranjang() {
    }

    @When("user clik filter")
    public void userClikFilter() {
    }

    @Then("User can chose filter product")
    public void userCanChoseFilterProduct() {
    }
}
