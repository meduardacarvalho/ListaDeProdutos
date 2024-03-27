 import java.util.ArrayList;
import java.util.List;

class ListagemProdutos {
    private List<Produto> produtos;

    public ListagemProdutos() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
