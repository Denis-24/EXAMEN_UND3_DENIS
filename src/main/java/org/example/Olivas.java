package org.example;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Olivas {
    static void main() {

        Random aleactorio = new Random();
        Scanner teclado = new Scanner(System.in);
        double totalkg = 0;
        double totalli = 0;
        double filali = 0;
        int kg =0;

        System.out.println("***BIENVENIDO AL OLIVOMETRO***");
        System.out.println("Introduce en tamaño de tu bancal...");
        System.out.println("Ancho...");
        int ancho = teclado.nextInt();

        System.out.println("Largo...");
        int largo = teclado.nextInt();

        String matriz[][] = new String[largo][ancho];

        System.out.println("Introduce (por hileras) los kg por arbol de tu bancal:");
        for (int x = 0; x < largo; x++) {
            for (int y = 0; y < ancho; y++) {
                String linea[] = teclado.next().split(" ");
                for (String num : linea){
                    matriz[x][y]=num;
                }
            }
        }

        System.out.println("============================================");

        System.out.println("MAPA de tu bancal actual...");

        for (String fila[] : matriz){
            for (String num : fila){
                System.out.print(num + " ");
            }
            System.out.println();
        }


        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                totalkg+= Integer.parseInt(matriz[x][y]);

            }
        }
        System.out.println("Total de kg generados: " + totalkg + " kg");
        System.out.println("Total de kg generados: " + (totalkg/8) + " L");
        System.out.println("Litros por hilera...");
        for (int y = 0; y < matriz.length; y++) {
            totalli=0;
            for (int x = 0; x < matriz[y].length; x++) {
                totalli+= Double.parseDouble(matriz[x][y]);
            }
            System.out.println("-Hilera " + (y+1) + ": " + totalli + " L" );
        }

        System.out.println("Olivos mas productivos (>35kg)");

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (Integer.parseInt(matriz[x][y])>35){
                    System.out.println("- En la posicion (" + x + "," + y + ") con " + matriz[x][y] + "kg" );
                }
            }
        }
        System.out.println("Olivo Top");
        System.out.println("=========================");
        System.out.println("MAPA para replantar");
        for (String fila[] : matriz){
            for (String num : fila){
                if (Integer.parseInt(num)<5){
                    System.out.print("x ");
                } else if (Integer.parseInt(num)>=5) {
                    System.out.print(num + " ");
                }

            }
            System.out.println();
        }
        System.out.println("============================");
        System.out.println("MAPA estim acion despues de replantar");
        for (String fila[] : matriz){
            for (String num : fila){
                if (Integer.parseInt(num)<5){
                    System.out.print(aleactorio.nextInt(15,35) + " ");
                } else if (Integer.parseInt(num)>=5) {
                    System.out.print(num + " ");
                }

            }
            System.out.println();
        }




























    }
}
