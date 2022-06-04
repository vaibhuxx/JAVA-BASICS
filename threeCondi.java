package Loops;

import java.util.Scanner;

public class threeCondi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b)
            System.out.println("Both a and b are Equal");
        
        else if(a>b){
                System.out.println("a is greater than b");
            }
            else{
                if(a<b){
                    System.out.println("a is less than a");
                }
            }
    }
}
