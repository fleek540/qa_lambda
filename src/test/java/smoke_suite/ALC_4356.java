package smoke_suite;

import Utilities.BaseClass;
import Utilities.Data;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Orders;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import java.io.IOException;

public class ALC_4356 extends BaseClass {

    @Test(priority = 0, description = "Create data and do Transactions")
    public void createDataAndPerformTransaction() throws IOException {

        Data pn = new Data();
        pn.data_ALC_4356();


    }
    @Test(priority=1,description = "create Order In Alchemy")
    public void createOrder() throws InterruptedException {
try {
        AlchemyLoginPage login=new AlchemyLoginPage(alcDriver);
        login.alc_adminlogin("+17783844311","778778");

        Orders o1= new Orders(alcDriver);
        o1.createOrder();
        ((JavascriptExecutor) alcDriver).executeScript("lambda-status=" + "passed");
		
	}catch(Exception e) {
		((JavascriptExecutor) alcDriver).executeScript("lambda-status=" + "failed");
	}

    }
    @Test(priority=2,description = "Update name of created Order In Alchemy")
    public void updateOrder() throws InterruptedException {
try {
        Orders o2= new Orders(alcDriver);
        o2.editOrder();
        ((JavascriptExecutor) alcDriver).executeScript("lambda-status=" + "passed");
		
	}catch(Exception e) {
		((JavascriptExecutor) alcDriver).executeScript("lambda-status=" + "failed");
	}

    }
    @Test(priority=3,description = "Add Transactions in add From Exchange History Section In Alchemy | Verify Bonus Associated with the Actual Bonus")
    public void addTransactionInExcHistoryAndVerifyBonus() throws InterruptedException {
try {
        Orders o3= new Orders(alcDriver);
        o3.addFromExchangeHistory();
        ((JavascriptExecutor) alcDriver).executeScript("lambda-status=" + "passed");
		
	}catch(Exception e) {
		((JavascriptExecutor) alcDriver).executeScript("lambda-status=" + "failed");
	}

    }
    @Test(priority=3,description = "Verify Total kg from Bonus in Transaction Exchange History with Total/Collected/Pending Chart")
    public void verify_TotalKg() throws InterruptedException {
    	try {

        Orders o4= new Orders(alcDriver);
        o4.verifyTotalKg();
        ((JavascriptExecutor) alcDriver).executeScript("lambda-status=" + "passed");
		
	}catch(Exception e) {
		((JavascriptExecutor) alcDriver).executeScript("lambda-status=" + "failed");
	}

    }
}
