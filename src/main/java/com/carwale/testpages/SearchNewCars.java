package com.carwale.testpages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.carwale.testbase.TestBase;
import com.carwaleTestUtils.TestUtils;

public class SearchNewCars extends TestBase {

	@FindBy(xpath = "//div[@class='top-nav-label js-main-nav-label']/span[text()='New Cars']")
	WebElement newCarsPopup;

	@FindBy(xpath = "//ul[@class='nested-panel-list']/li/a[contains(.,'Find New Cars')]")
	WebElement findNewCarsLink;

	@FindBy(xpath = "//li/h3[contains(.,'Body Type')]")
	WebElement bodyTypeTabLink;

	@FindBy(xpath = "//span[contains(.,'SUV/MUV')]")
	WebElement suvmuvLink;

	@FindBy(xpath = "//span[contains(@id,'budget_exp_col')]")
	WebElement budgetExpandBtn;

	@FindBy(xpath = "//a[contains(.,'8-12 lakh')]")
	WebElement budget8_12;

	@FindAll(@FindBy(xpath = "//*[@id='modShow']"))
	List<WebElement> versionCount;

	@FindAll(@FindBy(xpath = "//a[@class='href-title']"))
	List<WebElement> carNameList;

	@FindAll(@FindBy(xpath = "//td[@class='price2']"))
	List<WebElement> carPriceList;

	public SearchNewCars() {
		PageFactory.initElements(driver, this);
	}

	public void gotoSearchPage() {
		try {
			actions.moveToElement(newCarsPopup).perform();
			TestUtils.click(findNewCarsLink);
			TestUtils.click(bodyTypeTabLink);
			TestUtils.click(suvmuvLink);
			TestUtils.click(budgetExpandBtn);
			TestUtils.click(budget8_12);
			Thread.sleep(3000);
			String data;
			for (int i = 0; i < carNameList.size(); i++) {
				data = carNameList.get(i).getText().toString();
				System.out.println(data);
				TestUtils.setCellData("Sheet2", i, 0, data);
			}
			for (int i = 0; i < carPriceList.size(); i++) {
				data = carPriceList.get(i).getText().toString();
				data = data.substring(2, 12);
				System.out.println(data);
				TestUtils.setCellData("Sheet2", i, 2, data);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
