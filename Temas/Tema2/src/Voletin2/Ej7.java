package Voletin2;

import Cosas.MiEntradaSalida;

//Crea un método que reciba dos matrices, y compruebe si son exactamente iguales.

public class Ej7 {

    public static void main(String[] args) {
        // Definir variables y matriz
        int[][] matriz;
        int filas = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de filas de la matriz");
        int columnas = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de columnas de la matriz");
        matriz = new int[filas][columnas];

        int[][] matriz2;
        int filas2 = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de filas de la segunda matriz");
        int columnas2 = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de columnas de la segunda matriz");
        matriz2 = new int[filas2][columnas2];

        // Preguntar valores
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = MiEntradaSalida.leerEnteroPositivo("En la fila " + i + ", columna " + j + ", dime el valor");
            }
        }

        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                matriz2[i][j] = MiEntradaSalida.leerEnteroPositivo("2 matriz, En la fila " + i + ", columna " + j + ", dime el valor");
            }
        }

        // Llamar al método para comprovar
        mostrar(matriz, matriz2);
    }

    //comprovar
    public static void mostrar(int[][] matriz, int[][] matriz2) {
        boolean diferente = false;

        if (matriz[0].length == matriz2[0].length) {
            if (matriz.length == matriz2.length) {

                    for (int j = 0; j < matriz[0].length; j++) {
                        for (int i = 0; i < matriz.length; i++) {
                            if (matriz[i][j] != matriz2[i][j]) { diferente = true;System.out.println(" valores distintos en " + i + " y " + j);}
                        }
                    }
            } else {diferente = true;System.out.println("numero de colunas distintas ");}
        } else {diferente = true;System.out.println("numero de filas distintas ");}

        if (diferente = false)
        System.out.println(diferente);
    }
}
