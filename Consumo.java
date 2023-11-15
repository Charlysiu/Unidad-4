/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodo;

/**
 *
 * @author Usuario
 */
public class Consumo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] consumo = {
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {6, 110, 72, 33, 40},};
        System.out.println("Consumo por casa");
        Consumo.calcularconsumoporcasa(consumo);
        System.out.println("Consumo por dia");
        Consumo.calcularpromediopordia(consumo);

    }

    public static void calcularconsumoporcasa(int[][] Consumo) {
        int[] consum = new int[4];
        for (int i = 0; i < 4; i++) {
            int suma = 0;
            for (int j = 0; j < 5; j++) {
                suma += Consumo[i][j];
            }
            System.out.println(suma);
        }

    }

    public static void calcularpromediopordia(int[][] Consumo) {
        int[] consumpordia = new int[5];
        for (int j = 0; j < 5; j++) {
            int suma = 0;
            for (int i = 0; i < 4; i++) {
                suma += Consumo[i][j];

            }
            System.out.println(suma);
        }

    }
}
