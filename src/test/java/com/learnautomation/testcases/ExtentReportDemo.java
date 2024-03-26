package com.learnautomation.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	
	@Test
	public void loginTest() {
		System.out.println("Login to Amazon"); 
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/MyMavenProject.html");
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest logger = extent.createTest("loginTest");
		
		logger.log(Status.INFO, "Login to Amazon");
		
		logger.log(Status.PASS, "Title varified");
		
		extent.flush();
		
		
	}
	

}
