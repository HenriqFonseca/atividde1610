package exec2;

import java.util.Objects;

public class Item {
    protected String nome;
    protected double preco;
    protected String codigoBarras;

    public Item(String nome, double preco,String  codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    @Override
    public String toString() {
        return "\nnome: " + this.nome +
                "\npreco: " + this.preco;
    }

    public boolean equals(Item o) {
        if (this.codigoBarras.equals(o.getCodigoBarras())) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.preco, preco) == 0 && Objects.equals(nome, item.nome) && Objects.equals(codigoBarras, item.codigoBarras);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
}

