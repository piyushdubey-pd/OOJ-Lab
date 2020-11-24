package cie;
import java.util.*;

public class internals extends student
{
	public int a[]=new int[5];

	public void read()
	{
		super.read();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter CIE marks for all 5 courses");
	    for(int i=0;i<5;i++)
	    {
	    	System.out.println("Enter marks of course " + (i+1)+":");
	    	a[i]=sc.nextInt();
	    }
	}
	public void display()
	{
		System.out.println("USN : " + usn);
		System.out.println("Name : " + name);
		System.out.println("Semester : " + sem);
	}


}