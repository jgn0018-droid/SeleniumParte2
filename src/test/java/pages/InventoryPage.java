package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    private static WebDriver driver;

    private static By backPackAdd = By.id("añade-al-carrito-sauce-labs-backpack");
    private static By bikeLightAdd = By.id("añade-al-carrito-sauce-labs-bike-light");
    private static By cardBage = By.className("carrito-compra");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void añadirBackPack(){
        driver.findElement(backPackAdd).click();

    }

    public static void añadirBikeLight(){
        driver.findElement(bikeLightAdd).click();

    }

    public static void obtenerNumero(){
        driver.findElement(numField).sendKeys("numero");

    }

    public static void comprobarTexto(){
        driver.findElement(textField).sendKeys("texto");

    }



}
