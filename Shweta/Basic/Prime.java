import java.util.*;
import java.lang.*;

public class Prime
{
    public static void main(String[] args)
    {
        int n = 0, a = 0, i = 2;
        Scanner S = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = S.nextInt();

        while(i <= n/2)
        {
            if(n % i == 0){
                a = 1;
                break;
            }
            i++;
        }
        if(a == 1){
            System.out.println(n + " is not a prime number.");
        }
        else{
            System.out.println(n + " is a prime number.");
        }
    }
}