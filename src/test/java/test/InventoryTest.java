package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.InventoryPage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryTest {

    private WebDriver driver;
    private InventoryPage inventoryPage;

    @Test
    void anadirUnProductoAlCarrito(){
        LoginPage.Todo("standard_user", "secret_sauce");

        LoginPage.Boton();

        

    }
}
