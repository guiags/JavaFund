package conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumero("40043");
        conta.setSaldo(1000);
        conta.setTitular("Ana");

        conta.Depositar(270);
        conta.Sacar(500);
    }
    
}