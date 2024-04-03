package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {
    public static WebDriver driver;
    By producName = By.xpath("//*[@id=\"item_4_img_link\"]/div");
    By prodyctImage = By.id("item_4_img_link");
    By productPrice = By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div");
    By allItem = By.xpath("//*[@id=\"inventory_sidebar_link\"]");
    By about = By.xpath("//*[@id=\"about_sidebar_link\"]");
    By logOut = By.xpath("//*[@id=\"logout_sidebar_link\"]");
    By resetAppState = By.xpath("//*[@id=\"reset_sidebar_link\"]");

    By buttonBurgermenu = By.cssSelector("bm-burger-button");
    By buttonAddCart = By.id("add-to-cart-sauce-labs-backpack");
    By buttonRemoveCart = By.id("remove-sauce-labs-backpack");
    
    public HomePage (WebDriver driver){
        this.driver = driver;
    }
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

    public void clickButtonAdd(){
        driver.findElement(buttonAddCart).click();
    }
    public void clickButtonRemove(){
        driver.findElement(buttonRemoveCart).click();
    }

}
