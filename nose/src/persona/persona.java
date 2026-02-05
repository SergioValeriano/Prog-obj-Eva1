

package persona;

public class persona {
    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    //constructores
    //comportamiento: //interfaz
    //get y set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String valor){
        apellidos = valor;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public char getGenero(){
        return genero;
    }
    public void setGenero(char valor){
        genero = valor;
    }
    public void imprimirDatos(){
        system.out.println("Nombre:"+ perso.setNombre());
    }
}
