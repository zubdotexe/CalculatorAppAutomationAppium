import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class CalcScreen {

    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement btnAdd;

    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnSub;

    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement btnMul;

    @FindBy(id = "com.google.android.calculator:id/op_div")
    WebElement btnDiv;

    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btnEqual;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement txtResult;

    @FindBy(id = "com.google.android.calculator:id/clr")
    WebElement btnClear;

    AndroidDriver driver;

    public CalcScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickBtn(String num) {
        for(int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            driver.findElement(By.id("com.google.android.calculator:id/digit_" + digit)).click();
        }
    }

    public void checkOp(String op) {
        if(op.equalsIgnoreCase("-")) {
            btnSub.click();
        }
        else if(op.equalsIgnoreCase("+")) {
            btnAdd.click();
        }
        else if(op.equalsIgnoreCase("*")) {
            btnMul.click();
        }
        else if(op.equalsIgnoreCase("/")) {
            btnDiv.click();
        }
    }

    public int calculateSeries(String value) {
        String number = "";
        for(int i = 0; i < value.length(); i++) {
            if(value.charAt(i) == '-' || value.charAt(i) == '+' || value.charAt(i) == '*' || value.charAt(i) == '/') {
                clickBtn(number);
                number = "";
                checkOp(Character.toString(value.charAt(i)));
            }
            else {
                number += value.charAt(i);
            }
        }

        clickBtn(number);
        number = "";

        btnEqual.click();

        return Integer.parseInt(txtResult.getText());
    }
}
