package Parcial1Progra;


import java.util.InputMismatchException;
import java.util.Scanner;

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
            System.out.println("1. operaciones basicas    1");
            System.out.println("2. operaciones Avanzadas  2");
            System.out.println("3. Salir del programa");

            try {

                //Pide una opcion
                System.out.println("Por favor, seleccione:   ");
                opcion = sn.nextInt();

                //Realiza una de las opciones
                switch (opcion) {
                    case 1:
                        menubasico();
                        break;
                    case 2:
                        menuavanzado();
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 y 3");
                }
                //controla la excepcionn en caso de que se introduzca un valor no correcto
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
                    case 1:
                        suma();
                        break;
                    case 2:
                        resta();
                        break;
                    case 3:
                        multiplicar();
                        break;
                    case 4:
                        division();
                        break;
                    case 5:
                        salir=true;
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 y 5");
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

}
