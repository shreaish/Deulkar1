package javaprogramja;

import java.util.Arrays;
import java.util.Collections;

public class StringProgram 
{
public static void main(String[] args)
{
	String a="nivrutti";
	String aa="";
	char x;
	int c=0,v=0;
	for(int i=0;i<a.length();i++)
	{
		x=a.charAt(i);
	if(x!=' ')
	{
		if(x=='a'||x=='e'||x=='i'||x=='o'|x=='u')
		{
			v++;
		}
		else
		{
			c++;
		}
	}
	 

}
	System.out.println(v);
	System.out.println(c);
}
}