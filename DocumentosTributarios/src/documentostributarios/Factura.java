package documentostributarios;
import java.util.*;

public class Factura extends Transaccion {
    
    protected String medioPago;
    protected int precioUnitario;
    protected double impuesto;
    
    /**
     * Se invoca calcularImpTotal y luego se imprimen los valores de la factura
     */
    public void imprimir() {
        calcularImpTotal();
        System.out.println("***FACTURA***");
        System.out.println(this.getRazonSocial());
        System.out.println("RUT: "+this.getRUT());
        System.out.println(this.getActividad());
        System.out.println(this.getDomicilio());
        System.out.println("Factura N°: "+this.getNumeracion());
        System.out.println("Precio = $"+this.precioUnitario);
        System.out.println("Impuesto = $"+this.impuesto);
        System.out.println("Total = $"+this.getTotal());
        System.out.println("Medio de Pago " +this.medioPago);
        System.out.println("************");
        System.out.println(this.getFecha());
    }
    
    /**
     * Se calcula el valor del impuesto y el total en base a precioUnitario
     */
    public void calcularImpTotal() {
        double imp= (int) this.precioUnitario*0.19;
        double total = (int) this.precioUnitario+imp;
        this.impuesto = imp;
        this.setTotal(total);
    }
    
    /**
     * Se ingresan los datos (atributos) de la factura
     */
    public void ingresarDatos() {
        Scanner in = new Scanner(System.in);
        System.out.println("*** Ingrese datos de Factura ***");
        System.out.print("Razon social: ");
        this.setRazonSocial(in.nextLine());
        System.out.print("RUT: ");
        this.setRUT(in.nextLine());
        System.out.print("Actividad: ");
        this.setActividad(in.nextLine());
        System.out.print("Domicilio: ");
        this.setDomicilio(in.nextLine());
        System.out.print("N° Factura: ");
        this.setNumeracion(in.nextInt());
        System.out.print("Precio Unitario: ");
        this.precioUnitario=in.nextInt();
        in.nextLine();
        System.out.print("Medio de Pago: ");
        this.medioPago = in.nextLine();
        System.out.print("Fecha: ");
        this.setFecha(in.nextLine());
    }
    
    /*** GETTERS Y SETTERS ***/
    
    public String getMedioPago() {
        return medioPago;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    
    
}