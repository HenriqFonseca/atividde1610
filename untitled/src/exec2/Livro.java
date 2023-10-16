package exec2;

public class Livro extends Item{
    private String autor;

    public Livro(String nome, double preco, String autor, String codigoBarras) {
        super(nome, preco, codigoBarras);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + "\n autor: "+ this.autor;
    }
}


