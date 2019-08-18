package com.carwale.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.carwale.testbase.TestBase;
import com.carwale.testpages.SearchNewCars;

public class SearchNewCarsTest extends TestBase {

	public SearchNewCarsTest() {
		super();
	}

	SearchNewCars searchNewCars;

	@BeforeMethod
	public void setUp() {
		initialization();
		searchNewCars = new SearchNewCars();
	}

	@Test
	public void getresult() {
		searchNewCars.gotoSearchPage();
	}

	@AfterMethod()
	public void tearDown() {
		// driver.quit();
	}
}
