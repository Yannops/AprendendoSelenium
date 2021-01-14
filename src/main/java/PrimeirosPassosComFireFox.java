import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimeirosPassosComFireFox {
    WebDriver driver;

    @Before
    public void preCondicao() {
        System.setProperty("webdriver.gecko.driver", "C:/Users/yanns/Downloads/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.google.com.br");
        driver.manage().window().maximize();
    }

    @Test
    public void teste() {
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }

    @After
    public void posCondicao() {
        driver.quit();
    }
}
