import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestaLoginFacebook {
    private CadastroFacebookPage facebook;
    private WebDriver driver;

    @Before
    public void preCondicao() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/yanns/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        facebook = new CadastroFacebookPage(driver);
    }

    @Test
    public void logarComSucesso() {
        facebook.logarComo("oi", "tchau");
    }

    @Test
    public void logarSemEmail() {
        facebook.logarComo("", "tchau");
    }

    @Test
    public void logarSemSenha() {
        facebook.logarComo("oi", "");
    }

    @After
    public void sair() {
        facebook.sairPagina();
    }
}
