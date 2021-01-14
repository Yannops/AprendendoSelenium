import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AprimorandoActions {

    WebDriver driver = DriverFactory.createDriver("chrome");

    @Before
    public void SetUp() {
        driver.get("http://demo.guru99.com/selenium/drag_drop.html");
        driver.manage().window().maximize();
    }

    @Test
    public void escolhendoOpcaoBotaoDireito() throws InterruptedException {
        WebElement elemento = driver.findElement(By.className("block15"));
        WebElement link = elemento.findElement(By.tagName("a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(link).contextClick()
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER).perform();
                Thread.sleep(5000);
    }
}
