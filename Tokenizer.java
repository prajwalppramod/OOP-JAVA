import java.util.*;
class Tokenizer {
    public static void main(String args []) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with one space gap:");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer (s, " ");
        System.out.println("Total number of Tokens: "+st.countTokens());
        sc.close();
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }

        System.out.println("sum of the integers is: " + sum);
    }
}


// import java.util.*;
// class Tokenizer
// {
//     public static void main(String args[])
//     {
//         int n;
//         int sum=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter numbers with one space gap:");
//         String s = sc.nextLine();
//         StringTokenizer st=new StringTokenizer(s,"");
//         sc.close();
//         while(st.hasMoreTokens())
//         {   
//             String temp = st.nextToken();
//             n = Integer.parseInt(temp)
//         }
//     } 
// }


