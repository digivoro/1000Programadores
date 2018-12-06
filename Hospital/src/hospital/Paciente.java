package hospital;
import java.util.ArrayList;
import java.util.Scanner;

public class Paciente extends Persona {
    
    public String idPaciente;
    public String sintomas;
    public String diagnostico;
    public int derivacion;
    public String alergia;
    public int urgencia; //C1=1 (mas grave) a C5=5 (menos grave)
    protected boolean riesgoVital; //true:Riesgo de muerte; false:Sin riesgo de muerte;
    public String tratamiento;
    
    /**
     * Entrega de opciones al usuario
     */
    public void verMenu(ArrayList<Hora> input) {
        
        System.out.println("Menu de opciones: ");
        System.out.println("1. Agendar hora");
        System.out.println("2. Modificar hora");
        System.out.println("3. Anular hora");
        System.out.println("4. Consultar hora");
        System.out.println("5. Ver datos de mi perfil");
        System.out.println("Ingrese opción deseada y presione Enter");
        Scanner in = new Scanner(System.in);
        byte opcion = in.nextByte();
        
        switch (opcion) {
            case 1:
                agendarHora(input);
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
                consultarHora();
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
     * Metodos invocados por menuReserva():
     * agendarHora(), 
     * modificarHora(), 
     * anularHora(), 
     * consultarHora(), 
     * verPerfil(),
     * volverMenu
     */
    
    public void agendarHora(ArrayList<Hora> input) {
        System.out.println("Estás agendando hora");
        Hora nuevaHora = new Hora();
        nuevaHora.dia = 'l';
        nuevaHora.jornada = 'm';
        input.add(nuevaHora);
    }
    public void modificarHora() {
        System.out.println("Modifiqué una hora!"); 
    }
    public void anularHora() {
       System.out.println("Anulé una hora!");
    }
    public void consultarHora() {
        System.out.println("Consulté una hora!");
    }
    public void verPerfil() {
        System.out.println("Revisé mi perfil!");
    }

}
