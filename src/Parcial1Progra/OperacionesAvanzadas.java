package Parcial1Progra;

import java.util.Scanner;

public class OperacionesAvanzadas {
    static void raiz(){
        System.out.println("Raiz cuadrada");
        Scanner leer = new Scanner(System.in);
        double num1;
        double  resultado;
        System.out.println("Ingrese el numero a calcular");
        num1=leer.nextDouble();
        resultado=Math.sqrt(num1);
        System.out.println("La Raiz cuadrada de "+num1+" es "+resultado);
        System.out.println(" ");

    }
    static void potencia(){
        System.out.println("Potencia");
        Scanner leer = new Scanner(System.in);
        double num1;
        double num2;
        double resultado;
        System.out.println("Escriba la base: ");
        num1=leer.nextDouble();
        System.out.println("Escriba el valor del exponente: ");
        num2=leer.nextDouble();
        resultado=Math.pow(num1, num2);
        System.out.println("El resultdo es: "+resultado);
        System.out.println(" ");

    }
    static void seno(){
        System.out.println("Seno de un Angulo");
        Scanner leer = new Scanner(System.in);
        double num1;
        double  resultado;
        System.out.println("Ingrese el angulo a calcular");
        num1=leer.nextDouble();
        double  rad=Math.toRadians(num1);
        //funcion matematica utilizada  es math.sin
        resultado=Math.sin(rad);
        System.out.println("Seno de "+num1+"º es "+resultado);
        System.out.println(" ");

    }
    static void cos(){
        System.out.println("Coseno de un Angulo");
        Scanner leer = new Scanner(System.in);
        double num1;
        double  resultado;
        System.out.println("Ingrese el angulo a calcular");
        num1=leer.nextDouble();
        double  rad=Math.toRadians(num1);
        //funcion matematica utilizada  es math.cos
        resultado=Math.cos(rad);
        System.out.println("Coseno de "+num1+"º es "+resultado);
        System.out.println(" ");

    }
    static void tan(){
        System.out.println("Tangente de un Angulo");
        Scanner leer = new Scanner(System.in);
        double num1;
        double  resultado;
        System.out.println("Ingrese el valor del angulo a calcular");
        num1=leer.nextDouble();
        double  rad=Math.toRadians(num1);
        //funcion matematica utilizada  es math.tan
        resultado=Math.tan(rad);
        System.out.println("Tangente de "+num1+"º es "+resultado);
        System.out.println(" ");

    }
}
