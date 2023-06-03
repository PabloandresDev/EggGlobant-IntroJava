package EjerciciosAprendizaje;

import java.util.Scanner;
//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
//la función equals() en Java.
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
