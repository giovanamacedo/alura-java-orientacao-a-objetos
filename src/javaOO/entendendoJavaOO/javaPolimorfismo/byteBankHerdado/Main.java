package javaOO.entendendoJavaOO.javaPolimorfismo.byteBankHerdado;

public class Main {
    public static void main(String[] args) {

        Funcionario giovana = new Funcionario();
        giovana.setNome("Giovana Macedo");
        giovana.setCpf("123.456.789-00");
        giovana.setSalario(2700.00);

//        System.out.println(giovana.getNome());
//        System.out.println("Giovana receberá R$" + giovana.getBonificacao() + " de bonificação.");

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Eduardo Lichigu");
        gerente1.setCpf("098.765.432-11");
        gerente1.setSalario(5300.00);
        gerente1.setSenha(123);

        System.out.println(gerente1.getNome());
        System.out.println(gerente1.getCpf());
        System.out.println(gerente1.getSalario());
        System.out.println(gerente1.getBonificacao());
        System.out.println(gerente1.autentica(123));
    }
}
