package academy.devdojo.condicionais.switchcase;

import java.util.Scanner;

public class AulaMaratonaJavaSwitch {
    public static void main(String[] args) {
        int dias = 3;
        switch (dias) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Dia inválido");

        }
    }
}
