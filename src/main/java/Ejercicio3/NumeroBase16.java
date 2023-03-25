package Ejercicio3;

import java.util.Scanner;

public class NumeroBase16 {
    Scanner teclado = new Scanner(System.in);
    public void calculo() {
        System.out.println("Ingrese un numero entero para calcularlo en base 16");
        int numero = teclado.nextInt();
        int resto;
        String resultado = "";

        int[] arrayResto = {0,1, 2, 3, 4, 5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 ,13 ,14 ,15};
        String[] arrayDigito = {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

        while (numero > 0) {
            resto = numero % 16;
            for (int i = 0; i < arrayResto.length; i++) {
                if (resto == arrayResto[i]) {
                    resultado = arrayDigito[i] + resultado;
                }
            }
            numero = numero / 16;
            }
        System.out.println("El resultado es: " + resultado);
    }
}
