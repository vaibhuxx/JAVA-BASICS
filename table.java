package Input;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(num + "*"+i+"="+num*i);

        } 
    }
    
}
