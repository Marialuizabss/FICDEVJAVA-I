/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioaula4;

/**
 *
 * @author ficdev
 */
import java.util.Scanner;

public class Tentativa2NúmeroPrimo {
    public static void main (String [] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            boolean ehPrimo = true;
            if (num < 2) {
                ehPrimo = false;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }
            if (ehPrimo) {
                System.out.println(num + " é primo. ");
            } else {
                System.out.println(num + " não é primo. ");
            }
        }
    }
        
}
