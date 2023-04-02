import java.io.*;
import java.util.*;
class TokenizerFile
{	public static void main(String args[])
	{	try{
			int n;
			int c;
			int sum=0;
			String p="";
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numbers: ");
			String s=sc.nextLine();
			FileWriter fw=new FileWriter("tokenizer.txt");
			fw.write(s);
			fw.close();
			FileReader fr=new FileReader("tokenizer.txt");
			while((c=fr.read())!=-1)
			{	p = p + (char)c;
			}
			StringTokenizer st=new StringTokenizer(p," ");
			sc.close();
			fr.close();
			while(st.hasMoreTokens())
			{	String temp=st.nextToken();
				n=Integer.parseInt(temp);
				System.out.println(n);
				sum+=n;
			}
			System.out.println("Sum is: "+sum);
		}
		catch(Exception e)
		{	System.out.print(""+e.toString());
		}
	}
}
/*OUTPUT
Enter the numbers: 
5 14 16 12 10
5
14
16
12
10
Sum is: 57
*/
