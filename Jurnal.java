/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan jumlah fibonacci: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("\n Jumlah fibonacci ke-" + number + " adalah  ==> " + (fibonacciLoop(number) + ""));
    }
    public static int fibonacciLoop(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        int fibo1 = 1, fibo2 = 1, fibonacci = 1, sum=2;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci; 
            sum = sum + fibonacci;
        }
        System.out.println("jumlah sum : " + sum);
        return fibonacci;
    }
}

// udah di edit
