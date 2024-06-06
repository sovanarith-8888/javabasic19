package lession;

public class Ananomous {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Anonymous class implementing an interface.");
            }
        };
        myInterface.myMethod();
        Parent par = new Parent(){
            @Override
            void display() {
                super.display();
            }
        };
    }
}

/*Example 1: Anonymous Class Implementing an Interface*/
interface MyInterface{
    void myMethod();
}

/* Example 2: Anonymous Class Extending a Class */
class Parent{
    void display(){
        System.out.println("Parent class method");
    }
}
