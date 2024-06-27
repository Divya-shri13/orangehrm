package GenericUtils;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DriverUtils {
   static WebDriver driver;
 public static void createDriver1()
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\CHISRI\\eclipse-workspace\\Orangermg_testing\\src\\test\\resources\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
 public static WebDriver getDriver()
{
if(driver==null) {
createDriver1();
}
return driver;
}
}
