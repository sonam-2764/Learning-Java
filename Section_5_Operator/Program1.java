// calculate area 

package Section_5_Operator;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        
        float height,base,area;
        Scanner ab = new Scanner(System.in);
        System.out.println("enter the value of base ");
        base = ab.nextFloat();
        System.out.println("enter the value of height ");
        height = ab.nextFloat();
        ab.close();

        area = 0.5f*base* height;
        System.out.println("the value af area is " + area);

        
    }    
}
