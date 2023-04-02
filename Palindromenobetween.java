//Prajwal P P CS2S3
import java.util.Scanner;
public class Palindromenobetween
{	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		System.out.print("Enter 3 DIGIT number 1: ");
		int n1=sc.nextInt();
		System.out.println();
		System.out.print("Enter 3 DIGIT number 2 :");
		int n2=sc.nextInt();
		
		for(int i=n1; i<n2; i++)
		{	
			//int x=((i%10)*100)+(((i%100)/10)*10)+((i%100)%10);
			//if(i==x)
			//	System.out.println(x);
			//}
			int x=0;
			int m=i;
			x=(x*10)+(m%10)
			
		}
	}
}
/*
Enter 3 DIGIT number 1: 124

Enter 3 DIGIT number 2 :200
131
141
151
161
171
181
191
*/
