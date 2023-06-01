/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioaula4;

import javax.swing.JOptionPane;

public class AlunosENotas {
    public static void main (String [] args) {
        String [][] alunos = new String[50][3];
        int qtdAlunos = 0;
        while(true) {
            String nome = JOptionPane.showInputDialog(null, " Digite o nome do aluno: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite a idade do aluno: "));
            double nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota do aluno"));
            alunos [qtdAlunos][0] = nome;
            alunos [qtdAlunos][1] = Integer.toString(idade);
            alunos [qtdAlunos][2] = Double.toString(nota);
            qtdAlunos++;
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro aluno? ");
            if (opcao != JOptionPane.YES_OPTION) {
                break;
            }
        }
        
        String listaAluno = "Lista de Alunos \n";
        double totalNotas = 0.0;
        for (int i = 0; i < qtdAlunos; i++) {
            listaAluno += alunos [i][0] + "\n";
            totalNotas += Double.parseDouble(alunos[i][2]);
        }
        double mediaNotas = totalNotas / qtdAlunos;
        listaAluno += "\nMédia das notas: " + mediaNotas;
        JOptionPane.showMessageDialog(null, listaAluno);
    }
    
}
