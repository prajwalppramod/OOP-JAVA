//Prajwal P P CS2S3
import java.io.*;

class FileException
{	public static void main(String args[]) throws IOException
	{	try
		{	int c;
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
		{	System.out.println("\nProgram terminated");
		}
	}
	
	
}

/*
java.io.FileNotFoundException: Filehandling1.txt (No such file or directory)

Program terminated
*/

//java.io.FileNotFoundException: Filehandling1.txt (No such file or directory)
//Program terminated

