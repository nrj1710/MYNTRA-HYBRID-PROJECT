package pages;

import org.openqa.selenium.By;

import projectBase.Common;

public class HomePage extends Common{
	private By Profile= By.xpath("//div/span[2]");
	private By sinup =By.xpath("//a[contains(text(),'Signup')]");
	private By mobno =By.xpath("//input[@id='']");
	private By conti =By.xpath("//div/div/div[2]/div[2]/div[3]");
		
		
	
		
	
public boolean validatehomepage() {
	driver.findElement(Profile).click();
	driver.findElement(sinup).click();
	driver.findElement(mobno).click();
	driver.findElement(mobno).sendKeys("1598732564");
	driver.findElement(conti).click();
	ProfilePage profile =new ProfilePage();
	return profile.validatprofilepageisdisplayed();
	
}
}


