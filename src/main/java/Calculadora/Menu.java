package Calculadora;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void menu() {


        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        String dato;//lo creo como String para facilitar la comparación
        DecimalFormat df = new DecimalFormat("#.##");//creo un formato para la salida de los numeros con 2 decimales

        System.out.println("Introduce los datos para realizar el calculo, para acabar pulsa '.'");
        do {
            dato = teclado.nextLine();
            try {
                if (!dato.equals(".")) {
                    numeros.add(Integer.parseInt(dato));//si es diferente de la tecla de salida, lo parseo a int y lo añado
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Introducido dato incorrecto");
            }
        } while (!dato.equals("."));

        System.out.println("----------");
        System.out.println("Esta es la media de los datos introducidos " + df.format(Calculadora.calcularMedia(numeros)));
        System.out.println("Este es el valor de la mediana de los datos introducidos " + df.format(Calculadora.calcularMediana(numeros)));
        System.out.println("Este es el valor de la varianza de los datos introducidos " + df.format(Calculadora.calculoVarianza(numeros)));
        System.out.println("Este es el valor de la desviacion de los datos introducidos " + df.format(Calculadora.calculoDesviacion(numeros)));


    }
}
