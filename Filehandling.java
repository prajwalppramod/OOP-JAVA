//Prajwal P P CS2S3
import java.io.*;
import java.util.*;

class Filehandling
{	public static void main(String args[]) throws IOException	
	{	try
		{	int c;
			String x;
			Scanner cin=new Scanner(System.in);
			System.out.println("Enter the line: ");
			x = cin.nextLine();
			cin.close();
			FileWriter fin= new FileWriter("Filehandling.txt");
			for(int i=0; i<x.length(); i++)
			{	fin.write(x.charAt(i));
			}
			System.out.println("Writing successful");
			fin.close();
			FileReader fout=new FileReader("Filehandling.txt");
			while((c=fout.read()) != -1)
			{	System.out.print((char)c);
			}
			fout.close();
		}
		catch(Exception e)
		{
			System.out.println(""+ e.toString());
		}
		finally
		{	System.out.println("Program terminated");
		}
	}
	
	
}

/*
Enter the line: 
Hello World
Writing successful
Hello WorldProgram terminated
*/
