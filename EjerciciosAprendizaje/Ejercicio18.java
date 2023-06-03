package EjerciciosAprendizaje;

import java.util.Random;
//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
//cambiando sus filas por columnas (o viceversa).
public class Ejercicio18 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        int[][] matrizTraspuesta = new int[4][4];

        int i;
        int j;
        for(i = 0; i < matriz.length; ++i) {
            for(j = 0; j < matriz[i].length; ++j) {
                matriz[i][j] = random.nextInt(10);
                System.out.print("[" + matriz[i][j] + "]");
            }

            System.out.println("");
        }

        System.out.println("matrizTraspuesta = ");

        for(i = 0; i < matrizTraspuesta.length; ++i) {
            for(j = 0; j < matrizTraspuesta[i].length; ++j) {
                matrizTraspuesta[i][j] = matriz[j][i];
                System.out.print("[" + matrizTraspuesta[i][j] + "]");
            }

            System.out.println("");
        }

    }
}
