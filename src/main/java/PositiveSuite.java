import categorias.NegativeTest;
import categorias.PositiveTest;
import categorias.SmokeTest;
import org.junit.FixMethodOrder;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({
        LoginFacebookTest.class,
        CadastroFacebookTests.class
})
@Categories.IncludeCategory({PositiveTest.class, SmokeTest.class})
@Categories.ExcludeCategory({NegativeTest.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PositiveSuite {

}
