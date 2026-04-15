package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @Test
    void loginCorrecto(){
        LoginPage.Todo("standard_user", "secret_sauce");

        LoginPage.Boton();

        String url = PagLogeo.UrlActual();


        assertTrue(url.contains("inventory"));

    }

    @Test
    void loginIncorrecto(){
        LoginPage.Todo("standard_user", "pass_no");

        assertTrue(LoginPage.errorVisible(),
                "Debería mostrarse un mensaje de error al fallar el login");


        assertTrue(LoginPage.obtenerTextoError().contains("Username and password do not match"),
                "El mensaje de error no es el esperado");

    }
}
