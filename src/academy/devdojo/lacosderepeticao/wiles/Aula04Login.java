package academy.devdojo.lacosderepeticao.wiles;

import java.util.Scanner;

public class Aula04Login {
    public static void main(String[] args) {
         String login = "Daniel";
         String password = "cudegrude";
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);
        while (exibirTelaLogin) {
            System.out.println("Digite seu login");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite sua senha");
            String passwordDigitado = scanner.nextLine();
            if (login.equals(loginDigitado) && password.equals(passwordDigitado)) {
                System.out.println("Acesso concedido");
                exibirTelaLogin = false;
                break;
              }
                  System.out.println("Acesso negado");

            }
        System.out.println("programa terminado");
        }
    }

