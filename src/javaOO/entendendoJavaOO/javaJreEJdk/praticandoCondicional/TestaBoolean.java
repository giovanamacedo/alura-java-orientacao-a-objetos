package javaOO.entendendoJavaOO.javaJreEJdk.praticandoCondicional;

public class TestaBoolean {
    public static void main(String[] args) {
        System.out.println("Testando condicionais!");

        int idade = 10;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        if (idade >= 18 || acompanhado == true) {
            System.out.println("Você pode entrar :)");
            System.out.println(acompanhado);
        }
        /*if (idade < 18 && quantidadePessoas >= 2) {
            System.out.println("Você pode entrar :)");
        }*/
        else {
            System.out.println("Você não pode entrar :(");
        }
    }
}
