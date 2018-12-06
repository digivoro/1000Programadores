package herencia;

public class ProductoCongelado extends Producto {

    private int tempCongelacion;

    public ProductoCongelado(String fechaCaducidad, int numeroLote, 
            int tempCongelacion) {
        super(fechaCaducidad, numeroLote);
        this.tempCongelacion = tempCongelacion;
    }
    
    @Override
    public void imprimir() {
        System.out.println("PRODUCTO CONGELADO");
        System.out.println("Fecha caducidad : " + this.fechaCaducidad);
        System.out.println("Numero lote     : " + this.numeroLote);
        System.out.println("Temperatura de congelacion recomendada: "
                + this.tempCongelacion);
    }
    
    /*** GETTERS Y SETTERS ***/
    
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

    public int getTempCongelacion() {
        return tempCongelacion;
    }

    public void setTempCongelacion(int tempCongelacion) {
        this.tempCongelacion = tempCongelacion;
    }
    
    
}
