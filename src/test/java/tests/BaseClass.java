package tests;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.URL;

public class BaseClass {

    static AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setup() {
        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 9s");
            desiredCapabilities.setCapability(MobileCapabilityType.UDID, "a8bc60a7");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0.2");
            desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            desiredCapabilities.setCapability("chromeOptions", ImmutableMap.of("w3c", false));

            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            driver = new AppiumDriver<MobileElement>(url, desiredCapabilities);
        } catch (Exception e) {
            System.out.println();
        }
    }

    @Test
    public void SampleRun() {
        System.out.println("enter test");
    }

    @AfterSuite
    public void teardown() {
       // driver.close();
    }
}
