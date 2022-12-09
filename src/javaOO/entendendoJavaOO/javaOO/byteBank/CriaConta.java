package javaOO.entendendoJavaOO.javaOO.byteBank;

public class CriaConta {
    public static void main(String[] args) {
        /*Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;*/

        /*System.out.println("Primeira conta: " + primeiraConta.saldo);
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        System.out.println(primeiraConta.titular);*/
        /*System.out.println("Segunda conta: " + segundaConta.saldo);*/

        /*System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
        System.out.println("Segunda conta: " + segundaConta.saldo);
        System.out.println(primeiraConta.transfere(100, segundaConta));
        System.out.println("Segunda conta: " + segundaConta.saldo);
        System.out.println("Saldo primeira conta: " + primeiraConta.saldo);*/

        Cliente paulo = new Cliente("Paulo", "123.456.789-0", "Programador");
        Conta contaPaulo = new Conta();
        contaPaulo.titular = paulo;
        System.out.println(contaPaulo.titular.nome);

    }
}
