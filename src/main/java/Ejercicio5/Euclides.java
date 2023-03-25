package Ejercicio5;

import java.util.Scanner;

public class Euclides {
    Scanner teclado = new Scanner(System.in);
    int m, n, r;
    public void algoritmo1(){
        System.out.println("FORMA RECURSIVA");
        System.out.println("Ingrese el primer numero:");
        m = teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        n = teclado.nextInt();
        r = m%n;

        if(r == 0){
            System.out.println("El MCD es: " + n);
        }else{
            m = n;
            n = r;
            algoritmo1();
        }

    }

    public void algoritmo2(){
        System.out.println("FORMA ITERATIVA");
        System.out.println("Ingrese el primer numero:");
        m = teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        n = teclado.nextInt();
        r = m%n;
        while(r != 0){
            m = n;
            n = r;
            r = m%n;
        }
        System.out.println("El MCD es: " + n);
    }


}
