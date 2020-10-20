package sample;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CMAS_360_Setup_Module_Testing {


	public static WebDriver Driver;

	public static void main(String[] args) throws InterruptedException


	{
		// set the Property

		System.setProperty("webdriver.chrome.driver", "C:\\downlod files\\Jars\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");

		//Declare Chromedriver

		Driver=new ChromeDriver();





		// Maximize the window
		Driver.manage().window().maximize();

		//Page timeout

		Driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		// Webdriver wait 
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// navigate to the Url
		Driver.get("http://202.144.121.180/Agent/public/login");


		// Log in 

		Driver.findElement(By.id("email")).sendKeys("accesstest@gmail.com");
		Driver.findElement(By.id("password")).sendKeys("Test@123");
		Driver.findElement(By.id("btnLogin")).click();



		//find setup

		WebElement setup=Driver.findElement(By.xpath("//*[@id='js-nav-menu']/li[2]/a/span"));

		setup.click();

		// find Role

		Driver.findElement(By.xpath("//*[@id='js-nav-menu']/li[2]/ul/li[2]/a/span")).click();


		// click new button on find role

		Driver.findElement(By.xpath("//*[@id='newBtn']")).click();


		// Add Role Management

		// sendkeys to Designation

		WebElement Designation=Driver.findElement(By.id("userReferenceName"));
		Designation.sendKeys("BhuvaneshWaran");

		// click dropdown option

		WebElement slug=Driver.findElement(By.id("slug"));
		Select select=new Select(slug);
		select.selectByIndex(1);



		// sendkeys to description

		WebElement description=Driver.findElement(By.id("description"));
		description.sendKeys("testing ");

		// click the option
		Driver.findElement(By.xpath("//*[@id='1_anchor']/i[1]")).click();

		// click save option

		Driver.findElement(By.xpath("//*[@id='role_form']/div[3]/div/div/button[2]")).click();



		
			// click ok button
			Driver.findElement(By.xpath("/html/body/div[7]/div[7]/div/button")).click();
			System.out.println("testCase passes");
			logout();

		
		
			
		


		/*String vali=Driver.findElement(By.xpath("//*[@id='role']/tbody/tr/td[text()='BhuvaneshWaran']")).getText();

		System.out.println(vali);


		if(vali.contains("Bhuvaneshwaran"))
		{
			System.out.println("TestCAse is Passed");
		}
		else
		{
			System.out.println("testCase Failed");
		}*/


		// calling logout function 

		







		/*String s=Driver.getTitle();



		if(s.contains("AMS360 v 1.0.0 | Dashboard"))
		{
			System.out.println("testcase passed");
		}
		else
		{
			System.out.println("testcase Failed");
		}*/







	}




	public static  void logout()
	{
		Driver.findElement(By.xpath("//*[@id='topNavLogo']/img")).click();
		Driver.findElement(By.xpath("/html/body/div[3]/div/div/header/div[4]/div/div/a[3]/span")).click();



	}

}
