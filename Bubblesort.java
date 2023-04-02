import java.util.Scanner;
public class Bubblesort {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        int limit,temp;
        System.out.println("Enter the limit of array:");
        limit=sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0; i<limit; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0; j<limit-1; j++)
        {
            for(int k=0; k<limit-1; k++)
            {
                if(arr[k]>arr[k+1])
                {
                    temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        System.out.println("Sorted array is:");
        for(int l=0; l<limit; l++)
        {
            System.out.println(arr[l]+" ");
        }

    }
}
