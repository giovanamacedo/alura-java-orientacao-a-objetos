package javaOO.entendendoJavaOO.javaPolimorfismo.byteBankHerdado;

public class Gerente extends Funcionario{
    private int senha;

    public boolean autentica(int senha){
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    //O método calcula 10% do salário do funcionário
    public double getBonificacao() {
        return super.getBonificacao() + super.salario;
    }

}
