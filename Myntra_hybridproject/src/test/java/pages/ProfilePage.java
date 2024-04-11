package pages;

import org.openqa.selenium.By;

import projectBase.Common;

public class ProfilePage extends Common {
	private By profilepage= By.xpath("//div/div[2]/div[2]/div[1]/div[2]");
	
	public boolean validatprofilepageisdisplayed() {
		return isdisplayed(profilepage);
		
	}

}
