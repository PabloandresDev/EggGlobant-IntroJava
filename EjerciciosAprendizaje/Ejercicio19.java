package EjerciciosAprendizaje;

import java.util.Random;

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
