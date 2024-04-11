package projectBase;

import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions action;
	public Properties prop;
	public File file;
	public FileInputStream fis;
	public FileOutputStream fos;
	
	
	public void setupDriver(){
		try {
			file=new File("C:\\Users\\niraj\\eclipse-workspace\\Myntra_hybridproject\\src\\test\\resources\\confi\\configuration.properties");
			fis =new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);
			
			String browser= prop.getProperty("browser");
			if(browser.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
			}else if(browser.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.get(prop.getProperty("Url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			wait= new WebDriverWait(driver,Duration.ofSeconds(30));
			action= new Actions(driver);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
		
}
