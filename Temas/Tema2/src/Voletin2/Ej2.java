package Voletin2;

import Cosas.MiEntradaSalida;

public class Ej2 {

    //Crea un método que sume todas las posiciones de una matriz y devuelva dicho número

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
        //Mandar metodo
        int suma = sumar(matriz);

        //Mostrar
        System.out.println("total es " + suma);
    }

    // Método para sumar
    public static int sumar(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        System.out.println();
        return suma;
    }
}
