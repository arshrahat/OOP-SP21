
package calculator;

import java.util.Scanner;


public class Calculator_Runner {
    public static void main(String[] args) {
    

        Calculator cal = new Calculator(41, 7);
        Scanner object = new Scanner(System.in);
        System.out.println("Triple A Calculator");
        System.out.println("Enter 0 for sum");
        System.out.println("Enter 1 for multiplication");
        System.out.println("Enter 2 for division");
        System.out.println("Enter 3 for modulus");
        System.out.println("Enter 4 for sin");
        System.out.println("Enter 5 for cos");
        System.out.println("Enter 6 for tan");
        int num = object.nextInt();
        
        if (num==0){
              Calculator.sum();
        }
            
        else if (num==1){
            Calculator.multiply();
        }
        else if (num==2){
            Calculator.divide();
        }
        
        else if (num==3){
            Calculator.modulus();
        }
        else if (num==4){
            Calculator.sine();
        }
        else if (num==5){
            Calculator.cosine();
        }
        else
            Calculator.tangent();
            
               

        }
    }














  
