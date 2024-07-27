package org.example.qazandodozero;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DeviceFarmLogin {
    private static ScreenLogin ScreenLogin;
    private static AppiumDriver<RemoteWebElement> driver;

    @BeforeClass
    public static void caps() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browserstack.user", "jandercerqueira_Zbu6HX");
        caps.setCapability("browserstack.key", "7HvJWtpqwR7W2ktszqLw");

        caps.setCapability("app", "bs://8f4931942e5db22dec369113375cc7ffe94375ca");
        caps.setCapability("deviceName", "Samsung Galaxy S23");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "13.0");

        caps.setCapability("automationName", "UiAutomator2");

        driver = new AndroidDriver<RemoteWebElement>(new URL("http://hub.browserstack.com/wd/hub"), caps);
        ScreenLogin = new ScreenLogin(driver);
    }

    @Test
    public void testeLoginDeviceFarm(){
        ScreenLogin.logar();
    }
}
