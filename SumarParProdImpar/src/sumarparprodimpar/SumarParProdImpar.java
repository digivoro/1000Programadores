package sumarparprodimpar;
import java.util.Scanner;

public class SumarParProdImpar {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int suma=0,prod=1,n=0,i=1,num,cp=0,ci=0;
        
        System.out.println("Ingrese cantidad de numeros a operar: ");
        n = leer.nextInt();

        while (i<=n) {
            System.out.println("Ingrese el numero "+i+" a operar:");
            num = leer.nextInt();
            if (num%2==0) {
                suma=suma+num;
                cp++;
            } else {
                prod=prod*num;
                ci++;
            }
            i++;
        }
        if (cp!=0) {
            System.out.println("La suma de los pares es: "+suma+".");
        } else {
            System.out.println("No hay pares a sumar.");
        }
        if (ci!=0) {
            System.out.println("El producto de los impares es: "+prod+".");
        } else {
            System.out.println("No hay impares a multiplicar.");
        }

    }
    
}