public class Produto {
    private int codigo;
    private String nome;
    private int quantidadeEmEstoque;
    private double preçoUni;

    public void calculo_preçoUni(double preçoUni){
        preçoUni = (quantidadeEmEstoque * preçoUni);
    }

    public Produto(int codigo, String nome, int quantidadeEmEstoque){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double getPreçoUni() {
        return preçoUni;
    }

    public void setPreçoUni(double preçoUni) {
        this.preçoUni = preçoUni;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
