package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero positivo");
        int limitePositivo = scanner.nextInt();

        int suma;
        do {
            suma=0;
            System.out.println("Digite el primer numero");
            int primerNumero = scanner.nextInt();
            System.out.println("Digite el segundo numero");
            int segundoNumero = scanner.nextInt();
            suma = primerNumero + segundoNumero;
        } while(limitePositivo > suma);

    }
}
