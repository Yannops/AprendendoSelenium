import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestaCadastroFacebook {

    private static CadastroFacebookPage facebook;
    private static WebDriver driver;

    @BeforeClass
    public static void preCondicao() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/yanns/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://pt-br.facebook.com/r.php/");
        driver.manage().window().maximize();
        facebook = new CadastroFacebookPage(driver);
    }

    @Test
    public void preencheCampos() {
        facebook.preenchenome("yann")
                .preencheSobreNome("Silveira");
    }

    @Test
    public void efetuarLoginCompleto() {
        facebook.acessarRota();
        facebook.logarComo("yannsilveira@hotmail.com", "minecraft");
    }

    @AfterClass
    public static void sairFace() {
        facebook.sairPagina();
    }
}
