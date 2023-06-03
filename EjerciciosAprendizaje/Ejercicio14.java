package EjerciciosAprendizaje;

import java.util.Scanner;
//Crea una aplicación que a través de una función nos convierta una cantidad de euros
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
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
