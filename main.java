import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListagemProdutos listaProdutos = new ListagemProdutos();
    
        Produto produto1 = new Produto("ESCOVA", "pequena, cor rosa", 20.0, true);
        Produto produto2 = new Produto("batom", "vermelho", 30.0, false);
        Produto produto3 = new Produto("creme leavin", "200 ml", 50.0, true);
        
        listaProdutos.adicionarProduto(produto1);
        listaProdutos.adicionarProduto(produto2);
        listaProdutos.adicionarProduto(produto3);
        listaProdutos.listarProdutos();
        String nome, descricao;
        double valor;
        boolean disponivelParaVenda;
        
        System.out.println("Deseja adicionar um novo produto? (sim ou não)"); 
        if (sc.nextLine().equalsIgnoreCase("sim")) {
            System.out.print("Nome do produto: ");
            nome = sc.nextLine();
            System.out.print("Descrição do produto: ");
            descricao = sc.nextLine();
            System.out.print("Valor do produto: ");
            valor = sc.nextDouble();
            sc.nextLine(); 
            System.out.print("Disponível para venda (sim/não): ");
            disponivelParaVenda = sc.nextLine().equalsIgnoreCase("sim");
               
            Produto novoProduto = new Produto(nome, descricao, valor, disponivelParaVenda);
            listaProdutos.adicionarProduto(novoProduto);
            
            
            System.out.println("Lista de Produtos Atualizada:");
            listaProdutos.listarProdutos();
        } else {
            System.out.println("Programa encerrado");
        }
        
        sc.close();
    }
}
