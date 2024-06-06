package lession;

public class AboutGeneric {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        Box<Integer> intBox = new Box<>();

        stringBox.setItem("haha");
        intBox.setItem(12);

        System.out.println(stringBox.getItem());
        System.out.println(intBox.getItem());

        Utils.printValue(44);
        Utils.printValue("Hello to the world.");
    }
}

/*Generic class*/
class Box<T> {
    private T item;
    public  void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
}

final class Utils {
    public static <T> void printValue(T value){
        System.out.println("value is " + value);
    }
}