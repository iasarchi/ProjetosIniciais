package academy.devdojo.Arrays.Unidimensionais;

import java.util.Scanner;

public class Aula02ArraysComFor {
    public static void main(String[] args) {
        double [ ] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota" + (i+1));
            notas[i] = scanner.nextDouble();

        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota "+(i + 1) + ": " + notas[i]);
            
        }
    }
}
