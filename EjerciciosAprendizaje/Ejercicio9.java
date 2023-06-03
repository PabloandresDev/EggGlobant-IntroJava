package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite una frase");
        String frase = scanner.nextLine().toLowerCase();
        String letra = "a";
        if (letra.equals(frase.substring(0, 1))) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

    }
}
