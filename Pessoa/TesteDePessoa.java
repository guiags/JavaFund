package Pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("02018316605");
        pessoa.setIdade(24);
        pessoa.setNome("Guilherme Augusto Guerra Santos");


        Professor professor = new Professor();
        professor.setCpf("02018316605");
        professor.setIdade(24);
        professor.setNome("Ana Paula Ferreira");
        professor.setSalario(5000);
        professor.ImprimirDados(2);
    }
    
}