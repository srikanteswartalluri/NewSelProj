import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass {
    public static void main(String [] args){
        System.setProperty("webdriver.firefox.marionette","/Users/srikanteswararaotalluri/Downloads/geckodriver");
        System.setProperty("webdriver.chrome.driver","/Users/srikanteswararaotalluri/Downloads/chromedriver");
        ChromeDriver wb = new ChromeDriver();


        wb.get("https://www.google.co.in");

        WebElement element = wb.findElement(By.name("q"));
        element.sendKeys("100");


    }
}
