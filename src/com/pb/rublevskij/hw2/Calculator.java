package com.pb.rublevskij.hw2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        String sign;
        Scanner scan = new Scanner(System.in);
        System.out.println("First value");
        operand1 = scan.nextInt();
        System.out.println("Second value");
        operand2 = scan.nextInt();
        System.out.println("ENTER +, -, * или /");
        sign = scan.next();
        System.out.println("RESULT");
        switch (sign) {
            case "+":
                System.out.println(operand1+operand2);
                break;
            case "-":
                System.out.println(operand1-operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 != 0) {System.out.println(operand1 / operand2);}
                else { System.out.println("You cannot divide by 0!");}
                break;
            default:
                System.out.println("Invalid arithmetic sign of the operation (*/+-)");
        }
    }
}