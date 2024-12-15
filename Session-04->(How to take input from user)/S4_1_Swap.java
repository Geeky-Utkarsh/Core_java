import java.util.*;

// Program to swap 2 number using 3rd variable 

public class S4_1_Swap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter value of a : ");
        int a=sc.nextInt();

        System.out.println("Enter value of b :");
        int b=sc.nextInt();

        System.out.println("Before swapping :\na : "+a+"\nb : "+b);

        // logic to swap 
        int tmp=a;
        a=b;
        b=tmp;

        System.out.println("Value After swap  a=> "+a+"\nValue of b=> "+b);

        sc.close();

    }
}
