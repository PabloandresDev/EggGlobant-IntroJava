package EjerciciosAprendizaje;

import java.util.Scanner;
//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido
public class Ejercicio16 {

    public static void main(String[] args) {
        double[] vector = new double[100];
        System.out.println("Digite un numero del 1 al 100 a buscar dentro del vector");
        Scanner scanner = new Scanner(System.in);
        int numeroBuscar = scanner.nextInt();

        for (int i = 0; i < 100; ++i) {
            vector[i] = (double) Math.round(Math.random() * 100.0 + 1.0);
            if ((double) numeroBuscar == vector[i]) {
                System.out.println("se encuentra en la posicion = " + i);
            }
        }

    }
}
