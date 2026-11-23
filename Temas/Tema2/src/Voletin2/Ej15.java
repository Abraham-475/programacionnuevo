package Voletin2;

import Cosas.MiEntradaSalida;

//Crear un método que devuelva el número de casilla a la que corresponden unas
//coordenadas. Es decir, el número de casilla empezando por la casilla [0,0], y recorriendo
//primero por filas y luego por columnas. Por ejemplo, la casilla [1,5] en una matriz de 6x6
//ocuparía el número 12. En la misma matriz, la casilla [4,0] ocuparía el número 25.

public class Ej15 {

    public static void main(String[] args) {

        // Definir variables y matrizes
        int[][] matriz;
        int resultado =0;
        int filas = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de filas de la matriz");
        int columnas = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de columnas de la matriz");
        matriz = new int[filas][columnas];


        // Preguntar valores matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = MiEntradaSalida.leerEnteroPositivo("En la fila " + i + ", columna " + j + ", dime el valor");
            }
        }

        // Llamar al método para buscar
        resultado = buscar(matriz);

        //Mostrar resultado
        System.out.println("El valor es " + resultado);
    }

    public static int buscar(int[][] matriz) {

        int resultado = 0;

        int buscarFila = MiEntradaSalida.leerEnteroPositivo("Posision de fila a buscar");
        int buscarColumna = MiEntradaSalida.leerEnteroPositivo("Posision de columna a buscar");

        resultado = matriz[buscarFila][buscarColumna];

        return resultado;
    }
}
