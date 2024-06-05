package exercise;

import java.util.Scanner;

public class SumTwoNum {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== Print Total of Tow Number ======");

        System.out.print("Input First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input Second Number: ");
        int num2 = scanner.nextInt();

        // cal total
        int total = num1 + num2;
        System.out.println("Total is " + total);
    }


}
