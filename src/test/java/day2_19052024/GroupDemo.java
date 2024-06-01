package day2_19052024;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDemo {
	
	@Test(groups = {"Mac.Smoke"})
	public void test1()
	{
		System.out.println("Test 1 {\"Smoke\"}");
		Assert.assertTrue(false);
	}
	@Test(groups = {"Linux.Sanity"})
	public void test2()
	{
		System.out.println("Test 2 {\"Sanity\"}");
	}
	@Test(groups = {"Smoke","Sanity"})
	public void test3()
	{
		System.out.println("Test 3 {\"Smoke\",\"Sanity\"}");
	}
	@Test(groups = {"Windows.Regression"})
	public void test4()
	{
		System.out.println("Test 4 {\"Regression\"}");
	}
	@Test(groups = {"Sanity","Regression"})
	public void test5()
	{
		System.out.println("Test 5 {\"Sanity\",\"Regression\"}");
	}
	@Test(groups = {"Smoke"})
	public void test6()
	{
		System.out.println("Test 6 {\"Smoke\"}");
	}
	@Test(groups = {"Smoke","Sanity","Regression"})
	public void test7()
	{
		System.out.println("Test 7 {\"Smoke\",\"Sanity\",\"Regression\"}");
	}

}
