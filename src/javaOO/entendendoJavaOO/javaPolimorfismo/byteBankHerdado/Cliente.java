package javaOO.entendendoJavaOO.javaPolimorfismo.byteBankHerdado;

public class Cliente {
    String nome;
    String cpf;
    String profissao;

    public Cliente() {
    }

    //Aqui criei um construtor para facilitar a atribuição de valores
    public Cliente(String nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }
}
