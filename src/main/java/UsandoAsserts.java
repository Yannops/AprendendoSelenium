import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsandoAsserts {

    private static WebDriver driver;

    @BeforeClass
    public static void inicializa() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/yanns/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(1500);
    }

    @Test
    public void verificaSeTituloEstaCorreto() throws InterruptedException {
        String titulo = driver.getTitle();
        boolean tituloCorreto = titulo.equals("Google");
        Assert.assertTrue("Algo deu Errado!", tituloCorreto);
        Thread.sleep(1500);
    }

    @Test
    public void verificaSeTituloEstaCorreto2() throws InterruptedException {
        String titulo = driver.getTitle();
        String tituloCerto = "Google";
        Assert.assertEquals(titulo, tituloCerto);
        Thread.sleep(1500);
    }

    @AfterClass
    public static void finaliza() {
        driver.quit();
    }
}
