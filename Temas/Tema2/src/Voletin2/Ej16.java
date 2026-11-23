package Voletin2;

import Cosas.MiEntradaSalida;

//Crea un método que compruebe, sobre una matriz de enteros, cuántas casillas
//adyacentes tienen valores pares. Se considera adyacente todas las posiciones
//colindantes, incluidas las diagonales. En el siguiente ejemplo, el 7 (en rojo) tiene 4
//casillas colindantes con números pares. El resultado se deberá guardar en otra matriz,
//que contendrá dichos números. Para este ejercicio, consideraremos que el 0 es par.

public class Ej16 {

    public static void main(String[] args) {

        // Definir variables y matrizes
        int[][] matriz;
        int filas = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de filas de la matriz");
        int columnas = MiEntradaSalida.leerEnteroPositivo("Dime la cantidad de columnas de la matriz");
        matriz = new int[filas][columnas];


        // Preguntar valores matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = MiEntradaSalida.leerEnteroPositivo("En la fila " + i + ", columna " + j + ", dime el valor");
            }
        }

        //Mostrar matriz
        System.out.println("Asi queda tu matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        // Llamar al método para buscar
        adllar(matriz, filas, columnas);


    }

    public static void adllar(int[][] matriz, int filas, int columnas) {

        int[] adjadcentes = new int[8];
        int contador = 0;

        // Definir qué buscar
        int fila = MiEntradaSalida.leerEnRangoPositivo("Dime la fila a buscar", 0, filas - 1);
        int columna = MiEntradaSalida.leerEnRangoPositivo("Dime la columna a buscar", 0, columnas - 1);

        // Contadores de las 8 casillas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int filaActual = fila - 1 + i;
                int colActual = columna - 1 + j;

                // Revisar si se sale por arriba, abajo, izquierda o derecha
                if (filaActual < 0 || filaActual >= filas || colActual < 0 || colActual >= columnas) {
                    continue;
                }
                // Saltar la propia casilla seleccionada
                if (i == 1 && j == 1) {
                    continue;
                }

                // Guardar y avanzar el contador solo si es una casilla válida
                adjadcentes[contador] = matriz[filaActual][colActual];
                contador++;
            }
        }

        // Mostrar resultado
        System.out.println("Has seleccionado el numero " + matriz[fila][columna]);

        System.out.println("Tus numeros adyacentes son: ");
        for (int i = 0; i < contador; i++) {
            System.out.print(adjadcentes[i] + " ");
        }
        System.out.println();

        System.out.println("Tus numeros adyacentes pares son: ");
        for (int i = 0; i < contador; i++) {
            if (adjadcentes[i] % 2 == 0) {
                System.out.print(adjadcentes[i] + " ");
            }
        }
        System.out.println();
    }
}
