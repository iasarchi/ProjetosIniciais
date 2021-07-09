package academy.devdojo.lacosderepeticao.Fors;

public class Aula03ExercicioForAnihado {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Fazendo tabuada do mumero :"+i);
            for (int j = 1; j <= 10 ; j++) {
                System.out.println(i + "x" + j + " = "+i*j);
            }
        }
    }
}
