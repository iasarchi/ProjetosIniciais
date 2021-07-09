package academy.devdojo.condicionais.ifelses;

public class CalculoPorcentagemSalario {
    public static void main(String[] args) {
        float salario = 4700.00F;
        float resultado = 0F;
            String porcentagem = "";
        if (salario > 4500.00){
            resultado = salario * 0.3F;
            porcentagem = "30%";
           }else {
            resultado = salario * 0.15F;
            porcentagem = "15%";
        }
        System.out.println(" O valor em porcentagem de "+porcentagem +" e de "+resultado);
    }
}
