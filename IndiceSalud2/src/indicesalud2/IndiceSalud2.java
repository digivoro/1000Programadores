package indicesalud2;

import java.util.*;


public class IndiceSalud2 {

    public static void main(String[] args) {
        
        Imprimir(Menu());
    }
    
    public static Persona Menu() {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingreso de datos de persona.");
        System.out.print("Ingrese DNI   : ");
        String dni = in.nextLine();
        System.out.print("Ingrese Nombre: ");
        String nombre = in.nextLine();
        System.out.print("Ingrese Edad  : ");
        int edad = in.nextInt();
        System.out.print("Ingrese Altura: ");
        double altura = in.nextDouble();
        System.out.print("Ingrese Peso  : ");
        double peso = in.nextDouble();
        
        Persona pepito = new Persona(dni, nombre, edad, altura, peso);
        return pepito;
    }
        
    public static void Imprimir(Persona pepito) {
        System.out.println("El IMC de "+pepito.getNombre()+" es "+
                pepito.calcularIMC()+".");
        System.out.print("Se clasifica como ");
        pepito.clasificar();
        
    }
     
}
