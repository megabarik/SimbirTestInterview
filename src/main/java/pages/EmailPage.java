package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;

public class EmailPage {
    public static void search(String query){
        $("#aso_search_form_anchor > div > input").val(query).pressEnter(); //Search emails
    }

    public static int takeCountEmails() {
        try {
            SelenideElement s = $$(By.xpath("//body/div/div[3]//*/div/div[2]/div/span/div/span/span[2]")).get(1); // Take quantity emails
            return Integer.parseInt(s.getText()); //return quantity emails
        } catch (Exception e){
            return 0; // Check if something wrong
        }

    }

    public static void createEmail() {
        $(byText("Написать")).click(); // click write email
    }
}
