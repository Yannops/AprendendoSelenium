import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tabelas {

    WebDriver driver = DriverFactory.createDriver("chrome");

    @Before
    public void abrePagina() {
        driver.get("http://toolsqa.com/automation-practice-table/");
    }

    @Test
    public void validaInformacaoTabela() {
        WebElement linhaDesejada = driver.findElement(By.cssSelector("#content > table > tbody > tr:nth-child(2) > th"));
        String textoEsperado = linhaDesejada.getText();
        Assert.assertEquals("Clock Tower Hotel", textoEsperado);
    }

    @After
    public void fechaNavegador() {
        driver.quit();
    }
}
