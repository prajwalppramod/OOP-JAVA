import java.util.Scanner;
public class Stringfrequency {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        System.out.println("Enter the character to search:");
        String ch=sc.next();
        int len=str.length();
        int count=0;
        for(int i=0; i<len; i++)
        {
            if(str.charAt(i)==ch.charAt(0))
                count++;
        }
        System.out.println("Count is:");
        System.out.println(count);
    }
}
