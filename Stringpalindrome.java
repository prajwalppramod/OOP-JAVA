import java.util.Scanner;
public class Stringpalindrome
{
    public static void main(String args[])
    {   int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String str= sc.next();
        int len=str.length();
        for(int i=0; i<len; i++)
        {
            if(str.charAt(i)!=str.charAt(len-i-1))
            {
                flag=1;
                break;
            }

        }
        if(flag==1)
        {
            System.out.println("Not palindrome");
        }
        else{
            System.out.println("Palindrome");
        }
}}