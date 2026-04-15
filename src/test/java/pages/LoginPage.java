package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static WebDriver driver;

    private static By userField = By.id("user-name");
    private static By passField = By.id("password");
    private static By loginBtn = By.id("login-button");
    private static By errorMessage = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void Usuario(String user){
        driver.findElement(userField).sendKeys(user);
    }

    public static void Contraseña(String password){
        driver.findElement(passField).sendKeys(password);
    }

    public static void Boton(){
        driver.findElement(loginBtn).click();
    }

    public static void Todo (String user, String password){
        driver.findElement(userField).sendKeys(user);

        driver.findElement(passField).sendKeys(password);

    }

    public static String UrlActual() {
        return driver.getCurrentUrl();
    }

    public static boolean errorVisible() {
        return !driver.findElements(errorMessage).isEmpty();
    }


    public static String obtenerTextoError() {
        if (errorVisible()) {
            return driver.findElement(errorMessage).getText();
        }
        return "";


    }

}
