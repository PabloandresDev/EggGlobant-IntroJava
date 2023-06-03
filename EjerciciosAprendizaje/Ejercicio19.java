package EjerciciosAprendizaje;

import java.util.Random;
//Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
//matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
//signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
public class Ejercicio19 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        int[][] matrizTraspuesta = new int[4][4];

        int i;
        int j;
        for(i = 0; i < matriz.length; ++i) {
            for(j = 0; j < matriz[i].length; ++j) {
                matriz[i][j] = random.nextInt(-10, 10);
                System.out.print("[" + matriz[i][j] + "]");
            }

            System.out.println("");
        }

        System.out.println("matrizTraspuesta Antisimetrica= ");

        for(i = 0; i < matrizTraspuesta.length; ++i) {
            for(j = 0; j < matrizTraspuesta[i].length; ++j) {
                matrizTraspuesta[i][j] = -1 * matriz[i][j];
                System.out.print("[" + matrizTraspuesta[i][j] + "]");
            }

            System.out.println("");
        }

        antiSimetrica(matriz, matrizTraspuesta);
    }

    public static void antiSimetrica(int[][] matriz, int[][] matrizTraspuesta) {
        boolean esSimetrica = true;

        for(int i = 0; i < matrizTraspuesta.length; ++i) {
            for(int j = 0; j < matrizTraspuesta[i].length; ++j) {
                if (matriz[i][j] != -1 * matrizTraspuesta[i][j]) {
                    esSimetrica = false;
                }
            }
        }

        System.out.println("La matriz es simetrica = " + esSimetrica);
    }
}
