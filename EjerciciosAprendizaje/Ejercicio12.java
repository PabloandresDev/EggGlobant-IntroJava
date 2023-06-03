package EjerciciosAprendizaje;

import java.util.Scanner;
//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().
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
