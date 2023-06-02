public class TestaFuncionario {
    public static void main (String [] args) {
       Funcionário funcionário = new Funcionário ("João", "123.456.789-00", 3000.0);
       funcionário.exibirDetalhes();
       funcionário.aumentarSalario(10);
       funcionário.exibirDetalhes();    
   }
}
