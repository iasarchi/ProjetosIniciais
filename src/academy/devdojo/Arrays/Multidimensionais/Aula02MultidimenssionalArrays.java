package academy.devdojo.Arrays.Multidimensionais;

import java.util.Scanner;

public class Aula02MultidimenssionalArrays {
    public static void main(String[] args) {
        int[][] arrayMulti2 = new int[2][3];
      //  arrayMulti2[0][0] = 22;
      //  arrayMulti2[0][1] = 11;
      //  arrayMulti2[0][2] = 54;
      //  arrayMulti2[1][0] = 44;
       // arrayMulti2[1][1] = 56;
       // arrayMulti2[1][2] = 76;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayMulti2.length; i++) {
            for (int j = 0; j < arrayMulti2[i].length; j++) {
                System.out.println("Digite o valor da posição [" + i + "] [" + j + "] = ");
                arrayMulti2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arrayMulti2.length; i++) {
            for (int j = 0; j < arrayMulti2[i].length; j++) {
                System.out.println("["+i+"] ["+j+"] = "+arrayMulti2[i] [j]);

            }

        }
    }
}
