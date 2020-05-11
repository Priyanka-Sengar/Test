package Utility;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

import Assert.Locator;

public class Keyword {

	public static WebDriver webDriver;



	public static void getURL(String url)
	{
		try{
			webDriver.get(url);
		}catch(Exception e)
		{
			System.out.println("get method is not supported"+e);
		}
	}

	public static String getcurrentURL()
	{
		String value=null;
		try{
			webDriver.getCurrentUrl();

		}catch(Exception e)
		{
			System.out.println("getCurrentURL method is not supported"+e);
		}
		return value;
	}

	public static WebElement getWebElement(String actualLocator) {
		WebElement element = null;
		try {
			if (actualLocator.startsWith("/")) {
				element = webDriver.findElement(By.xpath(actualLocator));
			} else {
				try {
					element = webDriver.findElement(By.id(actualLocator));
				} catch (Exception e) {
					try {
						element = webDriver.findElement(By.name(actualLocator));
					} catch (Exception e1) {
						try {
							element = webDriver.findElement(By.cssSelector(actualLocator));
						} catch (Exception e2) {
							try {
								element = webDriver.findElement(By.className(actualLocator));

							}catch (Exception e5) {									

							}
						}
					}

				}
			}

		} catch (Exception e) {
			System.out.println("locator is not supported"+e);
		}
		return element;
	}


	public static void maximize()
	{
		try
		{
			webDriver.manage().window().maximize();
		}catch (Exception e) {
			System.out.println("locator is not supported"+e);
		}
	}

	public static void implicitWait(int wait)
	{
		try
		{
			webDriver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
		}catch (Exception e) {
			System.out.println("locator is not supported"+e);
		}
	}

	public static void scrollIntoView(String actualLocator)
	{
		try{
			WebElement element=getWebElement(actualLocator);

			JavascriptExecutor je = (JavascriptExecutor) webDriver;

			je.executeScript("arguments[0].scrollIntoView(true);",element);
		}catch(Exception e)
		{
			System.out.println("locator is not supported"+e);
		}


	}

	public static List<WebElement> getWebElementList(String actualLocator) {
		List<WebElement> element = null;
		try {
			if (actualLocator.startsWith("//")) {
				element = webDriver.findElements(By.xpath(actualLocator));
			} else {
				try {
					element = webDriver.findElements(By.cssSelector(actualLocator));
					if(element.size()!=0)
						return element;
					else
						element = webDriver.findElements(By.name(actualLocator));
					if(element.size()!=0)
						return element;
					else
						element = webDriver.findElements(By.id(actualLocator));
					if(element.size()!=0)
						return element;
					else
						element = webDriver.findElements(By.className(actualLocator));
					if(element.size()!=0)
						return element;
					else
						element = webDriver.findElements(By.linkText(actualLocator));
					if(element.size()!=0)
						return element;
					else
						element = webDriver.findElements(By.partialLinkText(actualLocator));
					if(element.size()!=0)
						return element;
					else
						return null;
				} catch (Exception e) {
					System.out.println("locator is not supported"+e);
				}
			}
		} catch (Exception e) {
			System.out.println("locator is not supported"+e);
		}
		return element;
	}
	
	
	public static void click(String actualLocator)
	{
		try
		{
			getWebElement(actualLocator).click();
		}catch(Exception e)
		{
			
		}
	}

}





