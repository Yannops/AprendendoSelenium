import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    WebDriver driver = DriverFactory.createDriver("chrome");

    @Before
    public void inicializa() {
        driver.get("http://demo.guru99.com/selenium/drag_drop.html");
        driver.manage().window().maximize();
    }

    @Test
    public void arrastaESolta() {
        WebElement origem = driver.findElement(By.xpath("//*[@id='fourth']/a"));
        WebElement destino = driver.findElement(By.xpath("//*[@id='amt7']/li"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(origem, destino).perform();

        String resultado = driver.findElement(By.id("t7")).getText();
        Assert.assertTrue(resultado.equals("5000"));
    }
}
