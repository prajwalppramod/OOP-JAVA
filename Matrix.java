//Prajwal PP S3CS2 42


import java.util.Scanner;
class Matrix
{	public static void main(String args[])
	{	Scanner reader = new Scanner(System.in);
		
		int m1[][] = new int [10][10];
		int m2[][] = new int [10][10];
		int m3[][] = new int [10][10];
		System.out.println("Enter the order of matrix A");
		System.out.print("Rows: ");
		int r1 = reader.nextInt();
		System.out.print("Columns: ");
		int c1 = reader.nextInt();
	
		System.out.println("Enter the order of matrix B");
		System.out.print("Rows: ");
		int r2 = reader.nextInt();
		System.out.print("Columns: ");
		int c2 = reader.nextInt();

		if(c1!=r2)
		{	System.out.println("Multiplication not possible");
		}
		else
		{	System.out.println("Enter values of Matrix A");
			for(int i=0;i<r1;i++)
			{	for(int j=0;j<c1;j++)
					{	System.out.print("A["+i+"]["+j+"]:");
						m1[i][j]= reader.nextInt();
					}
			}
			System.out.println("Enter values of Matrix B");
			for(int i=0;i<r2;i++)
			{	for(int j=0;j<c2;j++)
					{	System.out.print("B["+i+"]["+j+"]:");
						m2[i][j]= reader.nextInt();
					}
			}
			int temp;	
			for(int i =0;i<r1;i++)
			{	for(int j=0;j<c2;j++)
				{	temp = 0;
					for(int k=0;k< r2; k++)
					{	temp += m1[i][k]*m2[k][j];
					}
					m3[i][j]=temp;
 				}
			}
			System.out.println("\n \n The Multiplied Matrix is:");
			for(int i=0;i<r1;i++)
			{	for(int j=0;j<c2;j++)
					{	System.out.print(m3[i][j]+"   ");
						
					}
					System.out.println("\n");
			}
		}
	}
}

	
			

/* OUTPUT

Enter the order of matrix A
Rows: 2
Columns: 3
Enter the order of matrix B
Rows: 3
Columns: 2
Enter values of Matrix A
A[0][0]:12
A[0][1]:35
A[0][2]:56
A[1][0]:56
A[1][1]:54
A[1][2]:12
Enter values of Matrix B
B[0][0]:65
B[0][1]:12
B[1][0]:32
B[1][1]:45
B[2][0]:65
B[2][1]:45



5540   4239

6148   3642 */	























