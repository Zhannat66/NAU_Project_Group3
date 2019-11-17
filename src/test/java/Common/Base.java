package Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

    public class Base {
        public static WebDriver driver;
        public static Properties prop;  //instance variable

        public static WebDriver getDriver() throws IOException {   //method to get driver - browser
            prop = new Properties();     // initiating object
            FileInputStream fis = new FileInputStream("C:/Users/zhanna/Desktop/NAUProjectGroup3/src/test/java/Common/global.properties");
            prop.load(fis);

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(prop.getProperty("url"));
            return driver;


        }

    }


