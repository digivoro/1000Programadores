package indicesalud;

import java.util.*;


public class IndiceSalud {

    public static void main(String[] args) {
        
//        Persona persona1 = new Persona();
//        persona1.dni = "12.345.678-9";
//        persona1.nombre = "JUANITO PEREZ";
//        persona1.edad = 40;
//        persona1.altura = 1.85;
//        persona1.peso = 80;
//        
//        persona1.verificar();
//        System.out.println("IMC         :"+persona1.calcularIMC());
//        persona1.clasificar();
//        System.out.println(18);
        Persona persona2 = new Persona();
        Menu(persona2);
        Imprimir(persona2);
    }
    
    public static void Menu(Persona pepito) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingreso de datos de persona.");
        System.out.print("Ingrese DNI   : ");
        pepito.dni = in.nextLine();
        System.out.print("Ingrese Nombre: ");
        pepito.nombre = in.nextLine();
        System.out.print("Ingrese Edad  : ");
        pepito.edad = in.nextInt();
        System.out.print("Ingrese Altura: ");
        pepito.altura = in.nextDouble();
        System.out.print("Ingrese Peso  : ");
        pepito.peso = in.nextDouble();
    }
    
    public Persona Menu() {
        Scanner in = new Scanner(System.in);
        Persona pepito = new Persona();
        
        System.out.println("Ingreso de datos de persona.");
        System.out.print("Ingrese DNI   : ");
        pepito.dni = in.nextLine();
        System.out.print("Ingrese Nombre: ");
        pepito.nombre = in.nextLine();
        System.out.print("Ingrese Edad  : ");
        pepito.edad = in.nextInt();
        System.out.print("Ingrese Altura: ");
        pepito.altura = in.nextDouble();
        System.out.print("Ingrese Peso  : ");
        pepito.peso = in.nextDouble();
        
        return pepito;
    }
    
    public static void Imprimir(Persona pepito) {
        System.out.println("El IMC de "+pepito.nombre+" es "+
                pepito.calcularIMC()+".");
        System.out.print("Se clasifica como ");
        pepito.clasificar();
        
    }
    
}
