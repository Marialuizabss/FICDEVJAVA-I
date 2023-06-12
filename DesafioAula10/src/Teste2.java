import java.sql.*;

public class Teste2 {
    public static void main(String[] args) {
        try {
        Class.forName("org.postgresql.Driver"); // registra o driver
        Connection conn = DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/clientes", "postgres", "123456"); // abre conexão
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM funcionarios"); // executa comando SQL
        while (rs.next()) { //manipula resultado
            int matricula = rs.getInt("matricula");
            String nome = rs.getString("nome");
            System.out.println(matricula + ", " + nome );
            }
        conn.close(); // fecha conexão
        } catch (Exception e) {
        System.err.println("Erro: " + e.getMessage());
        } 
    } 
}