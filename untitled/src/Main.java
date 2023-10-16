public class Main {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente(500, new Cliente("BomDia"));
        ContaEspecial conta2 = new ContaEspecial(500, new Cliente("BomDia"));
        conta2.sacar(400);
        System.out.println(conta2.getSaldo());
    }
}
