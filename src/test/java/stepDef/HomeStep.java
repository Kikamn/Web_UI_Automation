package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.LoginPage;

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
    }

    @When("User Click remove button")
    public void userClickRemoveButton() {
        homePage.clickButtonRemove();
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
    @When("user click burger menu button")
    public void userClickBurgerMenuButton() {
        homePage.clickBurgerMenu();
    } 
    @Then("User see menu")
    public void userSeeMenu() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.id("inventory_sidebar_link")).getText(),"All Items");
        Assert.assertEquals(driver.findElement(By.id("about_sidebar_link")).getText(), "About");
        Assert.assertEquals(driver.findElement(By.id("logout_sidebar_link")).getText(), "Logout");
        Assert.assertEquals(driver.findElement(By.id("reset_sidebar_link")).getText(), "Reset App State");
    }

}
