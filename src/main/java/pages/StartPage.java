package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.testng.ScreenShooter;

import context.Context;
import org.junit.AfterClass;
import org.junit.BeforeClass;


import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Configuration.browserPosition;
import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static context.Context.password;
import static context.Context.user;


/**
 * Created by Smit on 28.10.2017.
 */
public class StartPage {

    @BeforeClass
    public static void openInbox() {
        timeout = 10000;
        Configuration.browser = "chrome";
        System.setProperty("selenide.browser", "chrome");
        open("http://gmail.com");
        login();
    }




    @AfterClass
    public static void logout() {
        closeWebDriver();
    }

    public static void login() {
        $("#identifierId").val(user).pressEnter();
        $("#password input").val(password).pressEnter();
    }


}