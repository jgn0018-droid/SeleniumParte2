package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.InventoryPage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    private WebDriver driver;
    private LoginPage LoginPage;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.setBinary("C:/Program Files/BraveSoftware/Brave-Browser/Application/brave.exe");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://saucedemo.com");


        LoginPage = new LoginPage(driver);
    }


    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void loginCorrecto(){
        LoginPage.Todo("standard_user", "secret_sauce");

        LoginPage.Boton();

        String url = LoginPage.UrlActual();


        assertTrue(url.contains("inventory"));

    }

    @Test
    void loginIncorrecto(){
        LoginPage.Todo("standard_user", "pass_no");

        LoginPage.Boton();

        assertTrue(LoginPage.errorVisible(),
                "Debería mostrarse un mensaje de error al fallar el login");


        assertTrue(LoginPage.obtenerTextoError().contains("Username and password do not match"),
                "El mensaje de error no es el esperado");

    }
}
