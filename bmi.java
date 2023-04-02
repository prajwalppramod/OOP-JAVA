import java.util.Scanner;
public class bmi {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your weight");
        int weight=sc.nextInt();
        System.out.println("Enter your height in metres");
        float height=sc.nextFloat();
        float bmi= weight/(height*height);
        System.out.println("Your BMI is");
        System.out.println(bmi);
        if(bmi<18.5)
        {   System.out.println("Underweight");}
        else if(bmi>18.5 && bmi<25)
        {   System.out.println("Correct weight");}
        else
        {   System.out.println("Overweight");}

    }
}
