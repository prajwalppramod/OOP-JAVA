import java.util.*;
class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit=sc.nextInt();
        int string[]=new int[30];
        System.out.println("Enter the string:");
        for(int i=0; i<limit; i++){
            string[i]=sc.nextInt();
        }
        System.out.println("Enter number to search:");
        int search = sc.nextInt();
        for(int i=0; i<limit; i++){
            if(string[i]==search){
                System.out.println("Item found at " + i);
            }
        }
    }
}
