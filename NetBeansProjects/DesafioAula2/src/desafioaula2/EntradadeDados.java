/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioaula2;

/**
 *
 * @author ficdev
 */
import java.util.Scanner;

public class EntradadeDados {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String nome = input.next();
        
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        
        System.out.println("Seu nome é " + nome + " e sua idade é " + idade);
    }
}
