package com.baselib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testnglistner implements ITestListener {

	@Override
	public void onFinish(ITestContext Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult Result) {
		// TODO Auto-generated method stub
	System.out.println("The name of the testcase failed is :"+Result.getName());	
	}

	@Override
	public void onTestSkipped(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("The name of the testcase Skipped is :"+Result.getName());
	}

	@Override
	public void onTestStart(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println(Result.getName()+"test case started");
	}

	@Override
	public void onTestSuccess(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("The name of the testcase passed is :"+Result.getName());
	}

}
