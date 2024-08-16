import java.util.*;
import java.lang.*;

public class Addition
{
    public static void main(String[] args)
    {
        int N1,N2,Addition;
        Scanner S=new Scanner(System.in);

        System.out.print("\n Enter 1st number: ");
        N1=S.nextInt();

        System.out.print("\n Enter 2nd number: ");
        N2=S.nextInt();

        Addition=N1+N2;

        System.out.println("\n Addition of " + N1 + " & " + N2 +" is "+Addition+ ".");
    }
}
