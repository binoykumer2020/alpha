package indianCouture;

import driverHelper.DriverHelper;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndianCoutureTest extends DriverHelper {

    WebDriver driver;

    @Test
    public void openBrowser() {

    }

    @Test
    public void clickOnSignin() {
        //driver.findElement(By.xpath("//a[contains(text(),'Sign-in')]")).click();
    }
    @Test
    public void register ( ){
       // driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
    }
    @Test
    public void fillTheRegisterForm (){
      //  driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
       // driver.findElement(By.xpath("")).sendKeys("Binoy");
    }
}
