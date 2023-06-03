package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Digite la cantidad de euros ");
        Scanner scanner = new Scanner(System.in);
        float euro = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Digite la moneda a convertir los euros ");
        String moneda = scanner.nextLine().toLowerCase();
        convertirDivisa(euro, moneda);
    }

    public static void convertirDivisa(float euro, String monedaConvertir) {
        switch (monedaConvertir) {
            case "dolares":
                System.out.println("EL valor en dolares es $" + (double)euro * 1.28611);
                break;
            case "yenes":
                System.out.println("EL valor en yenes es " + (double)euro * 129.852);
                break;
            case "libras":
                System.out.println("EL valor en libras es " + (double)euro * 0.86);
                break;
            default:
                System.out.println("Ingresaste una moneda equivocada");
        }

    }
}
