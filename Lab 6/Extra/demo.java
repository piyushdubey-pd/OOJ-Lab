import s1.*;
import m1.*;
import java.util.*;

public class demo
{
	public static void main(String[] args)
	{
		String name,usn;
		double m1,m2,m3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name and USN of the student");
		name=sc.next();
		usn=sc.next();
		student obj=new student(name,usn);

		System.out.println("Enter marks in 3 subjects");
		m1=sc.nextDouble();
		m2=sc.nextDouble();
		m3=sc.nextDouble();

		marks obj1=new marks(m1,m2,m3);
		obj.display();
		double aver= obj1.avg();
		System.out.println("Average : " +aver);
	}
}