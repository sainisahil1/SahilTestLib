package io.sahil.sahillib;

public class SahilLib {

    public static int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public static double add(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }

    public static double divide(int dividend, int divisor) throws Exception {
        if (divisor == 0){
            throw new Exception("Cannot divide by zero!");
        } else {
            return dividend/divisor;
        }
    }

    public static double divide(double dividend, double divisor) throws Exception {
        if (divisor == 0f){
            throw new Exception("Cannot divide by zero!");
        } else {
            return dividend/divisor;
        }
    }

    public static double subtract(double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }

    public static int subtract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
    
    public static int multiply(int firstNumber, int secondNumber){
        return firstNumber*secondNumber;
    }

    public static double multiply(double firstNumber, double secondNmber){
        return firstNumber*secondNmber;
    }
    


}
