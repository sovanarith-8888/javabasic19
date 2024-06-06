package lession;

public class CoverInheritance {
    public static void main(String[] args) {
        Animal dog = new Dog("Breed",2,"Big");
        dog.makeSound();
        System.out.println("Animal name: " + dog.getName());
        System.out.println("Animal age: " + dog.getAge());

        Cat cat = new Cat("Meaw Meaw",1,"Cute");
        System.out.println("Animal cat: " + cat.getName());

        Animal animal_cat = (Cat) cat;
        animal_cat.makeSound();

        Dog fatherDog = new Dog("Bezk Zee",3,"From USA");
    }
}

/* Base or Supper Class */
class Animal{
    private String name;
    private int age;
    final int dob = 3;
    public Animal(){}
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Generic animal sound");
    }
    /* Can't reassigned*/
    // public void setDob(){this.dob =3;}
    /* Final method child class can not override */
    public  final void showEmpty(){
        System.out.println("no");
    }
}
/* Subclass or Derived class */
class Dog extends Animal{
    private String breed;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public String getBreed(){return this.breed;}
    @Override
    public void makeSound() {
        super.makeSound();
    }
}

class Cat extends Animal{
    private String furColor;
    public  Cat(String name, int age, String furColor){
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("My cat say meow meow");
    }

}