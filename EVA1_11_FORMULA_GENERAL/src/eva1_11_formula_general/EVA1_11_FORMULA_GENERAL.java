
package eva1_11_formula_general;

import java.util.Scanner;

public class EVA1_11_FORMULA_GENERAL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Formula f1 = new Formula();
        System.out.println("Introduce los siguientes valores:");
        
        System.out.println("a:");       
        double a = sc.nextDouble();
        f1.setA(a);
        System.out.println("b:");
        double b = sc.nextDouble();
        f1.setB(b);
        System.out.println("c:");
        double c = sc.nextDouble();
        f1.setC(c);
        
        f1.imprimir();
        
    }
    
}
