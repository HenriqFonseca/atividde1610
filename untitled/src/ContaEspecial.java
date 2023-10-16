public class ContaEspecial extends ContaCorrente{



    public ContaEspecial(double saldo, Cliente titular) {
        super(saldo, titular);
    }

    @Override
    public boolean sacar(double valor) {
        this.taxa = 0.001;
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
}
