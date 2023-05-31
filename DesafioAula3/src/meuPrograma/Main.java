package meuPrograma;

import geometria.Retangulo;
        
public class Main {
    public static void main (String[] args) {
        Retangulo retangulo = new Retangulo(5.0,3.0);
        
        double area = retangulo.calculadorArea();
        double perimetro = retangulo.calculadorPerimetro();
        
        System.out.println("A área do retangulo é: " + area);
        System.out.println("O perimetro do retangulo é: " + perimetro);   
    }
}
