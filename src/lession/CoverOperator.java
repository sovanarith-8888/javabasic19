package lession;

public class CoverOperator {
    public static void main(String[] args) {
        /* Operator is a special symbols that perform specific operation on one two three or four*/
        // Arithmetic Operator
        int a = 5;
        int b = 6;
        a = a + b;
        a = a - b;
        a = a * b;
        a = a / b;

        System.out.println("Result about Arithmetic operator " + a);

        // Unary Operator
        int positive = +a;
        positive = -a;
        positive = ++a;
        positive = --a;

        // Assignment Operator
        int negative = 40;
        negative += 1;
        negative -= 1;
        negative *= 2;
        negative /= 2;

        // Relational operator use for compare to value
        if(negative == positive){

        }

        // Bitwise
        boolean result = false & false; // false
        boolean result2 = false || true;
        System.out.println("About Bitwise & is " + result);
        System.out.println("About Bitwise & is " + result2);
    }
}
