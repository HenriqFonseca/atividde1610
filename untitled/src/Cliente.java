public class Cliente {
    private String nome;


    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "nome: " + this.getNome() ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
