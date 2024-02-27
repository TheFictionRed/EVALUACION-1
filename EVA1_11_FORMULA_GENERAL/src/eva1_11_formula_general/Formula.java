
package eva1_11_formula_general;


public class Formula {
    private double A;
    private double B;
    private double C;
    
    public void setA(double valor){
        A = valor;
    }
    public void setB(double valor){
        B = valor;
    }
    public void setC(double valor){
        C = valor;
    }
    
    public double getA(){
    return A;
    }
    public double getB(){
    return B;
    }
    public double getC(){
    return C;
    }
    
    private double calcular(){
     double form1;
        form1 = (-B + Math.sqrt(B * B - 4 * A * C)) / (2 * A);
         return form1;
    }
    public void imprimir(){
    
        System.out.println("El resultado es: " + calcular());
    }
    
}
