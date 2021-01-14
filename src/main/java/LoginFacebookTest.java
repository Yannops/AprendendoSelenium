import categorias.NegativeTest;
import categorias.PositiveTest;
import categorias.SmokeTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginFacebookTest {
    WebDriver driver = DriverFactory.createDriver("chrome");
    private PrincipalPageFacebook page;

    @Before
    public void inicializa() {
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        page = PageFactory.initElements(driver, PrincipalPageFacebook.class);
    }

    @Test
    @Category({PositiveTest.class, SmokeTest.class})
    public void loginComSucesso() {
        page.loginComo("yannsilveira@hotmail.com", "minecraft");
    }

    @Test
    @Category(NegativeTest.class)
    public void loginComSenhaInvalida() {
        page.loginComo("yannsilveira@hotmail.com", "minecraf");
    }
}
