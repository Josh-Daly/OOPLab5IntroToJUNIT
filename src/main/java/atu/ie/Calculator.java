package atu.ie;

public class Calculator {
    public int add(int firstNum, int secondNum){
        if(firstNum >= Integer.MAX_VALUE || secondNum >= Integer.MAX_VALUE){
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MAX_VALUE");
        }
        return firstNum + secondNum;
    }

}
