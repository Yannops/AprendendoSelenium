
import org.junit.*;

public class ConhecendoAnotacoesJUnit {

    @BeforeClass
    public static void antesDaClasse() {
        System.out.println("Esse é o beforeClass");
    }

    @Before
    public void antesDosMetodos() {
        System.out.println("Esse é o before");
    }

    @Test
    public void meuTeste1() {
        System.out.println("Teste 1");
    }

    @Test
    public  void meuTeste2() {
        System.out.println("Teste 2");
    }

    @After
    public void depoisDosTestes() {
        System.out.println("Esse é o after");
    }

    @AfterClass
    public static void depoisDasClasses() {
        System.out.println("Esse é o afterClass");
    }
}
