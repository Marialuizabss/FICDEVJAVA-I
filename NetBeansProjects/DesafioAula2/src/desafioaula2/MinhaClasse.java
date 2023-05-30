/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioaula2;

/**
 *
 * @author ficdev
 */
public class MinhaClasse {
    private int valor1;
    private int valor2;
    
    public MinhaClasse (int v1, int v2) {
        this.valor1 = v1;
        this.valor2 = v2;
    }
    
    public int somar() {
        return this.valor1 + this.valor2;
    }
    
    public int subtrair () {
        return this.valor1 - this.valor2;
    }
    
}
