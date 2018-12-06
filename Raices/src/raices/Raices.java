package raices;
import java.util.Scanner;

public class Raices {
    
    double a, b, c;
    
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Se calcularán las soluciones de una ecuación"
                +"cuadrática de la forma ax^2 + bx + c");
        System.out.print("Ingrese el valor de 'a': ");
        double a=in.nextDouble();
        System.out.print("Ingrese el valor de 'b': ");
        double b=in.nextDouble();
        System.out.print("Ingrese el valor de 'c': ");
        double c=in.nextDouble();
        Raices pepito = new Raices(a, b, c);
        pepito.calcular(a, b, c);
    }
    
    /**
     * Imprime las 2 posibles soluciones
     */
    public static void obtenerRaices(double a, double b, double c) {
        System.out.println("Las soluciones son:");
        System.out.println("x1 = "+(-b + Math.sqrt( (b*b)-(4*a*c)) ) / (2*a) );
        System.out.println("x2 = "+(-b - Math.sqrt( (b*b)-(4*a*c)) ) / (2*a) );
    }
    
    /**
     * Imprime única raíz, cuando tenga solo una solución posible.
     */
    public static void obtenerRaiz(double a, double b, double c) {
        System.out.println("La solución única es:");
        System.out.println("x = " + (-b/(2*a)) );        
    }
    
    /**
     * Devuelve el valor del discriminante (double)
     * El discriminante tiene la siguiente formula: (b^2)-4*a*c
     */
    public static double getDiscriminante(double a, double b, double c) {
        return (b*b)-(4*a*c);
    }
    
    /**
     * Devuelve un booleano indicando si tiene dos soluciones
     * Para que esto ocurra, el discriminante debe ser mayor a 0.
     */
    public static boolean tieneRaices(double a, double b, double c) {
        if (getDiscriminante(a, b, c)>0) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Devuelve un booleano indicando si tiene una única solución
     * Para que esto ocurra, el discriminante debe ser igual a 0.
     */
    public static boolean tieneRaiz(double a, double b, double c) {
        if (getDiscriminante(a, b, c)==0) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Mostrará por consola las posibles soluciones que tiene la ecuación
     * En caso de no existir solución, mostrarlo también.
     * Formula ecuación 2° grado: x=(-b±√((b^2)-(4*a*c)))/(2*a)
     * Solo varia el signo delante de -b
     */
    public void calcular(double a, double b, double c) {
        System.out.println("La ecuación a resolver es: " + a + "x^2+" + b + "x+" + c);
        double delta = (b*b)-(4*a*c);
        System.out.println("El discriminante es: " + delta);
        if (tieneRaiz(a, b, c)) {
            obtenerRaiz(a, b, c);
        } else if (tieneRaices(a, b, c)) {
            obtenerRaices(a, b, c);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
        
    }

}
