import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Janelas {

    @Test
    public void testeComJanelas() {
        WebDriver driver = DriverFactory.createDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        System.out.println(driver.getWindowHandle());
        driver.quit();
    }

    @Test
    public void testeComJanelas2() {
        WebDriver driver = DriverFactory.createDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");

        String idOriginal = driver.getWindowHandle();
        System.out.println("Janela Original: ".concat(idOriginal));

        driver.findElement(By.id("windowButton")).click();

        Set<String> todasJanelas = driver.getWindowHandles();

        for (String janela: todasJanelas) {
            if (!janela.equals(idOriginal)) {
                driver.switchTo().window(janela);
            }
        }
        String novaJanela = driver.getWindowHandle();
        System.out.println("Novca janela: ".concat(novaJanela));
        driver.quit();
    }
}
