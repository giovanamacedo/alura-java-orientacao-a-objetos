package javaOO.entendendoJavaOO.javaJreEJdk.praticandoCondicional;

public class TestaCondicional {
    public static void main(String[] args) {
    System.out.println("Testando condicionais!");

    int idade = 10;
    int quantidadePessoas = 3;

        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos :)");
        } else if (quantidadePessoas >= 2){
            System.out.println("Você é menor de idade, mas pode entrar acompanhado.");
        }
        else {
            System.out.println("Você é menor de idade :(");
        }
    }
}
