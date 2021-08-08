package Parcial1Progra;

import java.util.Scanner;

public class OperacionesAvanzadas {
    static void raiz(){
        System.out.println("RAIZ CUADRADA");
        Scanner leer = new Scanner(System.in);
        double num1;
        double  resultado;
        System.out.println("Ingrese el numero a calcular");
        num1=leer.nextDouble();
        resultado=Math.sqrt(num1);
        System.out.println("La Raiz cuadrar de "+num1+" es "+resultado);
        System.out.println(" ");

    }
}
