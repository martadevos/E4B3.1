package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Pedir numero
	* Leer numero
	* while (numero<1 && numero>7)
	*   Numero incorrecto
	*   Pedir numero
	*   Leer numero
	* Switch
	*   Case1 Lunes
	*   Case2 Martes
	*   Case3 Miercoles
	*   Case4 Jueves
	*   Case5 Viernes
	*   Case6 Sabado
	*   Case7 Domingo*/
        Scanner scan=new Scanner(System.in);
        int numero=0;
        System.out.println("Introduzca un número del 1 al 7");
        numero= scan.nextInt();
        while (numero<1 || numero>7){
            System.out.println("El número introducido es incorrecto");
            System.out.println("Introduzca un número del 1 al 7");
            numero= scan.nextInt();
        }
        switch (numero){
            case 1 -> System.out.println("El día es lunes");
            case 2 -> System.out.println("El día es martes");
            case 3 -> System.out.println("El día es miércoles");
            case 4 -> System.out.println("El día es jueves");
            case 5 -> System.out.println("El día es viernes");
            case 6 -> System.out.println("El día es sábado");
            case 7 -> System.out.println("El día es domingo");
        }
    }
}
