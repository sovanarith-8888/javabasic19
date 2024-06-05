package exercise;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You can input something, I will guest Odd rr Even ");
        int getNum = scanner.nextInt();
        if(getNum / 2 == 0){
            System.out.println("Your number is Even");
        }else{
            System.out.println("Your number is Odd");
        }
    }
}
