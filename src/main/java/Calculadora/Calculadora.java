package Calculadora;

import java.util.ArrayList;
import java.util.Collections;


public class Calculadora {


    public static double calcularMedia(ArrayList<Integer> numeros) {
        double media = 0;

        for (Integer n : numeros)
          media += n;

        return media / numeros.size();

    }

    public static double calcularMediana(ArrayList<Integer> numeros) {
        double mediana = 0;
        Collections.sort(numeros);//ordena el arrayList introducido para realizar el calculo de la mediana
        int mitad = numeros.size()/2;

        if (numeros.size()%2 == 0) {
            // calculo de la mediana si es par a mi manera
            // el valor de la mitad a entero le resto 1 dado que las posiciones empiezan en 0

            return (double) ((numeros.get(mitad - 1)+numeros.get(mitad))/2);

            } else {
                //calculo de la mediana si es impar a mi manera
                //para calcular el valor central, le resto al tamaño total el valor de la mitad + 1
                return numeros.get(numeros.size()-(mitad + 1));

            }

    }

    public static double calculoVarianza(ArrayList<Integer> numeros) {
        double media = 0, diferencia = 0, sumaDiferencias = 0;

        media = calcularMedia(numeros);

        //calcular las diferencias a la media, al cuadrado
        for (Integer n : numeros) {
            diferencia = n - media;
            sumaDiferencias += Math.pow(diferencia,2);

        }

        //calculo de la varianza
        return sumaDiferencias/ numeros.size();


    }

    public static double calculoDesviacion(ArrayList<Integer> numeros) {

      return Math.sqrt(calculoVarianza(numeros));
    }


}



