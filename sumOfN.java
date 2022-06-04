package Loops;

import java.util.Scanner;

import Input.sum;

public class sumOfN {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1; i<=n ;i++){
            sum = sum+i;
            
        }
        System.out.println(sum);
        
    }
    
}
