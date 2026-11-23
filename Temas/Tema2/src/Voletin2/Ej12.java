package Voletin2;

import Cosas.MiEntradaSalida;

//Crea un método que transforme una matriz CUADRADA (tienes que realizar dicha
//comprobación) que recibe por parámetro, en otra, que debe ser su reflejo en diagonal (de
//arriba a la izquierda a abajo a la derecha):

//      1 2 3 4 5     1 6 3 9 0
//      6 7 8 9 0     2 7 2 5 9
//      3 2 1 4 5 --> 3 8 1 8 8
//      9 5 8 6 7     4 9 4 6 5
//      0 9 8 5 4     5 0 5 7 4

public class Ej12 {

    public static void main(String[] args) {

        // Definir variables y matrizes
        int[][] matriz;
        int[][] resultado;
        int tamaño = MiEntradaSalida.leerEnteroPositivo("Dime el tamaño de la matriz");

        matriz = new int[tamaño][tamaño];


        // Preguntar valores matriz 1
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz[i][j] = MiEntradaSalida.leerEnteroPositivo("En la fila " + i + ", columna " + j + ", dime el valor");
            }
        }

        // Llamar al método para convertir
        resultado = convertir(matriz);

        //Mostrar resultado
        // Recorremos las filas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] convertir(int[][] matriz) {

        //Comprova si es cuadra
        if (matriz.length != matriz[0].length) {
            System.out.println("La matriz no es cuadrada");
            return null; //Salir sin dar valor
        }

        int tamaño = matriz.length;
        int[][] convertida;
        convertida = new int [tamaño][tamaño];

        // Recorremos las filas
        for (int i = 0; i < matriz.length; i++) {
            // Recorremos las columnas
            for (int j = 0; j < matriz[i].length; j++) {

                //Comvertir
                convertida[i][j] = matriz[j][i];
            }
        }
        return convertida;
    }
}
