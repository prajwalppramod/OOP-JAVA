import java.util.*;
public class Quicksort {
    public static void main(String[] args)
    {
        int arr[]=new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int num=sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0; i<num; i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        Quicksort q= new Quicksort();
        q.quicksort(arr, 0, num-1);
        System.out.println("Sorted array is");
        for(int i=0; i<num; i++)
        {
            System.out.println(arr[i]);
        }
    void quicksort(int A[],int low, int high)
    {
        int i=low;
        int j=high;
        int pivot=A[(high+low)/2];
        while(low<=high)
        {
            if(A[i]<pivot)
            {
                i++;
            }
            else if(pivot<A[j])
            {
                j--;
            }
            else if(i<=j)
            {
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                i++;
                j--;
            }
            else 
            {
                break;
            }
            if(low<j)
            {
                quicksort(A, low, j);
            }
            if(i<high)
            {
                quicksort(A, i, high);
            }
        }
    }
}
