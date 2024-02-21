
package eva1_7_metodos;

import java.util.Scanner;

public class EVA1_7_METODOS {

    public static void main(String[] args) {
   
      
      
        persona perso = new persona();
        
        perso.setNombre("Juan");
        perso.setApellido("Pérez");
        perso.setEdad(50);
        
        System.out.println("El nombre es " + perso.generarNombreCom());
        System.out.println("Nacio en el año: " + perso.calcularAnnioNac());
        
        //_-------------------
        
        persona[] grupo = new persona[5];
        //HAY QUE CREAR CADA OBJETO
        for (int i = 0; i < grupo.length; i++) {
               Scanner sc = new Scanner(System.in);
               
            grupo[i]= new persona();
            
            
            System.out.print("Introduce el nombre: ");
            grupo[i].setNombre(sc.nextLine());
            System.out.print("Introduce el apellido: ");
            grupo[i].setApellido(sc.nextLine());
            System.out.print("Introduce la edad: ");
            grupo[i].setEdad(sc.nextInt());
          
            
        }
        for (int i = 0; i < grupo.length; i++) {
           
           System.out.println("El nombre es " + grupo[i].generarNombreCom());
        System.out.println("Nacio en el año: " + grupo[i].calcularAnnioNac());
         
          
            
        }
      
    }
    
}
