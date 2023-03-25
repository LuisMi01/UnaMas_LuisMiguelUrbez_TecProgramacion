package Ejercicio5;

import java.util.Scanner;

public class Euclides {
    Scanner teclado = new Scanner(System.in);
    int a, b, r;
    public void algoritmo1(){
        System.out.println("FORMA RECURSIVA");
        System.out.println("Ingrese el primer numero:");
        a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        b = teclado.nextInt();
        while(b != 0){
            r = a%b;
            a = b;
            b = r;
        }
        System.out.println("El minimo comun multiplo es: " + a);

    }
    public void algoritmo2(){
        System.out.println("FORMA ITERATIVA CON EXPRESIONES LAMBDA");
        System.out.println("Ingrese el primer numero:");
        a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        b = teclado.nextInt();

        while(b != 0){
            r = a%b;
            a = b;
            b = r;
        }
        System.out.println("El minimo comun multiplo es: " + a);
    }

}
