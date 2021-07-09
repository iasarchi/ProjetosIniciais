package academy.devdojo.condicionais.ifelses;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        char sexo = 'M';
        int idade = 19;
        if (sexo == 'M' && idade >= 18) {
            System.out.println(" alistamento obrigatório");
        }else if (sexo == 'M' && idade < 18) {
            System.out.println(" alistamento não permitido");
        }else if (sexo == 'F' && idade >= 18) {
            System.out.println("você deseja se alistar?");
        }else {
            System.out.println("alistamento não permitido");
        }

    }
}
