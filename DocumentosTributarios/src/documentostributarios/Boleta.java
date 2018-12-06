package documentostributarios;
import java.util.*;

public class Boleta extends Transaccion{
    
    public void imprimir() {
        System.out.println("***BOLETA***");
        System.out.println(this.getRazonSocial());
        System.out.println("RUT: "+this.getRUT());
        System.out.println(this.getActividad());
        System.out.println(this.getDomicilio());
        System.out.println("Boleta N°: "+this.getNumeracion());
        System.out.println("************");
        System.out.println("Total = $"+this.getTotal());
        System.out.println("************");
        System.out.println(this.getFecha());
    }
    
    public void ingresarDatos() {
        Scanner in = new Scanner(System.in);
        System.out.println("*** Ingrese datos de Boleta ***");
        System.out.println("Razon social: ");
        this.setRazonSocial(in.nextLine());
        System.out.println("RUT: ");
        this.setRUT(in.nextLine());
        System.out.println("Actividad: ");
        this.setActividad(in.nextLine());
        System.out.println("Domicilio: ");
        this.setDomicilio(in.nextLine());
        System.out.println("N° Boleta: ");
        this.setNumeracion(in.nextInt());
        System.out.println("Total: ");
        this.setTotal(in.nextInt());
        in.nextLine();
        System.out.println("Fecha: ");
        this.setFecha(in.nextLine());
    }

}
