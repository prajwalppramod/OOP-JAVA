//Prajwal CS2 S3 42


import java.util.Scanner;
class Freq
{	public static void main(String args[])
	{	Scanner reader = new Scanner(System.in);
		System.out.println("Enter a line"); 
                String s = reader.next();
		System.out.println("Enter the alphabet to check");
		String m = reader.next();
		int c=0;
		int n = s.length();
		for (int i=0;i<n;i++)
		{	if(s.charAt(i)==m.charAt(0));
				c++;
		}
		c= c/2;
		System.out.println("Frequency of "+ m +" is "+c);
		
	}
}
/* OUTPUT

Enter a line
HaHaHaHa
Enter the alphabet to check
a
Frequency of a is 4 */
