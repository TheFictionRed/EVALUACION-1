package eva1_3_modificadores;

import otro_perro.Otra_clase;

public class EVA1_3_MODIFICADORES {
    
    public int x;
    protected int y;
    private int z;
    int w;
    

    public static void main(String[] args) {
        
        PruebaA objA = new PruebaA();
        
      //  objA. PUEDO VER A x QUE ES PUBLIC, PUEDO VER Y POR QUE ES PROTECTED Y PUEDO VER LA CLASE PRUEBAa POR QUE ES PUBLIC
        
       Otra_clase otroObj = new  Otra_clase();
       
       //otroObj. PUEDO VER LA x POR QUE ESTA EN PUBLIC EN LA CLASE LLAMADA Otra_clase
       
      // PruebaB objB = new PruebaB(); ESTA CLASE NO ES VISIBLE YA QUE LA CLASE SE ENCUENTRA EN DEFAULT
 }
}
//ESTAS CLASES TIENEN UN MODIFICADOR DE ACCECO DEFAUTL
 class PruebaA{

 public int x;
    protected int y;
    private int z;
    int w;
    


}