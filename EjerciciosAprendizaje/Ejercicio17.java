package EjerciciosAprendizaje;

import java.util.Random;

public class Ejercicio17 {
    public static void main(String[] args) {
        contabilizarDigitos();
    }

    public static void contabilizarDigitos() {
        int[] numeros = new int[100];
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        Random random = new Random();

        for(int i = 0; i < numeros.length; ++i) {
            numeros[i] = random.nextInt(0, 99999);
            System.out.println("numeros [" + i + "] = " + numeros[i]);
            if (numeros[i] / 10 < 1) {
                ++cont1;
            } else if (numeros[i] / 100 < 1) {
                ++cont2;
            } else if (numeros[i] / 1000 < 1) {
                ++cont3;
            } else if (numeros[i] / 10000 < 1) {
                ++cont4;
            } else if (numeros[i] / 100000 < 1) {
                ++cont5;
            }
        }

        System.out.println("Cantidad de numeros con 1 digitos = " + cont1);
        System.out.println("Cantidad de numeros con 2 digitos = " + cont2);
        System.out.println("Cantidad de numeros con 3 digitos = " + cont3);
        System.out.println("Cantidad de numeros con 4 digitos = " + cont4);
        System.out.println("Cantidad de numeros con 5 digitos = " + cont5);
    }
}
