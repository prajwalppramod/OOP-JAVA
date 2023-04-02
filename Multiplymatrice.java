import java.util.Scanner;
public class Multiplymatrice {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m1[][]= new int[5][5];
        int m2[][]= new int[5][5];
        int m3[][]= new int[5][5];
        System.out.println("Enter rows of first matrix:");
        int r1= sc.nextInt();
        System.out.println("Enter columns of first matrix:");
        int c1= sc.nextInt();
        System.out.println("Enter rows of second matrix:");
        int r2= sc.nextInt();
        System.out.println("Enter columns of second matrix:");
        int c2= sc.nextInt();
        
        System.out.println("Enter elements of first matrix:");
        for(int i=0; i<r1; i++)
        {
            for(int j=0; j<c1; j++)
            {
                m1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for(int i=0; i<r2; i++)
        {
            for(int j=0; j<c2; j++)
            {
                m2[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<r1; i++)
        {
            for(int j=0; j<c2; j++)
            {
                for(int k=0; k<c1; k++)
                {
                    m3[i][j] = m1[i][k] * m2[k][j];
                }

            }
        }

        System.out.println("Result is");
        for(int i=0; i<r1; i++)
        {
            for(int j=0; j<c2; j++)
            {
                System.out.println(m3[i][j] + "  ");
            }
        }

    }
}
