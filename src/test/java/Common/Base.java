package Common;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Base {
        public static WebDriver driver;
        public static WebDriver driverAdmission;
        public static Properties prop;

        public static WebDriver getDriver() throws IOException {

            prop=new Properties();
            FileInputStream fis=new FileInputStream("C:\\Users\\skaya\\IdeaProjects\\NAU_Project_Group3\\src\\test\\java\\Common\\global.properties" );
            prop.load(fis);

            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver ();
            driver.get(prop.getProperty("url"));
            return driver;
        }
        public static WebDriver gettingDriver() throws IOException {

            prop=new Properties();
            FileInputStream fis=new FileInputStream("C:\\Users\\skaya\\IdeaProjects\\NAU_Project_Group3\\src\\test\\java\\Common\\global.properties" );
            prop.load(fis);

            WebDriverManager.chromedriver().setup();
            driverAdmission=new ChromeDriver ();
            driverAdmission.get(prop.getProperty("urlAdmission"));
            return driverAdmission;
        }
    }