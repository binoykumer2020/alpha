package driverHelper;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverHelper {

    public static WebDriver driver;

    @Before
    public void setUp ( ){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
       // driver.findElement(By.xpath("//button[contains(text(),'Dismiss')]")).click();

    }

    @After
    public void tearDown (){
        // driver.quit();
    }
}
