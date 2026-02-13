/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_10_tv;

public class control {
    private boolean encendido;
    private int canal;
    private int volume;
    
    public control(){
        encendido = false;
        canal = 0; 
        volume = 0;
    }
    public control(boolean encendido, int canal, int volume){
        this.encendido = encendido;
        this.canal = canal;
        this.volume = volume; 
    }
    public void encender(boolean valor){
        encendido = valor;
        /*if (encendido == true){
            encendido = false;
        }
        else {
            encendido = true;*/
        encendido = !encendido;
        }
    public void consultarestado(){
        if(encendido)
            System.out.println("Encendida");
        else
            System.out.println("apagado");
    }
}

