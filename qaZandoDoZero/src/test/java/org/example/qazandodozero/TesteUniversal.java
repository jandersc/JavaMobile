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
import java.util.Locale;

public class TesteUniversal {

    private static ScreenLogin ScreenLogin;
    private static AppiumDriver<RemoteWebElement> driver;

    public static String local = "";
    public static String plataforma = "";

    @BeforeClass
    public static void caps() throws MalformedURLException {

        local = System.getProperty("local").toLowerCase();
        plataforma = System.getProperty("plataforma").toLowerCase();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (local.equals("local") && plataforma.equals("android")) {
            System.out.println("Caiu no Android");
            capabilities.setCapability("app", new File("apps/app-debug.apk"));
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("unicodeKeyboard", "true");
            capabilities.setCapability("automationName", "UiAutomator2");
            driver = new AndroidDriver<RemoteWebElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
            ScreenLogin = new ScreenLogin(driver);
        } else if (local.equals("devicefarm") && plataforma.equals("android")) {
            System.out.println("Parametros Errado configurar device farm");
        }

    }

    @Test
    public void testeLogin2() {
        ScreenLogin.logar();
    }
}