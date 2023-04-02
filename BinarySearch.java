import java.util.*;
class BinarySearch
{	public static void main(String args[])
	{	int n[]=new int[50];
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of integers: ");
		int m=sc.nextInt();
		for(int i=0; i<m; i++)
		{	System.out.print("Enter number " + (i+1) + ":");
			n[i]= sc.nextInt();
		}
		for(int j=0; j<m-1; j++)
		{	for(int k=0; k<m-j-1; k++)
			{	if(n[k]>n[k+1])
				{	temp = n[k];
					n[k]=n[k+1];
					n[k+1]=temp;
				}
			}
		}
		int upper=m-1;
		int lower=0;
		System.out.println("Enter the number to be searched");
		int num=sc.nextInt();
		sc.close();
		int flag=0;
		while(lower<=upper)
		{	int mid=(upper+lower)/2;
			if(n[mid]==num)
			{	System.out.println("Number found at "+ (mid+1));
				flag++;
				break;
			}
			else if(n[mid]>num)
			{	upper=mid-1;
			}
			else
			{	lower=mid+1;
			}
		}
		if(flag==0)
		{	System.out.println("Number not found");
		}
	}
}
