package see;
import java.util.*;

public class external extends cie.student
{
	public int b[]=new int[5];
	public int mar[];
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter SEE marks of course " + (i+1)+ ":" );
			b[i]=sc.nextInt();
		}
	}
}