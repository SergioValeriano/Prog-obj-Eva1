/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p7;

/**
 *
 * @author bisonte
 */
public class P7 {

    public static void main(String[] args) {
                            //CONSTRUCTO DEFAULT (SIN ARGUMENTOS EN LOS PARENTECIS)
        persona perso = new persona();
        perso.imprimirDatos();
        persona perso1 = new persona("Juan", "Perez", 50);
        perso1.imprimirDatos();
        
    }
}
