package sample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo12 {

	public static void main(String[] args) throws InterruptedException
	
	{
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\downlod files\\Jars\\FireFox_Driver\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		
		

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("aadith4396@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("jasssam");
		//driver.findElement(By.xpath("//*[@class='_1avdGP']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span")).click();

		

		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("iPhone 11" +Keys.ENTER);
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
		
		Set<String> s=driver.getWindowHandles();
		
		
		
		for (String i : s) 
		{
			
			
			driver.switchTo().window(i);
			
			
			
			
			/*if(t.contains("IPhone 11 - Buy Products Online at Best Price in India - All Categories | Flipkart.com"))
			{
				Thread.sleep(15000);
				driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
			}*/
			
			
		}
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		
		
		
		


		/*driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[5]/div[2]/div/div/div/div/label/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[6]/div[2]/div/div[1]/div/div/label/div[1]")).click();

		driver.findElement(By.xpath("//*[text()='Apple iPhone SE (Black, 64 GB)']")).click();

		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//WebDriverWait wait=new WebDriverWait(driver, 30);
		//Thread.sleep(8000);

		driver.findElement(By.xpath(".//input[@id='add-to-cart-button'")).click();

		driver.findElement(By.xpath(".//input[@id='add-to-cart-button' and
		@name='submit.add-to-cart']")).click();

		driver.findElement(By.cssSelector("#add-to-cart-button")).click();*/


	}

}
