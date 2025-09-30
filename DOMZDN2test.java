import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DOMZDN2test {
    @Test
    void test056() {
    open("https://www.saucedemo.com/");
        $("#user-name").setValue("standard_user");
        $("#password").setValue("secret_sauce");
        $("#login-button").click();
        $("body").shouldHave(text("Swag Labs"));
        sleep(5_000);
    }

    @Test
    void test057() {
        open("https://www.saucedemo.com/");
        $("#user-name").setValue("standard_user");
        $("#password").setValue("errorpass");
        $("#login-button").click();
        $("body").shouldHave(text("Username and password do not match any user in this service"));
        sleep(5_000);
    }
}