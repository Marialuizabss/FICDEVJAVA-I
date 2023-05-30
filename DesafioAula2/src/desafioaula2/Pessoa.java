/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioaula2;

/**
 *
 * @author ficdev
 */
public class Pessoa {
    private string nome;
    private int idade;
    
    public Pessoa (string nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public string getNome () {
        return nome;
    }
    
    public void setNome (string nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
