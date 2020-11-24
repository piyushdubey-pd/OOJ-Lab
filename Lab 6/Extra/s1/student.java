package s1;
import java.util.*;

public class student
{
	public String name;
	public String usn;
	public student(String m,String n)
	{
		name=m;
		usn=n;
	}

	public void display()
	{
		System.out.println("Name : " + name);
		System.out.println("USN : " + usn);
		
	}
}