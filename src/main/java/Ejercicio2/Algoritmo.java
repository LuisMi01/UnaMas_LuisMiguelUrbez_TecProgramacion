package Ejercicio2;

public class Algoritmo {
    public void f(int num /*100*/, int div/*2*/){
        if (num>1) {
            if ((num%div) == 0) {
                System.out.println(div);
                f(num/div,div);
            } else {
                f(num,div+1); }
        } else {
            System.out.println("El numero tiene que ser mayor que 1");
        }
    }

    public void fIterativo(int num, int div){
        while (num>1) {
            if ((num%div) == 0) {
                System.out.println(div);
                num = num/div;
            } else {
                div++;
            }
        }
        System.out.println("El numero tiene que ser mayor que 1");
    }

    public void fLambda(int num, int div){
        while (num>1) {
            if ((num%div) == 0) {
                System.out.println(div);
                num = num/div;
            } else {
                div++;
            }
        }
        System.out.println("El numero tiene que ser mayor que 1");
    }
}
