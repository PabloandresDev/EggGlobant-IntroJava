package EjerciciosAprendizaje;

import java.util.Scanner;
//Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//pantalla el siguiente menú:
//
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:
//
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
//y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
//Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
//directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
//desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
//programa, caso contrario se vuelve a mostrar el menú.
public class Ejercicio11 {
    public static void main(String[] args) {
        boolean menuActivo = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("Digite el numero 2");
        int numero2 = scanner.nextInt();

        while(menuActivo) {
            System.out.println("2 Restar");
            System.out.println("1 Sumar");
            System.out.println("3 Multiplicar");
            System.out.println("4 Dividir");
            System.out.println("5 Salir");
            System.out.println("Digite una opcion a realizar con los numeros ingresados anteriormente");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("La suma de los numeros es " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros es " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es " + numero1 * numero2);
                    break;
                case 4:
                    System.out.println("La division de los numeros es " + numero1 / numero2);
                    break;
                case 5:
                    System.out.println("Seguro desea salir de la aplicacion Y/N ");
                    scanner.nextLine();
                    String yn = scanner.nextLine();
                    if (yn.equals("y")) {
                        System.out.println("Gracias por utilizar el programa");
                        menuActivo = false;
                    } else {
                        System.out.println("Continue utilizando el programa");
                    }
                    break;
                default:
                    System.out.println("Valor ingresado no es valido");
            }
        }

    }
}
