package exec2;

public class DVD extends Item{
    private double duracao;

    public DVD(String nome, double preco, double duracao, String codigoBarras) {
        super(nome, preco, codigoBarras);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Duração: "+ this.duracao;
    }
}
