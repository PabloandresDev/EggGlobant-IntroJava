package EjerciciosAprendizaje;

import java.util.Scanner;
//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//El programa deberá comprobar que los números introducidos son correctos, es decir,
//están entre el 1 y el 9.
public class Ejercicio20 {
    public static void main(String[] args) {
        new Scanner(System.in);
        int[][] matriz = new int[][]{{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        mostrarMatriz(matriz);
        if (matriz.length == matriz[0].length) {
            matrizMagica(matriz);
        } else {
            System.out.println("La matriz no es cuadrada");
        }

    }

    public static void matrizMagica(int[][] matriz) {
        int valorMagico = matriz[0][0] + matriz[1][1] + matriz[2][2];
        boolean esMagico = true;
        int sumaDiagnal1 = 0;
        int sumaDiagonal2 = 0;
        int sumaFilas = 0;
        int sumaColumnas = 0;

        for (int i = 0; i < matriz.length; ++i) {
            if (esMagico) {
                sumaFilas = 0;
                sumaColumnas = 0;

                for (int j = 0; j < matriz[i].length; ++j) {
                    sumaFilas += matriz[i][j];
                    sumaColumnas += matriz[j][i];
                    if (i == j) {
                        sumaDiagnal1 += matriz[i][j];
                    }

                    if (j == 2 - i) {
                        sumaDiagonal2 += matriz[i][j];
                    }
                }

                if (sumaColumnas != valorMagico || sumaFilas != valorMagico) {
                    esMagico = false;
                }
            }
        }

        if (sumaDiagnal1 != valorMagico || sumaDiagonal2 != valorMagico) {
            esMagico = false;
        }

        if (esMagico) {
            System.out.println("sumaDiagnal1 = " + sumaDiagnal1);
            System.out.println("sumaDiagonal2 = " + sumaDiagonal2);
            System.out.println("sumaFilas = " + sumaFilas);
            System.out.println("sumaColumnas = " + sumaColumnas);
            System.out.println("La matriz es Magica");
        } else {
            System.out.println("La matriz no es magica");
        }

    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < matriz[i].length; ++j) {
                System.out.print("[" + matriz[i][j] + "]");
            }

            System.out.println("");
        }

    }
}
