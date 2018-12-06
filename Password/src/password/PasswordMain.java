package password;

import java.util.Scanner;

public class PasswordMain {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese cantidad de contraseñas a generar: ");
        int cantidad = in.nextInt();
        Password arrayPass[] = new Password[cantidad]; //ingresar largo de array por teclado
        Boolean arrayFuerte[] = new Boolean[cantidad]; //misma longitud de array que arrayPass
        
        System.out.print("Ingrese longitud de las contraseñas: ");
        int longitud = in.nextInt(); //ingresar por teclado
        
        for (int i = 0; i < cantidad; i++) {
            arrayPass[i] = new Password(longitud);
            arrayFuerte[i] = arrayPass[i].esFuerte();
            System.out.print("La contraseña "+(i+1)+" es: "
                    +arrayPass[i].getContrasena()+". ");
            if (arrayPass[i].esFuerte()==true) {
                System.out.println("Esta contraseña es FUERTE.");
            } else {
                System.out.println("Esta contraseña es DÉBIL");
            }
        }

    }

}
