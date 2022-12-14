package javaOO.entendendoJavaOO.javaOO.byteBank;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta() {
        total++;
        System.out.println("Total de contas:" + total);
    }

    public Conta(double saldo, int agencia, int numero, Cliente titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        total++;
        System.out.println("Total de contas:" + total);
    }

    public void deposita (double valor){
        this.saldo += valor;
    }

    /*public void saca (double valor){
        if (valor > saldo){
            System.out.println("Não é possível sacar");
        }
        else {
            this.saldo -= valor;
            System.out.println(saldo);
        }
    }*/

    public boolean saca (double valor){
        if (valor <= saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere (double valor, Conta contaDestino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
