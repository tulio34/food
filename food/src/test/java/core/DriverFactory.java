package core;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class DriverFactory {

	private static AppiumDriver<MobileElement> driver;

	public DriverFactory() {}
	
	public static AppiumDriver<MobileElement> iniciarDriver() {
		if (driver == null){

			try{

				DesiredCapabilities caps = new DesiredCapabilities();

				caps.setCapability("automationName", "UiAutomator2");
				caps.setCapability("platformName", "Android");
				caps.setCapability("deviceName", "Pixel 2 API 29 2");
				caps.setCapability("app", "C:\\Users\\tulio.menezes\\Desktop\\Compasso\\app\\test_ifood.apk");
				//caps.setCapability("udid", "emulator-5554");
				caps.setCapability("udid", "b7bc516");
				caps.setCapability("adbExecTimeout", "100000");

				URL url = new URL("http://127.0.0.1:4723/wd/hub");
				driver = new AppiumDriver<MobileElement>(url, caps);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			} catch (Exception exp) {
				System.out.println("Cause is: " +exp.getCause());
				System.out.println("Message is: " +exp.getMessage());
				exp.printStackTrace();
			}
		}
		return driver;
	}

	public static void encerrarDriver(){
		if(driver != null){
			driver.quit();
			driver = null;
		}	
	}
}
