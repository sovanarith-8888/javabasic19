package lession;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CoverArray {
    public static void main(String[] args) {
        int[] numbers;
        int[] allNumbers = {1,2,3,4,5,6,7,8,9};
        String[] allNames = {"Rith","Dara","Heng"};

        int[] lists =new int[2];
        lists[0] = 1;
        lists[1] = 2;
        for(int a : lists){
            System.out.println(a);
        }

        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        findMax();
        findExit();
        sortArray();
    }
    // find max
    public static void findMax(){
        int[] minMaxs = {1,3,4,5,10};
        int max = minMaxs[0];
        for(int i = 1; i< minMaxs.length; i++){
            if(max < minMaxs[i]){
                max = minMaxs[i];
            }
        }
        System.out.println("Max is " + max);
    }
    // find exist or not
    public  static void findExit(){
        String[] name = {"n","a","d"};
        System.out.println(name.length);
        String find ="d";
        int result = -1;
        for(int i  = 0; i < name.length ; i++){
            System.out.println(name[i]);
            if(find == name[i].toString()){
                result ++;
                System.out.println("Result " + result);
            }
        }
        if(result > 0){
            System.out.println("Search found.");
        }else{
            System.out.println("Search not found.");
        }
    }
    // Sorting
    public  static void sortArray(){
        int[] notSort = {1,6,4,5,10};
        System.out.println("Original array" + Arrays.toString(notSort));
        for(int i = 0; i < notSort.length; i++){
            for(int j = i + 1; j < notSort.length; j++){
                if(notSort[i] > notSort[j]){
                    int tmp = notSort[i];
                    notSort[i] = notSort[j];
                    notSort[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(notSort));
    }

}
