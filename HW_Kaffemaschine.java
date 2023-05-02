package ifelseoperators;

import java.util.Scanner;

public class HW_Kaffemaschine {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pls which trink you want ( 1 = espresso; 2 = americano; 3 = cappuccino; 4 = tea): ");
        int trink = sc.nextInt();
        sc.close();

        if (trink == 1) {
            System.out.println("espresso");
        } else if (trink == 2) {
            System.out.println("americano");

        } else if (trink == 3) {
            System.out.println("cappuccino");

        } else if (trink == 4) {
            System.out.println("tea");

        }


    }
}
