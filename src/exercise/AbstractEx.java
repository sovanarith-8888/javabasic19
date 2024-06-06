package exercise;

public class AbstractEx {
    public static void main(String[] args) {

        /*Exercise 1: Shape Hierarchy*/
        Circle circle = new Circle("red",5);
        Rectangle rectangle = new Rectangle("Black",5,5);
        System.out.println(circle.area());
        System.out.println(rectangle.area());

        /* Exercise 2: Employee Hierarchy */
        SalaryEmployee salaryEmployee = new SalaryEmployee("Jon","A1",100);
        HourSalary hourSalary = new HourSalary("Jon","A1",2,100);

        System.out.println(salaryEmployee.calculateSalary());
        System.out.println(hourSalary.calculateSalary());
    }
}

/*Exercise 1: Shape Hierarchy*/
abstract class Shape{
    private String color;
    Shape(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    abstract double area();
}
class Circle extends Shape{
    double radius;
    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    double area() {
        return  width * height;
    }
}

/* Exercise 2: Employee Hierarchy */
abstract class Employee{
    String name;
    String id;

    Employee(String name, String id){
        this.name = name;
        this.id = id;
    }
    abstract double calculateSalary();
}

class SalaryEmployee extends Employee{
    double monthSalary;

    @Override
    double calculateSalary() {
        return monthSalary;
    }

    SalaryEmployee(String name, String id, double monthSalary) {
        super(name, id);
        this.monthSalary = monthSalary;
    }
}

class HourSalary extends Employee{
    double hoursWorked;
    double hourlyRate;

    HourSalary(String name, String id, double hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}