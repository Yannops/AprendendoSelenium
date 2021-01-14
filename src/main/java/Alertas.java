import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alertas {

    @Test
    public void inicializa() throws InterruptedException {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
        driver.findElement(By.cssSelector("#content button")).click();

        Thread.sleep(4000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //pode ser usado o alert.dismiss() para popups que existam a opção de cancel;
        //para popups do tipo prompt usar alert.sendKeys(texto que desejar) e logo após dar o OK;
        driver.quit();
    }

    @Test
    public void abreTesteMktNow() throws InterruptedException {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://localhost:16432/Teste%20mktNOW/html/index.html");
        driver.findElement(By.className("btn")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        String textodoAlerta = alert.getText();
        System.out.println(textodoAlerta);
        alert.accept();
        driver.quit();
    }

}
