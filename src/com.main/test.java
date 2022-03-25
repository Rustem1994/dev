package com.main;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        if (A>4) {
            if (A==5) {
                System.out.println("YES =5");
            }else{
                if (A==6) {
                    System.out.println("YES =6");
                }else{
                    System.out.println("NOT 6");
                }
            }
        }else{
            System.out.println("NOT");
        }

        switch (A){
            case 4: System.out.println("4"); break;
            case 5: System.out.println("5"); break;
            case 6:{ System.out.println("6");} break;
        }
    }
}
