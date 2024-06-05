package lession;

public class CoverLoop {
    public static void main(String[] args) {
    //about loop
        int num = 1;
        while (num < 5){
            System.out.println(num);
            num++;
        }

        do{
            System.out.println("First statement");
            num++;
        }while (num < 7);

        for(int i =0; i < 5; i++){
            System.out.println(i);
        }

        int[] numbers ={1,2,3,4,5};
        for(int num2 : numbers){
            System.out.println(num2);
        }

        char ch = 'a';
        System.out.println(Character.isAlphabetic(ch)); //a to z
    }
}
