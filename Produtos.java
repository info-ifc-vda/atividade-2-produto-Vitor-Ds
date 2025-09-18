public class Produtos {
    // Atributos da classe
    String nome;
    double valor;
    int quant;

    // Construtor
    public Produtos(String nome, double valor, int quant){
        this.nome = nome;
        this.valor = valor;
        this.quant = quant;
    }

    public double calcularValorTotal(){
        double total = this.valor*this.quant;
        return total;
    }

    public void alterarQuantidade(int qtd){
        this.quant += qtd;
    }

    public String escreverDados(){
        String dados = "Nome do produto: " + this.nome + 
                       "Valor: " + this.valor +
                       "quantidade em estoque: " + this.quant;
        return dados; 
    }

}
