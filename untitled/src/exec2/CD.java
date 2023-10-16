package exec2;

public class CD extends Item{
    private int numeroFaixas;

    public CD(String nome, double preco, int numeroFaixas, String codigoBarras) {
        super(nome, preco, codigoBarras);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Numero de Faixas: "+ this.numeroFaixas;
    }

    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }
}
