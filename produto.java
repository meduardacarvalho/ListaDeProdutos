class Produto {
    private String nome;
    private String descricao;
    private double valor;
    private boolean disponivelParaVenda;

    public Produto(String nome, String descricao, double valor, boolean disponivelParaVenda) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.disponivelParaVenda = disponivelParaVenda;
    }

    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isDisponivelParaVenda() {
        if (disponivelParaVenda) {
            return true;
        } else {
            return false;
        }
    }
    

    public void setDisponivelParaVenda(boolean disponivelParaVenda) {
        this.disponivelParaVenda = disponivelParaVenda;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Valor: " + valor;
    }
}
