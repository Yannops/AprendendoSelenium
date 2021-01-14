import com.github.javafaker.Faker;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;


public class FakerComFacebook {
    WebDriver driver = DriverFactory.createDriver("chrome");

    @Before
    public void antesDeTudo() {
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=1661784635&extra_1=s%7Cc%7C320269343427%7Cb%7Centra%20no%20facebook%7C&placement=&creative=320269343427&keyword=entra%20no%20facebook&partner_id=googlesem&extra_2=campaignid%3D1661784635%26adgroupid%3D63686354363%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-303627330852%26loc_physical_ms%3D1031984%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIrd61s9SI7gIVwwaRCh1_sAQ4EAAYASAAEgJewPD_BwE");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void cadastroFacebook() throws InterruptedException {
        Faker faker = new Faker(new Locale("pt-BR"));
        driver.findElement(By.name("firstname")).sendKeys(faker.name().firstName());
        driver.findElement(By.name("lastname")).sendKeys(faker.name().lastName());
        String email = faker.internet().emailAddress();
        driver.findElement(By.name("reg_email__")).sendKeys(email);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);

        Thread.sleep(5000);
    }

    @After
    public void depoisDeTudo() {
        driver.quit();
    }
}
