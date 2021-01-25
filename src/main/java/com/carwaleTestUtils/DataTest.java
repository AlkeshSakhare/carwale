package com.carwaleTestUtils;

import java.io.IOException;
import java.util.ArrayList;

import com.carwale.testbase.TestBase;

public class DataTest extends TestBase {

	public static void main(String[] args) throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("1");
		a.add("2");
		a.add("1");
		a.add("2");
		a.add("1");
		a.add("2");
		a.add("1");
		a.add("2");
		a.add("1");
		a.add("2");

		String a1[] = { "1", "2", "1", "2", "1", "2", "1", "2", "1", "2" };
		String xlfile = userdir + "/src/main/java/com/carwale/testdata/TestData.xlsx";
		String xlsheet = "Sheet1";
		for (int i = 0; i < a1.length; i++) {
			XLUtils.setCellData(xlfile, xlsheet, i, 0, a1[i]);
		}
	}
}