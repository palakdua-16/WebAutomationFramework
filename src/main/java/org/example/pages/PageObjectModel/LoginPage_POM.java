package org.example.pages.PageObjectModel;

import com.sun.org.apache.xml.internal.security.algorithms.implementations.ECDSAUtils;
import org.example.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LoginPage_POM extends CommonToAllPage {
    WebDriver driver;

    public LoginPage_POM() {
        super();
    }


    //  Page Locators
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");


    // Page Actions
    public String loginToVWOInvalidCreds() throws InterruptedException {
        enterInput(username, "admin");
        enterInput(password, "admin");
        clickElement(signButton);
        Thread.sleep(5000);
        return getElement(error_message).getText();

    }

}


