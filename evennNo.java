package Loops;

import java.util.Scanner;

//import javax.sound.sampled.SourceDataLine;

public class evennNo {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n"); 
        int n = sc.nextInt();
        int sum = 0, num=1, count=0;
        while(count<n){
            if(num%2==0){
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println("Sum is "+sum);
    }
    
}
