/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author ficdev
 */
public class Retangulo {
    private double base;
    private double altura;
    
    public Retangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double calculadorArea() {
        return base * altura;
    }
    
    public double calculadorPerimetro() {
        return 2 * (base + altura);
    }
    
}
