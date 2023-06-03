package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String eureka = "eureka";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite una frase");
        String frase = scanner.nextLine();
        if (frase.equals(eureka)) {
            System.out.println("Mensaje correcto");
        } else {
            System.out.println("Mensaje incorrecto");
        }

    }
}
