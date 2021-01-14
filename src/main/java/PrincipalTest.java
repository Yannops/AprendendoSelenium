import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PrincipalTest {
    private WebDriver driver = DriverFactory.createDriver("chrome");


    @Before
    public void before() {
        driver.manage().window().maximize();
        driver.get("http://google.com");
    }

    @Test
    public void testaPesquisa() {
        PrincipalPage page = PageFactory.initElements(driver, PrincipalPage.class);
        page.pesquisaPor("Casa Do Codigo");
        boolean contemTextoPesquisa = driver.getPageSource().contains("Casa Do Codigo");
        Assert.assertTrue(contemTextoPesquisa);
    }

    @Test
    public void testaPesquisa2() {
        PrincipalPage page = new PrincipalPage(driver);
        page.pesquisaPor("Casa do Codigo");
        boolean contemTextoPesquisa = driver.getPageSource().contains("Casa do Codigo");
        Assert.assertTrue(contemTextoPesquisa);
    }

    @Test
    public void validaQuantidadeDeLinks() {
        PrincipalPage page = new PrincipalPage(driver);
        Assert.assertTrue(page.quantidadeLinks() > 10);
    }

    @Test
    public void validaQtdAmbasClasses() {
        PrincipalPage page = new PrincipalPage(driver);
        Assert.assertTrue(page.qtdAmbasClasses() > 1);
    }

    @After
    public void after() {
        driver.quit();
    }
}
