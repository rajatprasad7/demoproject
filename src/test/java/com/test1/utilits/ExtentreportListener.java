package com.test1.utilits;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.trvel1.testcase.Baseclass;

public class ExtentreportListener extends Baseclass implements ITestListener {
	ExtentSparkReporter create;
	ExtentReports test;
	ExtentTest Log;
	public void steup() {
		ExtentSparkReporter create =new ExtentSparkReporter("klo.html");
		test=new ExtentReports();
		test.attachReporter(create);
		
		
		test.setSystemInfo("Browser", "Chrome");
		test.setSystemInfo("Company name", "Google");
		test.setSystemInfo(" Test Name", "Rajat");
		
		
		create.config().setDocumentTitle("Report");
		create.config().setReportName("testReport");
		create.config().setTheme(Theme.DARK);
		
	}
	
	@Override	
	 public void onStart(ITestContext context) {
		    // not implemented
		 steup();
		  }
	



	@Override
	public void onTestSuccess(ITestResult result) {
		 Log=test.createTest(result.getName());
	     Log.log(Status.PASS,MarkupHelper.createLabel("Pass of the test", ExtentColor.GREEN));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("hellofail");
		try {
			Screenshot();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String path="C:\\Users\\rajat\\eclipse-workspace\\travel-20260128T095950Z-3-001\\First\\Screenshot\\lo.png";
		 Log=test.createTest(result.getName());
	     Log.log(Status.FAIL,MarkupHelper.createLabel("Fail of the test", ExtentColor.RED));
	   Log.fail(" Screenshot of he fail test"+Log.addScreenCaptureFromPath(path));
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		 Log=test.createTest(result.getName());
	     Log.log(Status.SKIP,MarkupHelper.createLabel("SKIPP of the test", ExtentColor.GREEN));
	}

	@Override
	public void onFinish(ITestContext context) {
test.flush();
	}

}
