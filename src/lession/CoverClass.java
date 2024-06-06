package lession;

public class CoverClass {

    // Fields variable or properties
    private String color ;
    String model ;

    public CoverClass(){}
    public CoverClass(String color, String model){
        this.color = color;
        this.model = model;
    }

    // Method
    void display(){
        System.out.println("Model: " + model + " Color: " + color);
    }
    public static void main(String[] args) {
        CoverClass coverClass = new CoverClass();
        coverClass.color  = "Black";
        coverClass.model = "BMW";
        coverClass.display();
    }
}

