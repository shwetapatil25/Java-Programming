import java.util.*;
import java.lang.*;

public class Even_odd
{
    public static void main(String[] args)
    {
        int No=0;
        System.out.print("\n Enter a number: ");
        Scanner S=new Scanner(System.in);
        No=S.nextInt();

        if(No%2==0)
        {
            System.out.println("\n Number is an even.");
        }
        else
        {
            System.out.println("\n Number is an odd");
        }
    }

}