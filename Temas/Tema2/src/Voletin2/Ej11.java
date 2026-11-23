package Voletin2;

import Cosas.MiEntradaSalida;

//Crea un método que reciba dos matrices, y compruebe si son matrices inversas, es decir,
//si tienen los mismos valores en los índices inversos:

public class Ej11 {

    public static void main(String[] args) {

        // Definir variables y matrizes
        int[][] matriz;
        int filas = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de filas de las matrizes");
        int columnas = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de columnas de las matrizes");
        matriz = new int[filas][columnas];
        int[][] matriz2;
        matriz2 = new int[filas][columnas];

        // Preguntar valores matriz 1
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = MiEntradaSalida.leerEnteroPositivo("En la fila " + i + ", columna " + j + ", dime el valor");
            }
        }

        // Preguntar valores matriz 2
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz2[i][j] = MiEntradaSalida.leerEnteroPositivo("En la fila " + i + ", columna " + j + ", dime el valor de la segunda matriz");
            }
        }

        // Llamar al método para comprovar si es simetrico
        boolean simetrico = simetria(matriz, matriz2);

        //Mostrar resultado
        if (simetrico == true) {
            System.out.println("Si es simetrico calajo wey nachos sebiche ahorita alistandome plumon remera, chamaco");
        } else {
            System.out.println("No es simetrico");
        }
    }

    public static boolean simetria(int[][] matriz, int[][] matriz2) {
        boolean simetrico = true;
        int columnas = matriz[0].length;
        int filas = matriz.length;

        // Recorremos las filas
        for (int i = 0; i < matriz.length; i++) {
            // Recorremos las columnas
            for (int j = 0; j < matriz[i].length; j++) {

                //Comprovar inversas
                //Inversa de j
                if (matriz[i][j] != matriz2[filas - 1 - i][columnas - 1 - j]) {
                    simetrico = false;
                    break; //Si es asimetrico salir
                }
            }
        }
        return simetrico;
    }

}
