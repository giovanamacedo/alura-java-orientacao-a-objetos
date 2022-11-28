//nessa aula foi abordado conceitos de casting e tamanhos de variaveis numericas

package javaOO.entendendoJavaOO.javaJreEJdk.tiposEVariaveis;

public class TestaConversao {
    public static void main(String[] args) {
        double salario = 1270.50;
        //int valor = salario; dessa forma não roda

        int valor = (int) salario;
        //casting de double para int

        //para números muito grandes usamos o long
        //long numeroGrande = 2151515151561l;
        //byte < short < int < float < double < long

        System.out.println(salario);
        System.out.println(valor);
    }
}
