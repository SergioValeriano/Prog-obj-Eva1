/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p7;

public class persona {
    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private int edad;
    //CONSTRUCTORES
      //MODIFICADOR DE ACCESO NOMBRE_CLASE(ARGUMRNTOS) {CUERPO DEL CONSTRUCTOR}
    public persona(){
        //SE USAN PARA INICIALIZAR LOS OBJETOS
        System.out.println("Ejecucion del constructor");
        nombre = "------";
        apellidos = "------";
        edad = -1; 
    }
           //FIRMA 
    public persona(String nombre, String apellidos, int edad){
        //this ---> apuntador a todo el contenido del objeto:
        //metodos y atributos definidos en la clase, SIN IMPORTAR
        //LOS MODIFICADORES DE ACCESO
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    //COMPORTAMIENTO
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public String getApellido(){
        return apellidos;
    }
    public void setApellido(String valor){
        apellidos = valor;
    }
        public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public void imprimirDatos(){
        System.out.println("-------------Datos de la persona-------------");
        System.out.println("nombre: "+nombre);
        System.out.println("apellido: "+apellidos);
        System.out.println("Edad: "+edad);
    }
}
