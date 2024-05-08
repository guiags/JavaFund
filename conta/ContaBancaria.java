package conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria(){
        saldo = 0;
    }


    //Getters e Setters
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getNumero(){
        return this.numero;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
    public String getTitular(){
        return this.titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }



    void Depositar(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            System.out.println("Deposito de R$:" + valor + ". Saldo atual R$: " + saldo);
        }else{
            System.out.println("Valor de deposito invalido!");
        }
    }
    void Sacar(double valor){
        if(valor>0 && saldo >= valor){
            saldo = saldo - valor;
            System.out.println("Saque de R$:" + valor + ". Saldo atual R$: " + saldo);
        }else{
            System.out.println("Valor invalido ou conta sem recurso!");
        }
    }
}
