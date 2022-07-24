package javaprogramja;

import java.awt.Dimension;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class p2 
{
public static void main(String[] args) 
{
	List a=new ArrayList();
	a.add("Shreyash");
	a.add(1);
	a.add(9.0);
	for(int i=0;i<3;i++)
	{
	System.out.println(a.get(i));
	}
	
	
	HashSet s=new HashSet();
	s.add("shreyash");
	s.add("Shreyash");
	for(int i=0;i<2;i++)
	{
		System.out.println(s);
	}
}
	
	
}

