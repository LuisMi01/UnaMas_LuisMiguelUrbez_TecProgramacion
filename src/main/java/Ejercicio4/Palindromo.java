package Ejercicio4;

import java.util.Scanner;

public class Palindromo {
    Scanner teclado = new Scanner(System.in);

    public void funcion(){
        System.out.println("Ingrese su cadena de texto:");
        String cadena = teclado.nextLine();
        String cadenaInvertida = "";
        for(int i = 0; i<cadena.length(); i++){
            cadenaInvertida = cadena.charAt(i) + cadenaInvertida;
        }
        if(cadena.equals(cadenaInvertida)){
            System.out.println("La palabra es un palindromo");
        }else{
            System.out.println("La cadena no es un palindromo");
        }
    }
}
