import java.util.*;
import java.lang.*;

public class Table
{
    public static void main(String[] args)
    {
        int num=0, i=1;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = s.nextInt();

        while(i<=10)
        {
            System.out.println(+num+ "*" +i+ "=" +num*i);
            i++;
        }
    }
}