
package eva1_10_triangulo;

public class Triangulo {
    
    private double base;
    private double altura;
    
    public Triangulo(){
     base = -1;
     altura = -1;
    }
    
    public void setBase(double valor){
    
        base = valor;
        
    }
    
    public double getBase(){
    
        return base;
    
    }
    public void setAltura(double valor){
    
        altura = valor;
    
    }
    public double getAltura(){
    
        return altura;
    
    }
    
    private double area(){
    
        return (base * altura)/2;
        
    }
    private double perimetro(){
    double peri;
    
        peri = base + altura + Math.sqrt((Math.pow(altura, 2))+(Math.pow(base, 2)));
       
    
        return peri;
    
    }
    public void imprime(){
    
        System.out.println("El área del triangulo es: " + area());
        System.out.println("El perimetro del triangulo es: " + perimetro());
        System.out.println("Base: " + getBase());
        System.out.println("Altura: " + getAltura());
    }    
    
    
}
