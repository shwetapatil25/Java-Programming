import java.util.*;
import java.lang.*;

public class MaximumOfTwo
{
    public static void main(String[] args)
    {
        int N1, N2;
        Scanner S = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        N1 = S.nextInt();

        System.out.print("Enter the second number: ");
        N2 = S.nextInt();

        if (N1>N2)
        {
            System.out.print("First number "+N1+ " is maximum.");
        }
        else
        {
            System.out.print("Second number "+N2+ " is maximum");
        }
    }
}