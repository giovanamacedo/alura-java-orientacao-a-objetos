package javaOO.entendendoJavaOO.javaOO.byteBank;

public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

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
}
