package lession;

public class CoverVariable {
    public static void main(String[] args) {
        /* Type of Variable 3 */
        /* Local Variable : Declared inside a method, constructor, or block*/
        /* Instance Variable: Declare in class but outside method*/
        /* Class Variable: Declare with static keyword*/

        int age = 12;
        int limit = 4;
        int a;
        a =55;
        a = 0; // a will store 0

        long UUId = 23423523;

        // Integer types
        byte byteVar =127;
        short shortVar =30000;
        int intVar =200000;
        long longVar = 1250000L;

        // Floating-point types
        float floatVar = 3.14f;
        double doubleVar = 3.141414;

        // Character type
        char charVar = 'A';

        // Boolean type
        boolean booleanVar = true;

        // Printing values
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);

    }
}
