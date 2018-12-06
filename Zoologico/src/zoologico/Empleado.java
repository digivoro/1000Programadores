package zoologico;

import java.util.*;

public class Empleado {

    public String nombre;
    protected String direccion;
    protected String telefono;
    protected Date f_ingreso;
    private boolean vigente;

    public Empleado(){

    }

    public static void ingresarDatos() {
        System.out.println("Accediendo a metodo ingresarDatos() en clase Empleado");
        Empleado leyla = new Empleado();
        leyla.nombre = "Leyla";
        leyla.direccion = "Av. Siempre viva 974";
        leyla.vigente = true;
        leyla.telefono = "+56912312312";

        // Invocar funcion mostrar datos
        mostrarDatos(leyla);
    }

    public static void mostrarDatos(Empleado mostrar) {
        System.out.println("Mi nombre es \t"+mostrar.nombre);
        System.out.println("Mi direccion es \t"+mostrar.direccion);
    }
    
    public static boolean verificarHorario(){
        return true;
    }
    public static boolean verificarPago(){
        return false;
    }
    protected static int obtenerRemuneracion(){
        return 2; //Para que compilador no reclame
    }
}