package com.company;

public class Main {

    public static void main(String[] args) {
        double number1 = 100;
        double number2 = 13;
        double percent = 10;
        Calculator Calculator = new Calculator();
        System.out.println("Калькулятор. Результат выполнения операций числа " + number1 +" к числу " + number2);
        System.out.println("'-' = " +Calculator.Subtraction (number1, number2));
        System.out.println("'+' = " +Calculator.adition(number1, number2));
        System.out.println("'*' = " +Calculator.multiplicatior (number1, number2));
        System.out.println("'/' = " +String.format("%.2f",Calculator.division(number1, number2)));
        System.out.println(percent + " % от " + number1 +" = " +Calculator.CetPercentFromnumber(number1, percent));



    }
}
