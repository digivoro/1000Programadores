package herencia;

public class ProductoFresco extends Producto {
    
    String fechaEnvasado;
    String paisOrigen;

    public ProductoFresco(String fechaCaducidad, int numeroLote, 
            String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    
    @Override
    public void imprimir() {
        System.out.println("PRODUCTO FRESCO");
        System.out.println("Fecha caducidad     : " + this.fechaCaducidad);
        System.out.println("Numero lote         : " + this.numeroLote);
        System.out.println("Fecha de envasado   : " + this.fechaEnvasado);
        System.out.println("País de origen      : " + this.paisOrigen);
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


    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    
}
