package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static stepDef.BaseTest.driver;

public class HomePage {
    By producName = By.xpath("//*[@id=\"item_4_img_link\"]/div");
    By prodyctImage = By.id("item_4_img_link");
    By productPrice = By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div");
    By buttonDropDown = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
    By buttonBurgermenu = By.id("react-burger-menu-btn");
    By buttonAddCart = By.id("add-to-cart-sauce-labs-backpack");
    By buttonRemoveCart = By.id("remove-sauce-labs-backpack");
    By buttonShopingCart = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");

    public void validateHomePage(){
        WebElement productElement = driver.findElement(producName);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }
    public void validateImage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement productElement2 = driver.findElement(prodyctImage);
        assertTrue(productElement2.isDisplayed());
    }
    public void validatePrice(){
        WebElement productElement3 = driver.findElement(productPrice);
        assertTrue(productElement3.isDisplayed());
        assertEquals("$29.99", productElement3.getText());
    }
    public void clickBurgerMenu(){
        WebElement burgerMenu = driver.findElement(buttonBurgermenu);
        burgerMenu.click();
    }
    public void  tampilanBurgerMenu() throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.id("inventory_sidebar_link")).getText(),"All Items");
        Assert.assertEquals(driver.findElement(By.id("about_sidebar_link")).getText(), "About");
        Assert.assertEquals(driver.findElement(By.id("logout_sidebar_link")).getText(), "Logout");
        Assert.assertEquals(driver.findElement(By.id("reset_sidebar_link")).getText(), "Reset App State");
    }

    public void clickDropDown(){
       WebElement dropDown = driver.findElement(buttonDropDown);
       dropDown.click();
    }
    public void menuDropdown() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]")).getText(),"Name (A to Z)");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).getText(), "Name (Z to A)");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).getText(), "Price (low to high)");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).getText(), "Price (high to low)");
    }

    public void clickButtonAdd(){
        WebElement buttonAdd = driver.findElement(buttonAddCart);
        buttonAdd.click();
    }
    public void shopingCart(){
        WebElement productElement6 = driver.findElement(buttonShopingCart);
        assertTrue(productElement6.isDisplayed());
        assertEquals("1", productElement6.getText());
    }

    public void clickButtonRemove(){
        driver.findElement(buttonRemoveCart).click();
    }
    public void removeCart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement productElement4 = driver.findElement(buttonAddCart);
        assertTrue(productElement4.isDisplayed());
    }

}
