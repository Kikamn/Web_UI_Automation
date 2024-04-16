package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.HomePage;


public class HomeStep extends BaseTest {
    HomePage homePage;

    public HomeStep(){
        this.homePage = new HomePage();
    }
    @Then("User is on homepage")
    public void userIsOnHomepage(){
        homePage.validateHomePage();
    }

    @Then("user can see image product")
    public void userCanSeeImageProduct() {
        homePage.validateImage();
    }

    @Then("user can see price product")
    public void userCanSeePriceProduct() {
        homePage.validatePrice();
    }

    @When("User Click Add to cart button")
    public void userClickAddToCartButton() {
        homePage.clickButtonAdd();
    }

    @Then("user add product in keranjang")
    public void userAddProductInKeranjang() {
        homePage.shopingCart();
    }

    @When("User Click remove button")
    public void userClickRemoveButton() {
        homePage.clickButtonRemove();
    }

    @Then("User can remove product in keranjang")
    public void userCanRemoveProductInKeranjang(){
        homePage.removeCart();
    }

    @When("user click filter")
    public void userClickFilter() {
        homePage.clickDropDown();
    }

    @Then("User can chose filter product")
    public void userCanChoseFilterProduct() throws InterruptedException {
        homePage.menuDropdown();
    }
    @When("user click burger menu button")
    public void userClickBurgerMenuButton() {
        homePage.clickBurgerMenu();
    } 
    @Then("User see menu")
    public void userSeeMenu() throws InterruptedException {
        homePage.tampilanBurgerMenu();
    }

}
