package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio8 {
    public Ejercicio8() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite una frase o palabra maximo de 8 caracteres (los pescacion cuentas como caracter)");
        String frase = scanner.nextLine();
        if (frase.length() > 8) {
            System.out.println("Imcorrecto");
        } else {
            System.out.println("Correcto");
        }

    }
}
