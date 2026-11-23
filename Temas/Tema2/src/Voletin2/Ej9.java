package Voletin2;

import Cosas.MiEntradaSalida;

import java.sql.SQLOutput;

//Crea un método que compruebe si una matriz pasada por parámetro es simétrica en
//función del eje X. Es decir, la matriz

public class Ej9 {

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

    //Metodo
    public static boolean simetria(int[][] matriz) {
        boolean simetrico = true;

        for (int i = 0; i < matriz.length / 2; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[(matriz.length - 1 - i)][j]) {
                    simetrico = false;
                }
            }
        }
        return simetrico;
    }
}
