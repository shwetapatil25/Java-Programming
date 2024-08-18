import java.util.*;
import java.lang.*;

public class Reverse_table
{
    public static void main (String[] args)
    {
        int num = 0, i = 10, a =0;
        Scanner s = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter a number: ");
        num = s.nextInt();

        while(i >= 1)
        {
            a = num * i;
            System.out.println("\n  "+ num +" * " + i +" = " + a);
            i--;
        }
    }
}