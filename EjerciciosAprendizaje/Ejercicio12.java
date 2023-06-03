package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contIncorrecto = 0;
        int contCorrecto = 0;
        String fde = "&&&&&";

        String cad;
        do {
            System.out.println("Ingresar cadena");
            cad = scanner.nextLine();
            if (cad.length() <= 5) {
                if (cad.substring(0, 1).equals("X") & cad.substring(cad.length() - 1).equals("O")) {
                    ++contCorrecto;
                } else {
                    ++contIncorrecto;
                }
            } else {
                System.out.println("Ingresaste una cadena no valida");
            }
        } while(!cad.equals(fde));

        System.out.println(" Secuencia terminada ");
        System.out.println("contCorrecto = " + contCorrecto);
        System.out.println("contIncorrecto = " + (contIncorrecto - 1));
    }
}
