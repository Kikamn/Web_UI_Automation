package pages;

import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static stepDef.BaseTest.driver;

public class LoginPage {
        By usernameInput = By.cssSelector("input#user-name");
        By passwordInput = By.xpath("//*[@id=\"password\"]");
        By buttonLogin = By.id("login-button");

    public void goTologin(){
        driver.get("https://www.saucedemo.com/");}
    public void inputUsername(String username){
        driver.findElement(usernameInput).sendKeys(username);}
    public void inputPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);}
    public void clickButtonLogin(){
        driver.findElement(buttonLogin).click();}
    public void validateMassageError(String errorMasage){
        assertTrue(driver.getPageSource().contains(errorMasage));}
}
