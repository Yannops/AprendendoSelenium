import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static WebDriver driver;

    private static final String DRIVER_CHROME = "chrome";
    private static final String DRIVER_IE = "ie";
    private static final String DRIVER_FIREFOX = "firefox";
    private static final String HEADLESS_CHROME = "chrome-headless";

    public static WebDriver createDriver(String browserName) {
        switch (browserName) {
            case DRIVER_CHROME:
                System.setProperty("webdriver.chrome.driver", "C:/Users/yanns/Downloads/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case DRIVER_FIREFOX:
                System.setProperty("webdriver.gecko.driver", "C:/Users/yanns/Downloads/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case DRIVER_IE:
                System.setProperty("webdriver.ie.driver", "C:/Users/yanns/Downloads/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            case HEADLESS_CHROME:
                System.setProperty("webdriver.chrome.driver", "C:/Users/yanns/Downloads/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver = new ChromeDriver(options);
                break;
            default:
                System.out.println("Opção de Driver Inválida!!!");
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }


}
