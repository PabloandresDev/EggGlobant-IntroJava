package EjerciciosAprendizaje;

import java.util.Random;

public class Ejercicio15 {

    public static void main(String[] args) {
        int[] vector = new int[100];
        Random random = new Random();

        for(int i = 0; i < 100; ++i) {
            vector[i] = random.nextInt(99);
            System.out.println("vector = " + vector[i]);
        }

    }
}
