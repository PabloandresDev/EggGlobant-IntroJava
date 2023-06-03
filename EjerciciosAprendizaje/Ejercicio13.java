package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la dimension del cuadrado a imprimir por pantalla");
        int tama = scanner.nextInt();

        for(int i = 0; i < tama; ++i) {
            for(int j = 0; j < tama; ++j) {
                if (i != 0 && i != tama - 1 && j != 0 && j != tama - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println("");
        }

    }
}
