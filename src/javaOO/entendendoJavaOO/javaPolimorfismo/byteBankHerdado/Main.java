package javaOO.entendendoJavaOO.javaPolimorfismo.byteBankHerdado;

public class Main {
    public static void main(String[] args) {

        Funcionario giovana = new Funcionario();
        giovana.setNome("Giovana Macedo");
        giovana.setCpf("123.456.789-00");
        giovana.setSalario(2700.00);

//      System.out.println(giovana.getNome());
//      System.out.println("Giovana receberá R$" + giovana.getBonificacao() + " de bonificação.");

        /*Gerente gerente1 = new Gerente();
        gerente1.setNome("Eduardo Lichigu");
        gerente1.setCpf("098.765.432-11");
        gerente1.setSalario(5300.00);
        gerente1.setSenha(123);*/

        Gerente gerente2 = new Gerente();
        gerente2.setNome("Rodrigo");
        gerente2.setSalario(5000.0);

        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setSalario(2000.0);

        Designer designer = new Designer();
        editorVideo.setSalario(3500.0);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registra(gerente2);
        controleBonificacao.registra(editorVideo);
        controleBonificacao.registra(designer);

        System.out.println(controleBonificacao.getSoma());


/*      System.out.println(gerente1.getNome());
        System.out.println(gerente1.getCpf());
        System.out.println(gerente1.getSalario());
        System.out.println(gerente1.getBonificacao());
        System.out.println(gerente1.autentica(123));*/
    }
}
