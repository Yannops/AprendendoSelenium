import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TabelasDinamicas {
    WebDriver driver = DriverFactory.createDriver("chrome");


    @Test
    public void imprimeLinhasTabela() {
        driver.manage().window().maximize();
        driver.get("http://toolsqa.com/automation-practice-table/");
        WebElement tabela = driver.findElement(By.cssSelector("#content > table"));
        WebElement tbody = tabela.findElement(By.tagName("tbody"));
        List<WebElement> trs = tbody.findElements(By.tagName("tr"));

        for (WebElement tr: trs) {
            List<WebElement> tds = tr.findElements(By.tagName("td"));
            for (WebElement td: tds) {
                System.out.println(td.getText());
            }
        }
        driver.quit(); 
    }

    @Test
    public void preenchePrimeiraLinha() {
        WebElement primeiraLinha = driver.findElement(By.id("1"));
        List<WebElement> colunasDaPrimeiraLinha = primeiraLinha.findElements(By.tagName("td"));
        for (WebElement td: colunasDaPrimeiraLinha) {
            WebElement inputs = td.findElement(By.tagName("input"));
            inputs.sendKeys("Automático");
        }
    }
}
