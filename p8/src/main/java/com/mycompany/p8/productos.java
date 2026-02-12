/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p8;

public class productos {
    private String nombre;
    private String marca;
    private String unidad;
    private double precio;
    private double cantidad;
    
    public productos(){
        nombre = "inexistente";
        marca = "inexistente";
        unidad = "inexistente";
        precio = 0;
        cantidad = 0;
    }
    public productos(String nombre, String marca, String unidad, double precio, double cantidad){
        this.nombre = nombre;
        this.marca = marca;
        this.unidad = unidad;
        this.precio = precio; 
        this.cantidad = cantidad;
    }
    public String getNombre(){
         return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public String getMarca(){
         return marca;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    public String getUnidad(){
         return unidad;
    }
    public void setUnidad(String valor){
        unidad = valor;
    }
    public double getPrecio(){
         return precio;
    }
    public void setPrecio(double valor){
        precio = valor;
    }
    public double getCantidad(){
         return cantidad;
    }
    public void setCantidad(double valor){
        cantidad = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("-------------Productos-------------");
        System.out.println("nombre: "+nombre);
        System.out.println("Marca: "+marca);
        System.out.println("Unidad: "+unidad);
        System.out.println("Precio: $"+precio);
        System.out.println("Cantidad: "+cantidad);
    }
}
