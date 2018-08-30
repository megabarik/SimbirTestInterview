package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class WriteEmailWidget {

    public static void writeEmail(int count, String lastName, String receiver) {
        $(By.xpath("//textarea[@aria-label='Кому']")).setValue(receiver); //Write to field who wants receive email
        $(By.xpath("//input[@name='subjectbox']")).setValue("Тестовое задание.  " + lastName); // Write Theme
        $("div[aria-label='Тело письма']").click(); // Click body email
        $("div[aria-label='Тело письма']").setValue("Писем от Ильи Филинина: " + count); // Fill body email

    }

    public static void sendEmail(){
        $(By.xpath("//*/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]")).click();
        Selenide.sleep(3000);
    }
    @Step("Check Email")
    public static void checkSendEmail() {
        $(byText("Письмо отправлено.")).shouldHave(text("Письмо отправлено."));
    }
}
