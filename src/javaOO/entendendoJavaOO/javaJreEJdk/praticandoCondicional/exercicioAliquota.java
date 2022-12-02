package javaOO.entendendoJavaOO.javaJreEJdk.praticandoCondicional;

public class exercicioAliquota {
    public static void main(String[] args) {
        double salario = 3300.0;

        if (salario >= 1900.0 && salario <= 2800.0){
            System.out.println("IR de 7.5% e você pode deduzir R$142");
        }
        else if (salario >= 2800.01 && salario <= 3751.0){
            System.out.println("IR de 15% e você pode deduzir R$350");
        }
        else if (salario >= 3751.01 && salario <= 4664.0){
            System.out.println("IR de 22.5% e você pode deduzir R$636");
        }
    }
}
