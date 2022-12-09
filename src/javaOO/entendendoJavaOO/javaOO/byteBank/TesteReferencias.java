package javaOO.entendendoJavaOO.javaOO.byteBank;

public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;

        System.out.println("Saldo: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println(segundaConta);
        System.out.println(segundaConta.saldo);

    }
}
