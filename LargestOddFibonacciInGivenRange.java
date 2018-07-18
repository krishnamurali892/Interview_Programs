package CricBuzz;

import java.util.Scanner;

public class LargestOddFibonacciInGivenRange {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("please enter min:");
            int min = keyboard.nextInt();
            System.out.println("please enter max:");
            int max = keyboard.nextInt();
            findLargestOddFibonacciInGivenRange(min, max);
        }
    }

    public static void findLargestOddFibonacciInGivenRange(int min, int max){
        int f0 = 0;
        int f1 = 1;
        int fn = f0 + f1;
        int largest = -1;
        while(fn <= max) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
            System.out.print(" " + fn);
            if (fn % 2 != 0 && fn >= min && fn <= max) {
                largest = fn;
            }
        }
        System.out.println("\n Largest Odd fibonacci: " + largest);
    }
}
