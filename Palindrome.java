//Prajwal CS2S342


import java.util.Scanner;
class Palindrome
{	public static void main(String args[])
	{	int flag =0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a word"); 
		String s = reader.next();
		String st= "";
		int n = s.length();
		for (int i=n-1;i>=0;i--)
		{	st= st+ s.charAt(i);
		}
		for( int i=0; i<n-1;i++)
		{
			if (s.charAt(i)!=st.charAt(i))
			{	flag++;break;
				}
		}
		if(flag==0)
		{	System.out.println("Palindrome");
		}
		else
 		{	System.out.println("Not Palindrome");
		}
	}
}

/* OUTPUT

Enter a word
malayalam
Palindrome */		
