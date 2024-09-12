import java.util.*;
import java.lang.*;

public class Studentdetails {
    public static void main(String[] args) {
        String name, city, course;
        int roll_no;

        Scanner S = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = S.nextLine();

        System.out.print("Enter roll number: ");
        roll_no = S.nextInt();
        S.nextLine();

        System.out.print("Enter course: ");
        course = S.nextLine();

        System.out.print("Enter city: ");
        city = S.nextLine();

        System.out.println("Output: Student Name: " + name + " \n Roll Number: " + roll_no + "\n Course: " + course + "\n City: " + city);

    }
    
}
