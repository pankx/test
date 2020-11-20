import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;

public class IOSdriver {
	public static String userName = "dkumar123";
	public static String accessKey = "e6bef8e8-9542-48af-812d-167669e3b2e1";
	public static void main(String args[]) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "iPhone_6_Plus_12_real_us");
		caps.setCapability("platformVersion", "12.4.1");
		caps.setCapability("platformName","iOS");
		caps.setCapability("bundleId","com.alta.altametricszipinventory");
		caps.setCapability("testobject_api_key","19702C8D19E04C98BBE3CB3FC979749D");
		caps.setCapability("username",userName);
		caps.setCapability("accessKey",accessKey);
		String urll="https://us1.appium.testobject.com/wd/hub";
		WebDriver driver= new IOSDriver<WebElement>(new URL(urll), caps);
		driver.quit();
	}
}

