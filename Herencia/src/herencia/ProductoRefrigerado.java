package herencia;

public class ProductoRefrigerado extends Producto {
    
    String codigoSupervisor;

    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, 
            String codigoSupervisor) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervisor = codigoSupervisor;
    }
    
    @Override
    public void imprimir() {
        System.out.println("PRODUCTO REFRIGERADO");
        System.out.println("Fecha caducidad     : " + this.fechaCaducidad);
        System.out.println("Numero lote         : " + this.numeroLote);
        System.out.println("Código de Supervisor: " + this.codigoSupervisor);
    }
    
    /*** GETTERS Y SETTERS ***/

    public String getCodigoSupervisor() {
        return codigoSupervisor;
    }

    public void setCodigoSupervisor(String codigoSupervisor) {
        this.codigoSupervisor = codigoSupervisor;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
    
    
}
