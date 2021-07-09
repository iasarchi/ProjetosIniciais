package academy.devdojo.condicionais.ifelses;

public class ParticipantesTorneio {
    public static void main(String[] args) {
        String nome = "Daniel";
        int idade = 19;
        if (idade <= 10){
            System.out.println(nome + " participará da categoria infantil");
        }else if (idade >=11 && idade <= 15 ){
            System.out.println(nome + " participará da categoria juvenil");
        }else if (idade >= 16 && idade <= 19){
            System.out.println(nome + " participará da categoria pré adulto");
        }else {
            System.out.println(nome + " participará da categoria adulto");
        }
    }
}
