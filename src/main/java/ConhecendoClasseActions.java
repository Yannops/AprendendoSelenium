import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.servlet.annotation.WebListener;

public class ConhecendoClasseActions {
    WebDriver driver = DriverFactory.createDriver("chrome");

    @Before
    public void before() {
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
    }

    @Test
    public void deveClicarComBotaoDireito() {
        driver.findElement(By.name("q")).click();
        Actions actions = new Actions(driver);
        actions.contextClick();
        actions.perform();
    }

    @Test
    public void deveClicarComBotaoDireitoNoElementoFoco() {
        WebElement caixaPesquisa = driver.findElement(By.name("q"));
        Actions actions = new Actions(driver);
        actions.contextClick(caixaPesquisa).perform();
    }

    @Test
    public void devePressionarTab() {
        WebElement elemento = driver.findElement(By.name("q"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elemento).sendKeys(Keys.TAB).perform();
    }

    @Test
    public void letrasMaiusculasEMinusculas() {
        WebElement elemento = driver.findElement(By.name("q"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elemento).keyDown(Keys.SHIFT).sendKeys("texto em caixa alta")
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.SPACE)
                .sendKeys("texto em caixa baixa").perform();
    }

//    @After
//    public void fechaNavegador() {
//        driver.quit();
//    }
}
