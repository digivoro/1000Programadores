package hospital;

import java.util.Scanner;

public class Especialista extends Persona {
    
    public String especialidad;
    public String turno; //Hora en que atiende
    public String box;  //Sala en que atiende
    public String casaEstudios;
    
    /**
     * 
     */
    public void verMenu() {
        
        System.out.println("Menu de opciones: ");
        System.out.println("1. Consultar agenda");
        System.out.println("2. Modificar hora");
        System.out.println("3. Anular hora");
        System.out.println("4. Consultar horas trabajadas");
        System.out.println("5. Ver datos de mi perfil");
        System.out.println("6. Ver equipo de trabajo");
        System.out.println("Ingrese opción deseada y presione Enter");
        
        Scanner in = new Scanner(System.in);
        byte opcion = in.nextByte();
        
        switch (opcion) {
            case 1:
                consultarAgenda();
                volverMenu();
                break;
            case 2:
                modificarHora();
                volverMenu();
                break;
            case 3:
                anularHora();
                volverMenu();
                break;
            case 4:
                consultarHorasTrabajadas();
                volverMenu();
                break;
            case 5:
                verPerfil();
                volverMenu();
                break;
            default:
                System.out.println("Ingrese opción válida");
                verMenu();
        }
        in.close();
    }
    
    /**
     * Métodos invocados por verMenu():
     * consultarAgenda(), 
     * modificarHora(), 
     * anularHora(), 
     * consultarHorasTrabajadas(), 
     * verPerfil(),
     * volverMenu
     */
    public void consultarAgenda() {
        System.out.println("Las horas que tiene agendadas son:");  
        
    }
    public void modificarHora() {
        System.out.println("Modifiqué una hora!");        
    }
    public void anularHora() {
       System.out.println("Anulé una hora!");
    }
    public void consultarHorasTrabajadas() {
        System.out.println("Consulté una hora!");
    }
    public void verPerfil() {
        System.out.println("Revisé mi perfil!");        
    }
    public void volverMenu() {
        System.out.println("Si desea volver al menu principal ingrese 1.");
        Scanner in = new Scanner(System.in);
        if (in.nextByte()==1) {
            verMenu();
        } else {
            System.out.println("Yachao.");
        }
    }
}
