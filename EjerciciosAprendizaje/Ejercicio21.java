package EjerciciosAprendizaje;

import java.util.Random;

public class Ejercicio21 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int[][] miniMatriz = new int[3][3];
        Random random = new Random();

        int i;
        int j;
        for (i = 0; i < 10; ++i) {
            for (j = 0; j < 10; ++j) {
                matriz[i][j] = random.nextInt(99);
            }
        }

        for (i = 0; i <= 2; ++i) {
            for (j = 0; j <= 2; ++j) {
                miniMatriz[i][j] = matriz[i + 4][j + 4];
            }
        }

        mostrarMatriz(matriz);
        mostrarMatriz(miniMatriz);
        verificarMatrizContenida(matriz, miniMatriz);
    }

    public static void verificarMatrizContenida(int[][] matriz, int[][] miniMatriz) {
        boolean esContenida = false;

        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                if (matriz[i][j] == miniMatriz[0][0] && matriz[i][j + 1] == miniMatriz[0][1] && matriz[i][j + 2] == miniMatriz[0][2] && matriz[i + 1][j] == miniMatriz[1][0] && matriz[i + 1][j + 1] == miniMatriz[1][1] && matriz[i + 1][j + 2] == miniMatriz[1][2] && matriz[i + 2][j] == miniMatriz[2][0] && matriz[i + 2][j + 1] == miniMatriz[2][1] && matriz[i + 2][j + 2] == miniMatriz[2][2]) {
                    esContenida = true;
                    System.out.println("La mini matriz si esta contenida y esta en las siguientes posiciones: ");
                    System.out.println("" + i + "-" + j + "," + i + "-" + (j + 1) + "," + i + "-" + (j + 2));
                    System.out.println(i + 1 + "-" + j + "," + (i + 1) + "-" + (j + 1) + "," + (i + 1) + "-" + (j + 2));
                    System.out.println(i + 2 + "-" + j + "," + (i + 2) + "-" + (j + 1) + "," + (i + 2) + "-" + (j + 2));
                    return;
                }
            }
        }

        if (!esContenida) {
            System.out.println("La mini matriz no esta contenida en la matriz");
        }

    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < matriz.length; ++j) {
                if (matriz[i][j] > 9) {
                    System.out.print("[" + matriz[i][j] + "]");
                } else {
                    System.out.print("[ " + matriz[i][j] + "]");
                }
            }
            System.out.println("");
        }
    }
}
