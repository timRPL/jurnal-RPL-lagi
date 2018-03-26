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
        Scanner show = new Scanner(System.in);
        System.out.print("Masukan Jumlah Fibonacci : ");
        int n = show.nextInt();
        int a = 0 ;
        int b = 1 ;
        int jumlah=0 ;
         
        for(int i = 1; i <=n; i++) {
            System.out.print(b + " ");
            b=b+a ;
            a=b-a ;
            jumlah = b ;
        }
        jumlah = jumlah + b ;
        System.out.println(jumlah);
    }
    
}
