package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class InventoryPage {

    private WebDriver driver;

    private By backPackAdd = By.id("add-to-cart-sauce-labs-backpack");
    private By bikeLightAdd = By.id("add-to-cart-sauce-labs-bike-light");
    private By cartBadge = By.className("shopping_cart_badge");
    private By text = By.id("remove-sauce-labs-backpack");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }


    
    public void añadirBackPack(){
        driver.findElement(backPackAdd).click();

    }

    public void añadirBikeLight(){
        driver.findElement(bikeLightAdd).click();

    }

    public int obtenerNumero(){
        try {
            return Integer.parseInt(driver.findElement(cartBadge).getText());
        } catch (Exception e) {
            return 0;
        }
    }

    public String comprobarTexto(){
       return driver.findElement(text).getText();

    }



}
