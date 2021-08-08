package Parcial1Progra;


import java.util.Scanner;

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

            }
        }
    }