package Parcial1Progra;


import java.util.InputMismatchException;
import java.util.Scanner;

import static Parcial1Progra.OperacionesAvanzadas.*;
import static Parcial1Progra.OperacionesBasicas.*;

class main {


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        //Indica si salimos o no
        boolean salir = false;
        int opcion;

        //Bucle para pedir las opciones hasta que elijamos salir
        while (!salir) {
            //opciones
            System.out.println("--Bienvendio a caluladora--  ");
            System.out.println("1. operaciones basicas    ");
            System.out.println("2. operaciones Avanzadas  ");
            System.out.println("3. Salir del programa");

            try {

                //Pide una opcion
                System.out.println("Por favor, seleccione:   ");
                opcion = sn.nextInt();

                //Realiza una de las opciones
                switch (opcion) {
                    case 1 -> menubasico();
                    case 2 -> menuavanzado();
                    case 3 -> salir = true;
                    default -> System.out.println("Las opciones son entre 1 y 3");
                }
                //controla la excepcion en caso de que se introduzca un valor no correcto
            }catch(InputMismatchException e){
                System.out.println("Debes escribir un numero");
                sn.next();
            }

        }

        System.out.println("Fin del menu");

    }
    static void menubasico() {
        Scanner sn = new Scanner(System.in);

        //Indica si salimos o no
        boolean salir = false;
        int opcion;

        //Bucle para pedir las opciones hasta que elijamos salir
        while (!salir){

            //opciones
            System.out.println("--Bienvendio a caluladora Basica--  ");
            System.out.println("1. suma            1");
            System.out.println("2. resta           2");
            System.out.println("3. multiplicacion  3");
            System.out.println("4. division        4");
            System.out.println("5. Regresar al menu Principal");


            try{

                //Pide una opcion
                System.out.println("Introduce un numero: ");
                opcion = sn.nextInt();

                //Realiza una de las opciones
                switch (opcion) {
                    case 1 -> suma();
                    case 2 -> resta();
                    case 3 -> multiplicar();
                    case 4 -> division();
                    case 5 -> salir = true;
                    default -> System.out.println("Las opciones son entre 1 y 5");
                }

                //controla la excepcionn en caso de que se introduzca un valor no correcto
            }catch(InputMismatchException e){
                System.out.println("Debes escribir un numero");
                sn.next();
            }

        }

        System.out.println("Fin del menu");
        }
    static void menuavanzado() {
        Scanner sn = new Scanner(System.in);

        //Indica si salimos o no.
        boolean salir = false;
        int opcion;

        //Bucle para pedir las opciones hasta que elijamos salir.
        while (!salir) {

            //opciones.
            System.out.println("--Bienvendio a caluladora Avanzada--");
            System.out.println("1. raiz      1");
            System.out.println("2. potencia  2");
            System.out.println("3. calcular seno      3");
            System.out.println("4. calcular coseno    4");
            System.out.println("5. calcular tangente  5");
            System.out.println("6. Regresar al menu Principal");

            try{

                //Pide una opcion
                System.out.println("Introduce un numero: ");
                opcion = sn.nextInt();

                //Realiza una de las opciones
                switch (opcion) {
                    case 1 -> raiz();
                    case 2 -> potencia();
                    case 3 -> seno();
                    case 4 -> cos();
                    case 5 -> tan();
                    case 6 -> salir = true;
                    default -> System.out.println("Las opciones son entre 1 y 7");
                }


                //controla la excepcionn en caso de que se introduzca un valor no correcto
            }catch(InputMismatchException e){
                System.out.println("Debes escribir un numero");
                sn.next();
            }

        }

        System.out.println("Fin del menu");

    }
}


