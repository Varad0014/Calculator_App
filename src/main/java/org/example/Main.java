package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        logger.info("Start");
        System.out.println("Calculator");
        Scanner sc = new Scanner(System.in);
        while(true) {
            int option = -1;
            System.out.println("Select Operation:");
            System.out.println("1. Enter 1 from Addition");
            System.out.println("2. Enter 2 from Subtraction");
            System.out.println("3. Enter 3 from Multiplication");
            System.out.println("4. Enter 4 from Division");
            System.out.println("5. Enter 5 to Exit");
            option = sc.nextInt();
            if(option == 5){
                System.exit(0);
            }
            System.out.print("Enter two operands: ");
            int operand1 = sc.nextInt();
            int operand2 = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println(operand1 + " + " + operand2 + " = " + add(operand1, operand2));
                    break;
                case 2:
                    System.out.println(operand1 + " - " + operand2 + " = " + sub(operand1, operand2));
                    break;
                case 3:
                    System.out.println(operand1 + " * " + operand2 + " = " + mul(operand1, operand2));
                    break;
                case 4:
                    System.out.println(operand1 + " / " + operand2 + " = " + div(operand1, operand2));
                    break;
                default:
                    logger.warn("Invalid operation!");
                    break;
            }
        }

    }
    public static int add(int a, int b){
        return(a+b);
    }
    public static int sub(int a, int b){
        return(a-b);
    }
    public static int mul(int a, int b){
        return(a*b);
    }
    public static int div(int a, int b){
        return(a/b);
    }

}