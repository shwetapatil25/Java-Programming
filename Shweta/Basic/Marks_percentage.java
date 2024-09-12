import java.util.*;
import java.lang.*;

public class Marks_percentage {
    public static void main(String[] args) {
        int Subject1;
        int Subject2;
        int Subject3;

        Scanner S = new Scanner(System.in);

        System.out.print("Marks in Subject1: ");
        Subject1 = S.nextInt();

        System.out.print("Marks in Subject2: ");
        Subject2 = S.nextInt();

        System.out.print("Marks in Subject3: ");
        Subject3 = S.nextInt();

        int marks = Subject1+Subject2+Subject3;
        System.out.print("\n Total marks: "+marks);

        int percentage = marks/3;
        System.out.print("\n Percentage: "+percentage);
    }    
}
