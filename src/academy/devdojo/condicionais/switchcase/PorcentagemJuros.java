package academy.devdojo.condicionais.switchcase;

public class PorcentagemJuros {
    public static void main(String[] args) {
        String conta = "guardar";
        switch (conta) {
            case "poupanca":
                System.out.println("0.05%");
                break;
            case "corrente":
                System.out.println("0.02%");
                break;
            case "invesrtimento":
                System.out.println("0.1%");
                break;
            default:
                System.out.println("conta inexistente");
        }

    }
}
