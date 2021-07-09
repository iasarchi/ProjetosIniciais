package academy.devdojo.variaveis;

public class CalculadorPorcentagem {
    public static void main(String[] args) {
        double salario = 5000.00;
        double resultado = salario * .3;
        System.out.println("30% e: "+resultado);
        resultado = salario * 0.15;
        System.out.println("15% e : "+resultado);
        resultado = salario * 0.05;
        System.out.println("5% e "+resultado);
    }
}
