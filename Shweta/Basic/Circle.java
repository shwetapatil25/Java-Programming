import java.util.*;
import java.lang.*;

public class Circle {
    public static void main(String[] args) {
        
        float PI = 3.14f;

        Scanner S = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float Radius = S.nextFloat();
        
        float area = PI*Radius*Radius;
        System.out.print("Area of circle is: "+area);
        
    }
}
