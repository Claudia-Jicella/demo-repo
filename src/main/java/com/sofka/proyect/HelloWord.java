package com.sofka.proyect;

import javax.swing.*;
import java.util.Scanner;

public class HelloWord {
    public static void main(String[] args) {

        Scanner captura = new Scanner(System.in);
        String nombre;
        long celular;// el long para scanear e imprimir un numero largo
        int edad;

        System.out.println("Ingrese su nombre: ");
        nombre = captura.nextLine();

        System.out.println("Ingrese su Numero de celular: ");
        celular = Long.parseLong(captura.nextLine()); //plugin para scanear e impirmir un numero de largo

        System.out.println("Ingrese su Edad: ");
        edad=Integer.parseInt(captura.nextLine());

        System.out.println("Bienvenid@ señor@ " + nombre + ", es un placer para nosotros contar con una persona de " + edad + " años. \nPróximamente nos comunicaremos con usted al numero " + celular + ".     \nFeliz día.");

    }

}