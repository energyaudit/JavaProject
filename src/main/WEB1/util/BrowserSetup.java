package WEB1.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BrowserSetup {
    public static WebDriver driver;
    public static WebDriver Setup(String browser) {
//        String browser = PropertyUtil.getMessageForApplication(TestConstants.BROWSER);

        switch (browser) {//switch on string
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                 break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                break;
            case "opera":
                System.setProperty("webdriver.opera.driver", "C:\\QA INSTALL\\operadriver.exe");
                OperaOptions options = new OperaOptions();
                options.setBinary(new File("C:\\Program Files (x86)\\Opera\\58.0.3135.132\\opera.exe"));
              driver = new OperaDriver(options);
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                break;
        }
        return driver;
    }
}
