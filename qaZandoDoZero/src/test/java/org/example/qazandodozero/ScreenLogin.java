package org.example.qazandodozero;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class ScreenLogin {

    public ScreenLogin(AppiumDriver<RemoteWebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "login_username")
    private RemoteWebElement campoEmail;

    @AndroidFindBy(id = "login_password")
    private RemoteWebElement campoSenha;

    @AndroidFindBy(id = "login_button")
    private RemoteWebElement botaoLogar;
}
