package lession;

public class CoverOverloading {
    public static void main(String[] args) {
        CoverOverloading.printType("NowString");
        CoverOverloading.printType(12);

    }
    static void printType(String typeString){
        System.out.println("Type are String > " + typeString);
    }
    static void printType(int typeInt){
        System.out.println("Type are integer > " + typeInt);
    }

}
