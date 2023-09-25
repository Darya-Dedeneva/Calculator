package P5;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc =new Scanner (System.in); // указываем класс Scanner для считывания введенных данных
        System.out.println ("one number");
        int a = sc.nextInt();
        System.out.println("two number");
        int b = sc.nextInt();
        System.out.println("enter operation (+, -, *, /)"); //выбираем операцию из предложенных
        char operation =sc.next().charAt(0); // char указывает на целые числа
        if(operation == '+'){
            int result = a + b;
            System.out.println( a + "+"+ b + "=" + result); // результат вычисления


        } if(operation == '-'){   int result = a - b;
            System.out.println( a + "-"+ b + "=" + result);
        } if(operation == '*'){ int result = a * b;
            System.out.println( a + "*"+ b + "=" + result);
        } if(operation == '/'){ int result = a / b;
             System.out.println( a+ "/" +b+ "=" + result);
}   }   }
