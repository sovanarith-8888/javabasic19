package lession;

public class CoverAbstractClass {
    public CoverAbstractClass(){}

    public static void main(String[] args) {
        DogAnimal dogAnimal = new DogAnimal();
        dogAnimal.makeSound();
        new DogAnimal().makeSound();
        new DogAnimal().eat();
    }
}
abstract class AnimalCambodia{
    /* Abstract method is a method not have body */
    public abstract void makeSound();
    /* Regular method is a simple method that have body */
    public void eat() {
        System.out.println("This animal eat vegetables normally");
    }
}
class DogAnimal extends AnimalCambodia{

    @Override
    public void makeSound() {
        System.out.println("Sound cambodia so great");
    }
}