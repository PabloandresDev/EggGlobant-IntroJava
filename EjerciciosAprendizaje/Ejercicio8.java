package EjerciciosAprendizaje;

import java.util.Scanner;
//Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
//usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
//pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
//Nota: investigar la función Lenght() en Java.
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
