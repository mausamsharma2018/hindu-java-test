package mobile.com.club;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ClubMobileFactory {
	//public static AppiumDriver<MobileElement> driver;
	//public static WebDriverWait wait;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL remoteAddress;
		try {
			remoteAddress = new URL("http://127.0.0.1:4723/wd/hub");
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();			
			 desiredCapabilities.setCapability("appVersion", "6.8.3");
			 desiredCapabilities.setCapability("platformName","Android");
			 desiredCapabilities.setCapability("deviceName","Honor 9N");
			  desiredCapabilities.setCapability("skipUnlock", "true");
			  desiredCapabilities.setCapability("noReset", "false");
			  desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.airbnb.android");
			// club.fromfactory/club.fromfactory.ui.main.MainActivity}
		((DesiredCapabilities) desiredCapabilities).setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.airbnb.android/.flavor.full.activities.HomeActivity t3625");
		
		AppiumDriver<MobileElement> driver=new AndroidDriver<MobileElement>(remoteAddress, desiredCapabilities);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		

		
	}

}
