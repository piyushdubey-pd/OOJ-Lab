import java.util.*;
import cie.*;
import see.*;


public class student_end
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		int finalmar;
		System.out.println("Enter the Number of students ");
		n=sc.nextInt();
		internals inter[]=new internals[n];
		external exter[]=new external[n];
		internals ob1=new internals();
		external ob2=new external();
		ob2.mar=new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of the student " + (i+1));
			inter[i]=new internals();
			inter[i].read();
			exter[i]=new external();
			exter[i].read();
		}
        System.out.println();
		for(int i=0;i<n;i++)
		{
			System.out.println("Student-->" + (i+1));
			System.out.println("USN of the student is " + inter[i].usn);
		    System.out.println("Name of the stuednt is " + inter[i].name);
		    System.out.println("Semester of the student is " + inter[i].sem);
			for(int j=0;j<5;j++)
			{
			   finalmar=inter[i].a[j]+((exter[i].b[j])/2);	
			   System.out.println("Final Marks of student " + (i+1) + " in course " + (j+1) +"\t"+ finalmar);

			}
			System.out.println();
		}

	}

}
