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

public class InventoryTest {

    private WebDriver driver;
    private InventoryPage InventoryPage;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.setBinary("C:/Program Files/BraveSoftware/Brave-Browser/Application/brave.exe");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://saucedemo.com");


        InventoryPage = new InventoryPage(driver);
    }


    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void anadirUnProductoAlCarrito(){
        LoginPage login = new LoginPage(driver);
        login.Todo("standard_user", "secret_sauce");

        login.Boton();

        InventoryPage inventario = new InventoryPage(driver);
        inventario.añadirBackPack();

        assertEquals(1, inventario.obtenerNumero());

        

    }

    @Test
    void añadirDosProductos(){
        LoginPage login = new LoginPage(driver);
        login.Todo("standard_user", "secret_sauce");

        login.Boton();

        InventoryPage inventario = new InventoryPage(driver);
        inventario.añadirBackPack();
        inventario.añadirBikeLight();

        assertEquals(2, inventario.obtenerNumero());

    }


    @Test
    void botonCambiaTrasAnadirProducto(){
        LoginPage login = new LoginPage(driver);
        login.Todo("standard_user", "secret_sauce");

        login.Boton();

        InventoryPage inventario = new InventoryPage(driver);
        inventario.añadirBackPack();

        assertTrue(inventario.comprobarTexto().equals("Remove"));
    }
}
