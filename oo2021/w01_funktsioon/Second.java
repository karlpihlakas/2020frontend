package Saga;

public class Second {
    public static void main(String[] args) {
        System.out.println(myName());
        System.out.println(add(4, 2));
        System.out.println(fullName("Tarmo", "Pihlap"));
        myMath(args);
        
    }
    public static String myName() {
        return "Saga";
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }
    public static String fullName(String firstName, String surName){
        return firstName + " " + surName + "!";
    }

    public static void myMath(String[] args) {
        System.out.println(Math.pow(5, 2));
    }

    public static void myLogic() {
        if()
        System.out.println(5 < 10 && 5 > 4);
        System.out.println(6 < 10 || 3 == 3);
        
        
    }
}
