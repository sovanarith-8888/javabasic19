package lession;

/* This class reference to Person object */
/* This class taking about setter and getter accessor */
public class ClassAdvance1 {
    /* Field - Variable - Properties */
    private String name;
    private int age;
    private String address;
public  int aaa = 12;
    /* Constructor */
    public  ClassAdvance1(){}
    public  ClassAdvance1(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName(){ return this.name;}
    public void setName(String name){ this.name = name ;};

    public int getAge() {return this.age ;};
    public void setAge(int age){ this.age = age ;};

    public String getAddress(){ return this.address ;};
    public void setAddress(String address){ this.address = address;}

    /* Method to display details */
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
    }

    /* Main of the void method */
    public static void main(String[] args) {
        /* Create a person object */
        ClassAdvance1 person = new ClassAdvance1("Jonh Dev", 23, "12 Main str");

        /* Show information details */
        person.displayDetails();

        /* Edit address */
        person.setAddress("12 main str");
        person.displayDetails();
    }
}
