package EjerciciosAprendizaje;

import java.util.Random;
//Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
//3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
//dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
//se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
//que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
//la matriz M en la cual empieza el primer elemento de la submatriz P.
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
        //verificar haciendo modificaciones
        //miniMatriz[1][1]=77;
        mostrarMatriz(matriz);
        mostrarMatriz(miniMatriz);
        verificarMatrizContenida(matriz, miniMatriz);
    }

    public static void verificarMatrizContenida(int[][] matriz, int[][] miniMatriz) {
        boolean esContenida = false;

         for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                if (matriz[i][j] == miniMatriz[0][0] && matriz[i][j + 1] == miniMatriz[0][1] && matriz[i][j + 2] == miniMatriz[0][2]) {
                    if (matriz[i + 1][j] == miniMatriz[1][0] && matriz[i + 1][j + 1] == miniMatriz[1][1] && matriz[i + 1][j + 2] == miniMatriz[1][2]) {
                        if (matriz[i + 2][j] == miniMatriz[2][0] && matriz[i + 2][j + 1] == miniMatriz[2][1] && matriz[i + 2][j + 2] == miniMatriz[2][2]) {
                            esContenida = true;
                            System.out.println("La mini matriz si esta contenida y esta en las siguientes posiciones: ");
                            System.out.println("" + i + "-" + j + "," + i + "-" + (j + 1) + "," + i + "-" + (j + 2));
                            System.out.println(i + 1 + "-" + j + "," + (i + 1) + "-" + (j + 1) + "," + (i + 1) + "-" + (j + 2));
                            System.out.println(i + 2 + "-" + j + "," + (i + 2) + "-" + (j + 1) + "," + (i + 2) + "-" + (j + 2));
                            return;
                        }
                    }
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
