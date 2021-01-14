import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

public class PrincipalPage {

    @FindBy(name = "q")
    private WebElement caixaDePesquisa;
    @FindBys({
            @FindBy(tagName = "a")
    })
    private List<WebElement> allPageLinks;
    @FindAll({
            @FindBy(className = "gb_ke"),
            @FindBy(className = "gb_R")
    })
    private List<WebElement> todosComAmbasClasses;

    @CacheLookup
    @FindBy(id = "nome")
    private WebElement nome;

    public void pesquisaPor(String minhaPesquisa) {
        caixaDePesquisa.sendKeys(minhaPesquisa);
        caixaDePesquisa.submit();
    }

    public PrincipalPage(WebDriver drive) {
        PageFactory.initElements(drive, this);
    }

    public int quantidadeLinks() {
        return allPageLinks.size();
    }

    public int qtdAmbasClasses() {
        return todosComAmbasClasses.size();
    }

    public void digitarNome(String nomeEx) {
        String conteudo = nome.getText();
        nome.clear();
        nome.sendKeys(nomeEx);
    }
}
