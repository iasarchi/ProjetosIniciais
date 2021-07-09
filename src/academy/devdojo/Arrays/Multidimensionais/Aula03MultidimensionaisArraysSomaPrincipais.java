package academy.devdojo.Arrays.Multidimensionais;

public class Aula03MultidimensionaisArraysSomaPrincipais {
    public static void main(String[] args) {
        int[][] arrayMulti3 = new int [3][3];
        arrayMulti3[0][0] = 22;
        arrayMulti3[0][1] = 11;
        arrayMulti3[0][2] = 4;
        arrayMulti3[1][0] = 44;
        arrayMulti3[1][1] = 55;
        arrayMulti3[1][2] = 9;
        arrayMulti3[2][0] = 2;
        arrayMulti3[2][1] = 5;
        arrayMulti3[2][2] = 21;
        int resultadoMultiplicacaoDiagonalPrincipal = 1;
        for (int i = 0; i < arrayMulti3.length; i++) {
            for (int j = 0; j < arrayMulti3[i].length ; j++) {
                if (i==j)
                    resultadoMultiplicacaoDiagonalPrincipal = resultadoMultiplicacaoDiagonalPrincipal * arrayMulti3[i][j];
            }

        }
        System.out.println(resultadoMultiplicacaoDiagonalPrincipal);
    }
}
