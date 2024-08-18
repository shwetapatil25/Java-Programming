import java.util.*;
import java.lang.*;

public class MaximumOfThree
{
    public static void main(String[] args)
    {
        int N1, N2, N3;
        Scanner S = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        N1 = S.nextInt();

        System.out.print("Enter the second number: ");
        N2 = S.nextInt();

        System.out.print("Enter the third number: ");
        N3 = S.nextInt();

        if ((N1 == N2) && (N2 == N3))
        {
            System.out.print("All numbers are equal.");
        }
        else if ((N1 > N2) && (N1 > N3))
        {
            System.out.print("First number "+N1+ " is maximum");
        }
        else if ((N2 > N1) && (N2 > N3))
        {
            System.out.print("Second number "+N2+ " is maximum");   
        }
        else 
        {
            System.out.print("Third number "+N3+ " is maximum");
        }
    }
}