public class sumofdiagonals {
    public static void main(String args[])
    {
        int arr[][]={{1,2,3},{4,5,7},{10,3,5}};
        int sum=0;
        for(int i=0; i<3;i++)
        {
            sum=sum+arr[i][i];
        }
        for(int j=0; j<3; j++)
        {
            for(int k=0; k<3; k++)
            {
                System.out.print(arr[j][k] + "     ");
            }
            System.out.println();
        }
        System.out.println("Sum of diagonals is:" + sum);

    }
}
