package Parcial1Progra;

import java.util.Scanner;

public class OperacionesBasicas {
    static void suma(){
        System.out.println("SUMA");
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;
        System.out.println("Escriba el primer Numero");
        num1=leer.nextInt();
        System.out.println("Escriba el segundo numero");
        num2=leer.nextInt();
        resultado=num1+num2;
        System.out.println("La suma es "+resultado);
        System.out.println(" ");

    }
}