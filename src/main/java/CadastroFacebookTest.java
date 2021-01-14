import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CadastroFacebookTest {
    WebDriver driver;

    @Before
    public void antes() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/yanns/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://pt-br.facebook.com/r.php/");
        driver.manage().window().maximize();
    }

    @Test
    public void cadastroFacebookComSucesso() throws InterruptedException {
        driver.findElement(By.name("firstname")).sendKeys("Yann");
        Thread.sleep(1500);
        driver.findElement(By.name("lastname")).sendKeys("Silveira");
        Thread.sleep(1500);
        driver.findElement(By.name("reg_email__")).sendKeys("yannsilveira@hotmail.com");
        Thread.sleep(1500);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("yannsilveira@hotmail.com");
        Thread.sleep(1500);
        driver.findElement(By.name("reg_passwd__")).sendKeys("minecraft");
        Thread.sleep(1500);

        WebElement comboDia = driver.findElement(By.id("day"));
        Select select = new Select(comboDia);
        select.selectByVisibleText("20");
        Thread.sleep(1500);
        WebElement comboMes = driver.findElement(By.id("month"));
        select = new Select(comboMes);
        select.selectByVisibleText("Jul");
        Thread.sleep(1500);
        WebElement comboAno = driver.findElement(By.id("year"));
        select = new Select(comboAno);
        select.selectByVisibleText("2000");
        Thread.sleep(1500);
        driver.findElement(By.id("u_0_7")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("websubmit")).click();
    }

    @After
    public void depois() {
        driver.quit();
    }
}
