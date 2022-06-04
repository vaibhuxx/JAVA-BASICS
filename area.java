//Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

package Input;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float r = sc.nextFloat();
            double area = r * 3.14;
            System.out.println(area);
        } 
    }
    
}
