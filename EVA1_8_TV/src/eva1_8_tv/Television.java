
package eva1_8_tv;




public class Television {
    
    //Atrubutos privados
    private int vol;
    private int canal;
    private boolean on;
    
    //CONSTRUCTORES:
    //CONSTRUCTOR SIN ARGUMENTOS: CONSTRUCTOR DEFAULT
    //Metodo para inicializar los objetos
    public Television(){
    //NO ES NECESARIO
    vol = 30;
    canal = 5;
    on = false;
    
    }
            
    
    
    
    
    
    
    public void subirVol(){    
       
        if(on && (vol<100)) 
        vol++;   
 
    }
    public void bajarVol(){
       
        if(on && (vol > 0) ) 
        vol--;
    }
    public void subircanal(){    
       
        if(on) 
        canal++;   
    }
    public void bajarcanal(){
       
        if(on &&(canal > 0))  
        canal--;
    }
    public void cambiarcanal(int canal){
       
        if(on && !(canal < 0))  
        this.canal = canal;
       
           
    }
    public void power(){
        on = !on;
    }
    public void imprime(){
        System.out.println(vol);
        System.out.println(canal);
        System.out.println(on);
    
    
    
    }
    
    
    
    
    
    
    
}
