import java.util.Scanner;
public class Frequency {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string");
        String str= sc.next();
        System.out.println("Enter character to search");
        String ch=sc.next();
        int len=str.length();
        int count=0;
        for(int i=0; i<len; i++)
        {
            if(ch.charAt(0)==str.charAt(i))
            {
                count++;
            }
        }
        System.out.println("frequency is:");
        System.out.println(count);
    }
}
