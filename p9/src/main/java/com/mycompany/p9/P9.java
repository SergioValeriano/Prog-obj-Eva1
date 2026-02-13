/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p9;

/**
 *
 * @author bisonte
 */
public class P9 {

    public static void main(String[] args) {
        transferencia trans = new transferencia("juan perez", 1000);
        trans.imprimir();
        trans.ingresar(1000);
        trans.imprimir();
        trans.retirar(3000);
        trans.imprimir();
    }
}
