package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {
    public static WebDriver driver;
    By producName = By.xpath("//*[@id=\"item_4_img_link\"]/div");
    
    public HomePage (WebDriver driver){this.driver = driver;}
    public void validateHomePage(){
        WebElement productElement = driver.findElement(producName);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }
}
