package cie;
import java.util.*;
public class student
{
	public String usn;
	public String name;
	public int sem;

	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter usn:");
		usn=sc.next();
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter semester:");
		sem=sc.nextInt();
	}
}

