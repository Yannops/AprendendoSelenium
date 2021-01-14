import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class CadastroFacebookPage {

    WebDriver driver;

    public CadastroFacebookPage(WebDriver driver) {
        this.driver = driver;
    }

    public CadastroFacebookPage preenchenome(String nome) {
        driver.findElement(By.name("firstname")).sendKeys(nome);
        return this;
    }

    public CadastroFacebookPage preencheSobreNome(String sobrenome) {
        driver.findElement(By.name("lastname")).sendKeys(sobrenome);
        return this;
    }

    public CadastroFacebookPage sairPagina() {
        driver.quit();
        return this;
    }

    public void acessarRota() {
        driver.get("http://www.facebook.com");
    }

    public CadastroFacebookPage preencheUsuario(String nome) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
        WebElement usuario = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        usuario.sendKeys(nome);
        return this;
    }

    public CadastroFacebookPage preencheSenha(String senha) {
        driver.findElement(By.id("pass")).sendKeys(senha);
        return this;
    }

    public void logarComo(String user, String senha) {
        preencheUsuario(user).preencheSenha(senha).clicaBotaoLogin();
    }

    public void clicaBotaoLogin() {
        driver.findElement(By.id("u_0_2")).click();
    }
}
