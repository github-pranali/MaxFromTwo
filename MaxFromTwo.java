import java.lang.*;
import java.util.*;

public class MaxFromTwo
{
    public static void main(String[] args)
    {

        int N1 = 0,N2=0;
        Scanner S = new Scanner(System.in);

        System.out.println("Enter first number :");
        N1 = S.nextInt();
        System.out.println("Enter second number :");
        N2 = S.nextInt();

        if(N1 == N2)
        {
          System.out.println("Both numbers are equal");

        }
        else if(N1 > N2)
        {
            System.out.println("Number  " + N1 + " is Maximum.");
        }
        else
        {
           System.out.println("Number " + N2 + " is Maximum.");
        }
        System.out.println("Thanks");

    }
}