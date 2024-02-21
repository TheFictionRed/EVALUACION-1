
package eva1_7_metodos;



public class persona {
    
    private String nombre;
    private String apellidos;
    private int edad;
    
    
public String getNombre(){

return nombre;

}    
public void setNombre(String valor){

    nombre = valor;

}
public String getApellido(){

return nombre;

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
    public String generarNombreCom(){
    
    return nombre + " " + apellidos;
    
    }
    
    public int calcularAnnioNac(){
    
        return 2024 - edad;
    
    }
    
    
    
}


