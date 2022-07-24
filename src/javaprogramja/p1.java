package javaprogramja;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class p1 
{
public static void main(String[] args) throws IOException 
{
System.setProperty("webdriver.gecko.driver",
		"F:\\Automation\\mozela\\geckodriver.exe");
WebDriver driver =new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://vctcpune.com/selenium/practice.html");
WebElement showbutton=driver.findElement(By.xpath("//input[@id='show-textbox']"));

WebElement display=driver.findElement(By.xpath("//input[@id='displayed-text']"));
boolean a=display.isDisplayed();
if(a==true)
{
	
}
//how to handle dropdownn
WebElement drop=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
drop.click();
Select s=new Select(drop);
s.selectByIndex(2);

WebElement hidebutton=driver.findElement(By.xpath("//input[@id='hide-textbox']"));
hidebutton.click();
boolean aa=display.isSelected();
System.out.println(aa);
showbutton.click();
boolean bb=display.isSelected();
System.out.println(bb);
if(aa==false)
{
	showbutton.click();
	display.sendKeys("shreyahs");
	
}
else
{
	
}

Date d =new Date();
DateFormat d1=new SimpleDateFormat("MM-dd-yy-mm-hh-ss");
String date=d1.format(d);
System.out.println(date);

TakesScreenshot ts=(TakesScreenshot)driver;
File source=ts.getScreenshotAs(OutputType.FILE);
File dist=new File("F:\\screen"+date+"velocity.jpg");
FileHandler.copy(source, dist);
System.out.println("end of program");



}
}

