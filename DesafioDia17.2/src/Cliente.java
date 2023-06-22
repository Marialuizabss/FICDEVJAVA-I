import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private final List<Compra> compras;

    public Cliente() {
        compras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void adicionarCompra(Compra compra) {
        compras.add(compra);
    }
}
