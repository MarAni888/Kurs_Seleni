import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DZKredKalkTest {

    @Test
    void test02_ZapolneniePoley() {
        open("https://slqamsk.github.io/cases/loan-calc/v01");
        $("#amount").sendKeys("100000");
        $("#term").sendKeys("24");
        $("#rate").sendKeys("7.5");
        $("#calculate-btn").click();

    }
}