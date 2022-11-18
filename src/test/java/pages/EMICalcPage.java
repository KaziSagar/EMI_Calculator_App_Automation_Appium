package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static setup.Setup.PACKAGE_NAME;

public class EMICalcPage {

    @FindBy(id = PACKAGE_NAME + ":id/btnStart")
    public AndroidElement btnStart;
    @FindBy(id = PACKAGE_NAME + ":id/etLoanAmount")
    public AndroidElement txtLoanAmount;
    @FindBy(id = PACKAGE_NAME + ":id/etInterest")
    public AndroidElement txtInterest;
    @FindBy(id = PACKAGE_NAME + ":id/etYears")
    public AndroidElement txtPeriod;
//    @FindBy(id = PACKAGE_NAME + ":id/etMonths")
//    public AndroidElement txtMonths;
    @FindBy(id = PACKAGE_NAME + ":id/etEMI")
    public AndroidElement txtEMIAmount;
    @FindBy(id = PACKAGE_NAME + ":id/etFee")
    public AndroidElement txtProcessingFee;
    @FindBy(id = PACKAGE_NAME + ":id/btnCalculate")
    public AndroidElement btnCalculate;
    @FindBy(id = PACKAGE_NAME + ":id/btnReset")
    public AndroidElement btnReset;




    @FindBy(id=PACKAGE_NAME+ ":id/monthly_emi_result")
    public MobileElement mEMI;
    @FindBy(id=PACKAGE_NAME+ ":id/total_interest_result")
    public MobileElement tInterest;
    @FindBy(id=PACKAGE_NAME+ ":id/processing_fee_result")
    public MobileElement tpFee;
    @FindBy(id=PACKAGE_NAME+":id/total_payment_result")
    public MobileElement tPayment;

    public EMICalcPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void calculateEMI(int loanAmount, double interest, int period, double processingFee){
        txtLoanAmount.sendKeys(""+loanAmount+"");
        txtInterest.sendKeys(""+interest+"");
        txtPeriod.sendKeys(""+period+"");
        txtProcessingFee.sendKeys(""+processingFee+"");
        btnCalculate.click();

    }
}
