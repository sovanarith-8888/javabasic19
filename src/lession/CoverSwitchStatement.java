package lession;

public class CoverSwitchStatement {
    public static void main(String[] args) {
        switch ("sunday"){
            case "sunday":
                System.out.println("Today is sunday");
                break;
            case "monday":
                System.out.println("Today is monday");
                break;
            default:
                System.out.println("I don't know today is");
        }
    }
}
