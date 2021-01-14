import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CadastroFacebookTests {
    WebDriver driver = DriverFactory.createDriver("chrome");
    private PrincipalPageFacebook page;

    @Before
    public void inicializa() {
        driver.manage().window().maximize();
        driver.get("https://pt-br.facebook.com/r.php");
        page = PageFactory.initElements(driver, PrincipalPageFacebook.class);
    }

    @Test
    public void validaCamposObrigatorios() {
        page.clicarAbrirUmaConta();
    }
}
