package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMDashboard extends PageObject {
	
	public void loginVerified()
	{
		System.out.println(getDriver().getTitle());
		Assert.assertTrue(getDriver().getTitle().contains("OrangeHRM"));
	}
	
	public void clickLogout()
	{
		$(By.id("welcome")).click();
		$(By.partialLinkText("Logout")).click();
	}

}
