package wasap;

/**
 *
 * @author Felipe
 */
import java.util.Scanner;
public class Wasap {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese numero");
        numero = leer.nextInt();
        
        if(numero%2==0){
            System.out.println(numero+" es par.");
        } else{
            System.out.println(numero+" es impar.");
        }
        
    }
    
}
