package hospital; 

import java.util.*;

public class Hospital {

    public static void main(String[] args) {
        Paciente pac = new Paciente();
//        Especialista espe = new Especialista();
//        espe.verMenu();

        ArrayList<Hora> agenda = new ArrayList<Hora>();
        pac.verMenu(agenda);
        
    }
    
}
