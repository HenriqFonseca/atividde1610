public class ContaCorrente {
    protected double saldo;
    protected Cliente titular;
    protected double taxa;


    public ContaCorrente(double saldo, Cliente titular) {
        this.saldo = saldo;
        this.titular = titular;

    }


    public boolean sacar(double valor){
        this.taxa = 0.005;
        double valorTaxa = (valor * taxa) / 100;
        if(valor>this.saldo){
            System.out.println("Saldo insuficiente");
            return false;
        }else{
            setSaldo(this.saldo - valor);
            System.out.println("Valor da taxa: "+ valorTaxa);
            return true;
        }
    }

    @Override
    public String toString() {
        return "saldo: "+ this.getSaldo()
                + "titular: " + this.titular.getNome();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
