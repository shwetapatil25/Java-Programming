import java.util.*;
import java.lang.*;

public class Calculator
{
    public static void main(String[] args)
    {
        int N1 = 0, N2 = 0, Res = 0, Choice = 0;
        Scanner S = new Scanner(System.in);
        System.out.println("====================CALCULATOR========================");

        while (true)
        {
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        
        System.out.print("\n Enter your choice: ");
        Choice = S.nextInt();

        if((Choice > 0) && (Choice < 6))
        {
            System.out.print("\n Enter 1st Number : ");
            N1 = S.nextInt();
            System.out.print("\n Enter 2nd Number : ");
            N2 = S.nextInt();
        }
        switch(Choice)
            {
                case 1:
                    Res = N1 + N2;
                    System.out.println("\n Addition of " + N1 + " and " + N2 + " is " + Res);
                    break;

                case 2:
                    Res = N1 - N2;
                    System.out.println("\n Substraction of " + N1 + " and " + N2 + " is " + Res);
                    break;

                case 3:
                    Res = N1 * N2;
                    System.out.println("\n Multiplication of " + N1 + " and " + N2 + " is " + Res);
                    break;

                case 4:
                    Res = N1 / N2;
                    System.out.println("\n Division of " + N1 + " and " + N2 + " is " + Res);
                    break;

                case 5:
                    Res = N1 % N2;
                    System.out.println("\n Remainder of " + N1 + " and " + N2 + " is " + Res);
                    break;
                
                default:
                    System.out.println("Invaild choice");
                    
            }
            System.out.println("============================================");
        }
    }
}