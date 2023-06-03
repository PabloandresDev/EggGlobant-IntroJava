package EjerciciosAprendizaje;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("EL numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
