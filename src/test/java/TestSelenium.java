
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.MalformedURLException;





import org.testng.annotations.*;


public class TestSelenium {
    WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver","/Users/srikanteswararaotalluri/Downloads/chromedriver");

         driver = new ChromeDriver();
    }

    @Test
    public void testCal() throws Exception {
        //locate the Text on the calculator by using By.name()
        String app_package_name = "com.android.calculator2:id/";

        driver.get("https://www.google.co.in");

        String result = driver.getTitle();

        assert result.equals("Google"):"Actual value is : "+result+" did not match with expected value: Google";

    }

    @AfterClass
    public void teardown(){
        //close the app
        driver.quit();
    }
}
