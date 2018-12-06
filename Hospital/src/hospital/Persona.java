package hospital;

import java.util.Date;
import java.util.Scanner;

public class Persona {
    
    public String rut;
    public String nombres;
    public String apellidos;
    public String sexo;
    public String fechaNac;
    public int edad;
    public String direccion;
    public String comuna;
    public String prevision;
    
    public void principal(){
        System.out.println("persona.principal()");
        Persona felipe = new Persona();
        agregarUsuario(felipe);
    }
    
    public void agregarUsuario(Persona usuario){
        usuario = new Persona();
        System.out.println("*** Se esta creando nuevo usuario ***");
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese RUT: ");
        usuario.rut = leer.next();
        System.out.println("Ingrese nombres: ");
        usuario.nombres = leer.next();
        System.out.println("Ingrese apellidos: ");
        usuario.apellidos = leer.next();
        System.out.println("Ingrese sexo: ");
        usuario.sexo = leer.next();
        System.out.println("Ingrese fecha de nacimiento: ");
        usuario.fechaNac = leer.next();
        System.out.println("Ingrese edad: ");
        usuario.edad = leer.nextInt();
        System.out.println("Ingrese direccion: ");
        usuario.direccion = leer.next();
        System.out.println("Ingrese comuna: ");
        usuario.comuna = leer.next();
        System.out.println("Ingrese prevision: ");
        usuario.prevision = leer.next();
        
    }
    
    public void volverMenu(){
        System.out.println("Ingrese 1 para volver o ingrese 2 para salir.");
        Scanner in = new Scanner(System.in);
        byte opcion = in.nextByte();
        switch (opcion) {
            case 1:
                verMenu();
                break;
            case 2:
                System.out.println("Yachao.");
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void verMenu() {
        
    }
}
