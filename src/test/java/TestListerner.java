import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListerner implements ITestListener
{
    public void onTestFailure(ITestResult result)  {

       Reports.extentTest.log(Status.FAIL,"Test Failed/Not Completed");
    }
    public void onTestSuccess (ITestResult result) {
        Reports.extentTest.log(Status.PASS,"Test Pass/Successfully Completed");
    }

}
