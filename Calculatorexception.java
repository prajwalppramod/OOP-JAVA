//Prajwal P P CS2S3
import java.util.Scanner;
class Calculatorexception
{	public static void main(String args[])
	{	try
		{
			int ch,num1,num2;
			double result;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number 1: ");
			num1=sc.nextInt();
			System.out.println("Enter number 2: ");
			num2=sc.nextInt();
			System.out.println("Enter choice \n1.Addition \n2.Multiplication \n3.Subtraction \n4.Division");
			ch=sc.nextInt();
				switch(ch)
				{	case 1:	System.out.println(num1+num2); break;
					case 2:	System.out.println(num1*num2); break;
					case 3:	System.out.println(num1-num2); break;
					case 4:	System.out.println(num1/num2); break;
					default: 	System.out.println("Enter valid choice");
				}
		}
		catch(Exception e)
		{	System.out.println(""+e.toString());
		}
	}
}

/*
Enter number 1: 
44
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
