package Ejercicio2;

import java.util.Scanner;

public class NumeroBase16 {
    Scanner teclado = new Scanner(System.in);
    public void calculo() {
        System.out.println("Ingrese un numero entero para calcularlo en base 16");
        int numero = teclado.nextInt();
        int resto;
        String resultado = "";

        while (numero > 0) {
            resto = numero % 16;
            numero = numero / 16;

            if (resto == 10) {
                resultado = "A" + resultado;
            } else if (resto == 11) {
                resultado = "B" + resultado;
            } else if (resto == 12) {
                resultado = "C" + resultado;
            } else if (resto == 13) {
                resultado = "D" + resultado;
            } else if (resto == 14) {
                resultado = "E" + resultado;
            } else if (resto == 15) {
                resultado = "F" + resultado;
            }
            else {
                resultado = resto + resultado;
                System.out.println("Su numero en bse 16 es " + resultado);
            }
        }
    }
}
