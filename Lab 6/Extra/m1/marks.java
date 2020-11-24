package m1;
import java.util.*;
public class marks
{
	public double m1,m2,m3;
	public marks(double x,double y,double z)
	{
		m1=x;
		m2=y;
		m3=z;
	}
	public double avg(){
		double z=(m1+m2+m3)/3;
		return z;
	}
	}