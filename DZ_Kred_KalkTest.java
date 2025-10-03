import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class DZ_Kred_KalkTest {

    @Test
    void test02_ZapolneniePoley() {
        open("https://slqamsk.github.io/cases/loan-calc/v01");
        $("#amount").sendKeys("100000");
        $("#term").sendKeys("24");
        $("#rate").sendKeys("7.5");
        $("#calculate-btn").click();

    }
}