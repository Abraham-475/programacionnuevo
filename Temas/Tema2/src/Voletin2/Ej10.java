package Voletin2;

import Cosas.MiEntradaSalida;

//Crea un método que compruebe si una matriz pasada por parámetro es simétrica en
//función del eje Y. Es decir, la matriz

public class Ej10 {

    public static void main(String[] args) {

        // Definir variables y matriz
        int[][] matriz;
        int filas = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de filas de la matriz");
        int columnas = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de columnas de la matriz");
        matriz = new int[filas][columnas];

        // Preguntar valores
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = MiEntradaSalida.leerEnteroPositivo("En la fila " + i + ", columna " + j + ", dime el valor");
            }
        }

        // Llamar al método para comprovar si es simetrico
        boolean simetrico = simetria(matriz);

        //Mostrar resultado
        if (simetrico == true) {
            System.out.println("Si es simetrico calajo wey nachos sebiche ahorita alistandome plumon remera, chamaco");
        } else {
            System.out.println("No es simetrico");
        }

    }

    public static boolean simetria(int[][] matriz) {
        boolean simetrico = true;
        int columnas = matriz[0].length;

        // Recorremos las filas
        for (int i = 0; i < matriz.length; i++) {
            // Recorremos la mitad de las columnas
            for (int j = 0; j < columnas / 2; j++) {
                // Comparamos el elemento izquierdo con su opuesto derecho en la misma fila
                if (matriz[i][j] != matriz[i][columnas - 1 - j]) {
                    simetrico = false;
                    break; //Si es asimetrico salir
                }
            }
        }
        return simetrico;
    }

}
