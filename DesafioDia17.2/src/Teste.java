public class Teste {
    public static void main(String[] args) {
        // Criando instâncias de Cliente
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Cliente 1");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Cliente 2");

        // Criando instâncias de Produto
        Produto produto1 = new Produto();
        produto1.setNome("Produto 1");

        Produto produto2 = new Produto();
        produto2.setNome("Produto 2");

        // Criando instância de Categoria
        Categoria categoria = new Categoria();
        categoria.setNome("Categoria 1");

        // Estabelecendo relacionamento entre Cliente e Compra
        Compra compra1 = new Compra();
        compra1.setCliente(cliente1);
        compra1.setProduto(produto1);

        Compra compra2 = new Compra();
        compra2.setCliente(cliente1);
        compra2.setProduto(produto2);

        Compra compra3 = new Compra();
        compra3.setCliente(cliente2);
        compra3.setProduto(produto1);

        cliente1.adicionarCompra(compra1);
        cliente1.adicionarCompra(compra2);
        cliente2.adicionarCompra(compra3);

        // Estabelecendo relacionamento entre Produto e Categoria
        produto1.setCategoria(categoria);
        produto2.setCategoria(categoria);

        // Imprimindo informações
        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("Compras:");
        for (Compra compra : cliente1.getCompras()) {
            System.out.println("- Produto: " + compra.getProduto().getNome());
        }

        System.out.println("\nCliente: " + cliente2.getNome());
        System.out.println("Compras:");
        for (Compra compra : cliente2.getCompras()) {
            System.out.println("- Produto: " + compra.getProduto().getNome());
        }

        System.out.println("\nProduto: " + produto1.getNome());
        System.out.println("Categoria: " + produto1.getCategoria().getNome());

        System.out.println("\nProduto: " + produto2.getNome());
        System.out.println("Categoria: " + produto2.getCategoria().getNome());
    }
}
