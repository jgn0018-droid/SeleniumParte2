package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By userField = By.id("user-name");
    private By passField = By.id("password");
    private By loginBtn = By.id("login-button");
    private By errorMessage = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Usuario(String user){
        driver.findElement(userField).sendKeys(user);
    }

    public void Contraseña(String password){
        driver.findElement(passField).sendKeys(password);
    }

    public void Boton(){
        driver.findElement(loginBtn).click();
    }

    public void Todo (String user, String password){
        driver.findElement(userField).sendKeys(user);

        driver.findElement(passField).sendKeys(password);

    }

    public String UrlActual() {
        return driver.getCurrentUrl();
    }

    public boolean errorVisible() {
        return !driver.findElements(errorMessage).isEmpty();
    }


    public String obtenerTextoError() {
        if (errorVisible()) {
            return driver.findElement(errorMessage).getText();
        }
        return "";


    }

}
