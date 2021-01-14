import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PrincipalPageFacebook {
    @CacheLookup
    @FindBy(id = "email")
    private WebElement usuario;
    @CacheLookup
    @FindBy(id = "pass")
    private WebElement senha;
    @CacheLookup
    @FindBy(id = "u_0_b")
    private WebElement btnEntrar;

    @CacheLookup
    @FindBy(name = "websubmit")
    private WebElement btnAbrirConta;

    public void loginComo(String user, String password) {
        usuario.sendKeys(user);
        senha.sendKeys(password);
        btnEntrar.click();
    }

    public void clicarAbrirUmaConta() {
        btnAbrirConta.click();
    }
}
