//Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
//Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
//Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string


import java.util.Scanner;

public class Problem1 {

    double addition(double first, double second){
        return first+second;
    }

    double subtraction(double first, double second){
        return first-second;
    }

    double multiplication(double first, double second){
        return first*second;
    }

    double division(double first, double second){
        if(second == 0){
            System.out.println("Divisor should not be zero");
        }
        return first/second;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the operation to perform (+,-,*,/): ");
        String operator = sc.next();

        Problem1 prb = new Problem1();

        if(operator.equals("+")){
            System.out.println(prb.addition(a,b));
        }
        else if(operator.equals("-")){
            System.out.println(prb.subtraction(a,b));
        }
        else if(operator.equals("*")){
            System.out.println(prb.multiplication(a,b));
        }
        else if(operator.equals("/")){
            System.out.println(prb.division(a,b));
        }
        else{
            System.out.println("Incorrect input");
        }
    }

}
