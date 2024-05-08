package Pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public String getCpf() {
        return cpf;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    void ImprimirDados(int indice){
        System.out.println("O Nome da Pessoa é: " + nome + ", a idade é: " + idade + " e o CPF é: " + cpf + "indice" + indice);
    }
}
