import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{

    @Test(priority = 1, description = "Verify the result of a series")
    public void doSeries() {
        CalcScreen calcScreen = new CalcScreen(driver);
        int actualResult = calcScreen.calculateSeries("50+10-20*2+10/2");

        int expectedResult = 50+10-20*2+10/2;

        Assert.assertEquals(actualResult, expectedResult);

    }

    @AfterTest
    public void clearScreen() {
        CalcScreen calcScreen = new CalcScreen(driver);
        calcScreen.btnClear.click();
    }
}
