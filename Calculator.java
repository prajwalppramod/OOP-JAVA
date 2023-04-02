//Prajwal P P CS2S3
import java.util.Scanner;
import java.lang.*;
class Calculator
{	public void add(double numa, double numb)
	{	
			System.out.println(numa+numb);
		
		
	}
	public void subtract(double numa, double numb)
	{	
			System.out.println(numa-numb);
		
	}
	public void multiply(double numa, double numb)
	{	
			System.out.println(numa*numb);
		
	}
	public void division(double numa, double numb)
	{	try{
			System.out.println((int)numa/(int)numb);
		}
		catch(Exception e)
		{	System.out.println(""+e.toString());
		}
	}
	
	public static void main(String args[])
	{	try{
		double num1,num2;
		int ch;
		double result;
		Calculator ob=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1: ");
		num1=sc.nextDouble();
		System.out.println("Enter number 2: ");
		num2=sc.nextDouble();
		System.out.println("Enter choice \n1.Addition \n2.Multiplication \n3.Subtraction \n4.Division");
		ch=sc.nextInt();
		
		switch(ch)
			{	case 1:	
					ob.add(num1, num2);
					break;
				case 2:	 
					ob.subtract(num1,num2);
					break;
				case 3:	 
					ob.multiply(num1, num2);
					break;
				case 4:	 
					ob.division(num1, num2);
					break;
				default: 	System.out.println("Enter valid choice");
			}
		}
		catch(Exception e)
		{	System.out.println(""+e.toString());
		}
		finally
		{	System.out.println("Program executed");
		}
	}
}

/*
Enter number 1: 
50
Enter number 2: 
0
Enter choice 
1.Addition 
2.Multiplication 
3.Subtraction 
4.Division
4
java.lang.ArithmeticException: / by zero
*/

