package javaOO.entendendoJavaOO.javaPolimorfismo.byteBankHerdado;

public class EditorVideo extends Funcionario{
    public double getBonificacao() {
        return super.getBonificacao() + 100;
    }
}
