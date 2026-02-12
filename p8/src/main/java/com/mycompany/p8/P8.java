/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p8;

/**
 *
 * @author bisonte
 */
public class P8 {

    public static void main(String[] args) {
        productos pro = new productos("tomate", "fuitsAndvege", "Kg", 30, 1 );
        pro.imprimirDatos();
        
        double monto = productos.calcularMonto();
        
    }
}
