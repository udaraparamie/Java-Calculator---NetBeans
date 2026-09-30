package calculator;
import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner (System.in);
        
    System.out.println("======Calculator======");
    
    double num1, num2, sum, substraction, multiplication, devision;
    char operator;
    
    System.out.println("Enter number 1: ");
    num1 = input.nextDouble();
    
    System.out.println("Enter operator (+,-,*,/): ");
    operator = input.next().charAt(0);
    
    System.out.println("Enter number 2: ");
    num2 = input.nextDouble();
    
    switch(operator){
        case '+':
            sum = num1 + num2;
            System.out.println("Sum is: " + sum);
            break;
            
        case '-':
            substraction = num1 - num2;
            System.out.println("Substraction is: " + substraction);
            break;
            
        case '*':
            multiplication = num1 * num2;
            System.out.println("Multiplication is: " + multiplication);
            break;
            
        case '/':
            devision = num1/num2;
            System.out.println("Devision is: " + devision);
            break;
            
        default:
            System.out.println("Invalid operator!");
       
    }
    
    input.close();
    }
    
}
