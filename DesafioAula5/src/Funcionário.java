public class Funcionário {
   private String nome;
   private String CPF;
   private double salario;
   
   public Funcionário (String nome, String CPF, double salario) {
       this.nome = nome;
       this.CPF = CPF;
       this.salario = salario;
   } 
   
   public String getNome() {
       return nome;
   }
    public void setNome (String nome) {
       this.nome = nome;
   }
   public String getCPF() {
       return CPF;
   }
    public void setCPF (String CPF) {
       this.CPF = CPF;
   }
   public double getSalario() {
       return salario;
   }
    public void setSalario (String Salario) {
        this.salario = salario;
   }
   
   public void aumentarSalario (double percentual) {
       salario += salario * percentual / 100;
   }
   
   public void exibirDetalhes() {
       System.out.println("Nome: " + nome);
       System.out.println("CPF: " + CPF);
       System.out.println("salario: " + salario);
   }
   

}
