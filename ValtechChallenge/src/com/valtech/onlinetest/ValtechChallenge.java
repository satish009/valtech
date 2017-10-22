package com.valtech.onlinetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValtechChallenge {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "\\Desktop\\geckodriver.exe");
		 driver = new FirefoxDriver();
		
driver.get("https://www.valtech.com/");
driver.manage().window().maximize();
WebElement LN = driver.findElement(By.xpath("//html/body/div[1]/main/div[2]/div[3]/div[1]/header/h2"));

	if(LN.isDisplayed())
		System.out.println("The Latest News section is displayed");
	else
		System.out.println("The Latest News section is NOT displyed");
	
	//Navigating to About page by clicking About link
	
	driver.findElement(By.xpath("//html/body/div[1]/header/div/nav/div/div[2]/div/ul/li[1]/a/span")).click();
	
	Thread.sleep(10000);
	WebElement about = driver.findElement(By.xpath("//html/body/div[1]/main/div[1]/h1"));

	if(about.isDisplayed())//Checking HI tag about text is displaying
	{
		System.out.println("ABOUT tag heading is displayed");
		String tagtext = about.getText();
		
		if(tagtext.equalsIgnoreCase("About"))
			System.out.println("HI Tag is displayed as ABOUT");			
			else
			System.out.println("HI Tag is NOT displayed as ABOUT");	
							
	}
	else
		
		System.out.println("ABOUT tag heading is NOT displyed");
		
	
	driver.findElement(By.xpath("//html/body/div[1]/header/div/a/i")).click();
	Thread.sleep(10000);
	
	
	//Navigating to Work page by clicking About link
	
		driver.findElement(By.xpath("//html/body/div[1]/header/div/nav/div/div[2]/div/ul/li[2]/a/span")).click();
		Thread.sleep(10000);
		
		WebElement work = driver.findElement(By.xpath("//html/body/div[1]/main/header/h1"));

		if(work.isDisplayed())//Checking HI tag work text is displaying
		{
			System.out.println("Work tag heading is displayed");
			String tagtext = work.getText();
			
			if(tagtext.equalsIgnoreCase("Work"))
				System.out.println("HI Tag is displayed as WORK");			
				else
				System.out.println("HI Tag is NOT displayed as WORK");	
								
		}
		else
			System.out.println("WORK tag heading is NOT displyed");
		
		driver.findElement(By.xpath("//html/body/div[1]/header/div/a/i")).click();
		Thread.sleep(10000);
		//Navigating to Services page by clicking About link
		
			driver.findElement(By.xpath("//html/body/div[1]/header/div/nav/div/div[2]/div/ul/li[3]/a/span")).click();
			Thread.sleep(10000);
			
			WebElement service = driver.findElement(By.xpath("//html/body/div[1]/main/section/header/h1"));

			if(service.isDisplayed())//Checking HI tag work text is displaying
			{
				System.out.println("Services tag heading is displayed");
				String tagtext = service.getText();
				
				if(tagtext.equalsIgnoreCase("Services"))
					System.out.println("HI Tag is displayed as Services");			
					else
					System.out.println("HI Tag is NOT displayed as Services");	
									
			}
			else
				System.out.println("Services tag heading is NOT displyed");
			driver.findElement(By.xpath("//html/body/div[1]/header/div/a/i")).click();
			Thread.sleep(10000);
			
			//Navigating to Contact Page
			
			driver.findElement(By.xpath("//html/body/footer/div/div[1]/div/div/div/div[1]/div/div/span")).click();
			Thread.sleep(10000);
			
			WebElement findus = driver.findElement(By.xpath("//html/body/footer/div/div[2]/p[2]"));
			
			
			String valof =findus.getText();
			
			String[] valofces = valof.split(",");
			
			int valofcescount  = valofces.length;
			
			System.out.println("The number of Valtech offices are  : " + valofcescount);
		
			
			
		}
}
