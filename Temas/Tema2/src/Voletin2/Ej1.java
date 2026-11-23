package Voletin2;

import Cosas.MiEntradaSalida;

public class Ej1 {

    public static void main(String[] args) {

        // Definir variables, arrays y matrices
        int[][] matriz;
        int filas = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de filas de la matriz");
        int columnas = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de columnas de la matriz");
        matriz = new int[filas][columnas];

        // Preguntar valores
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = MiEntradaSalida.leerEntero("En la fila " + i + ", columna " + j + ", dime el valor");
            }
        }

        boolean encontrado = mostrar(matriz);
        System.out.println(encontrado);
    }

    // Método para mostrar la matriz leída por filas en orden normal
    public static boolean mostrar(int[][] matriz) {
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    encontrado = true;
                }
            }
        }
        System.out.println();
        return encontrado;
    }
}
