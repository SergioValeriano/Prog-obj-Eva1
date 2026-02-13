/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p9;

public class transferencia {
    private String titular;
    private double monto;
    
    public  transferencia(){
        this.titular = "no definido";
        this.monto = -1;
    }
    public transferencia(String titular, double monto){
        this.titular = titular;
        this.monto = monto;
    }
    public void ingresar(double monto){
        if (this.monto>0){
            this.monto += monto;
        }
        else  {
            System.out.println("error ");
        }
    }
    public void retirar(double monto){
        if (this.monto>=monto){
            this.monto -= monto;
        }
        else  {
            System.out.println("salario insuficiente ");
        }
    }
    public void imprimir(){
        
        System.out.println("saldo: $"+monto);
    }
}
