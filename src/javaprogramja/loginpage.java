package javaprogramja;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class loginpage 

{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver",
			"F:\\Automation\\mozela\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.saucedemo.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement username=driver.findElement(By.xpath("	//input[@id='user-name']"));
	username.sendKeys("standard_user");
	System.out.println("Enter username");
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sauce");
	System.out.println("enter Password");
	WebElement link=driver.findElement(By.xpath("//input[@id='login-button']"));
	Actions act =new Actions (driver);
	act.click(link).perform();
List <WebElement> addproduct=driver.findElements(By.xpath("//button[text()='Add to cart']"));
for(int i=0;i<6;i++)
{
	addproduct.get(i).click();
}
	System.out.println("End of program");
	
	List<String> all=new ArrayList<String>(driver.getWindowHandles());

for(int i=0;i<1;i++)
{
	System.out.println(all.get(i));
}
System.out.println("End of Progrmmmmm");
}
}
