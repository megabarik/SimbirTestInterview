package tests;

import com.codeborne.selenide.Configuration;
import context.Context;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.EmailPage;
import pages.StartPage;
import pages.WriteEmailWidget;

import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static context.Context.*;

public class StartingTests extends StartPage {


    int count;



    @Test
    public void countEmails() {
        EmailPage.search(searchParam); //search lastname emails
        count = EmailPage.takeCountEmails(); // count emails
        //System.out.println(count); // For Debug
        Assert.assertTrue(count != 0); // check email != 0
        EmailPage.createEmail(); // crate email
        WriteEmailWidget.writeEmail(count, lastName, receiver); // write email
        WriteEmailWidget.sendEmail(); // send email
        WriteEmailWidget.checkSendEmail();
    }
}




