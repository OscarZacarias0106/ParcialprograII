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
        }

    }
}