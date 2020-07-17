package com.casestudy1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Casestudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://elearningm1.upskills.in/");	
		driver.manage().timeouts().implicitlyWait(100L, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign up!")).click();
		driver.manage().timeouts().implicitlyWait(100L, TimeUnit.SECONDS);
		driver.findElement(By.id("registration_firstname")).sendKeys("Deepa");
		driver.findElement(By.id("registration_lastname")).sendKeys("Surya");
		driver.findElement(By.id("registration_email")).sendKeys("msdeepashree@gmail.com");
			        int r = (int) (Math.random() * 500.0D);
	        if (r <= 10) {
	            r += 11;
	            System.out.println(r);
	        }
	        WebElement element = driver
	                .findElement(By.id("username"));
	        element.sendKeys(new CharSequence[] { String.valueOf(r) });
	        //element = driver.findElement(By.id("username"));
//		driver.findElement(By.id("username")).sendKeys("Deepashreems26");
		driver.findElement(By.id("pass1")).sendKeys("secret123");
		driver.findElement(By.id("pass2")).sendKeys("secret123");
		driver.findElement(By.id("registration_submit")).click();
		driver.manage().timeouts().implicitlyWait(100L, TimeUnit.SECONDS);
		WebElement actual = driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/p[1]"));
		String actualtext = actual.getText();
		System.out.println("The actual text: " + actualtext );
		String expectedtext = "Your personal settings have been registered";
		System.out.println("Expected string is: " +expectedtext);
		if (actualtext.contains(expectedtext))
		{
		System.out.println("******************************");
		System.out.println("Registration done successfully");
		System.out.println("******************************");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
	 driver.findElement(By.xpath(".//img[@src='http://elearningm1.upskills.in/main/img/icons/32/unknown.png']")).click();
	 String emailtxt = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/div/p")).getText();
	 System.out.println(emailtxt);
	 String expectedemail = "msdeepashree@gmail.com";
	 System.out.println("Expected string is: " +expectedemail);
		if (emailtxt.contains(expectedemail))
		{
		System.out.println("*******************************");
		System.out.println("Email verified successfully");	
		System.out.println("******************************");
		}
		else
		{
			System.out.println("Test case failed");
		}
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/div/a/p")).click();
	driver.manage().timeouts().implicitlyWait(100L, TimeUnit.SECONDS);
	driver.findElement(By.className("email-overflow")).click();
	driver.manage().timeouts().implicitlyWait(100L, TimeUnit.SECONDS);
	driver.findElement(By.className("select2-search__field")).clear();
	driver.findElement(By.className("select2-search__field")).sendKeys("msdeepashree@gmail.com");
	System.out.println("Entered SendTo emailid");
	driver.findElement(By.xpath("//*[@id=\"select2-compose_message_users-results\"]/li[2]")).click();
	System.out.println("Selected an already enetered emailid");
	driver.findElement(By.id("compose_message_title")).sendKeys("Test email");
	try {
		System.out.println("Entered subject of the email");	
		Thread.sleep(6000);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body")).sendKeys("Hello Mr. Naveen \n" + "    This is for testing \n" + "\n" + "From,"+ "\n"+ "Deepa");
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		System.out.println("Entered message body");
		driver.findElement(By.id("compose_message_compose")).click();
		String actualconfmsg = driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div[1]")).getText();
		String expectedconfmsg = "The message has been sent to";
		if (actualconfmsg.contains(expectedconfmsg))
		{	
			System.out.println("*********************************");
			System.out.println("Sent email, test suite passed!!!");			
			System.out.println("*******************************");
		}
		else
		{
			System.out.println("Test suite failed");
		}
		driver.quit();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
