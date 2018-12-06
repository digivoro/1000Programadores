package documentostributarios;

public class Transaccion {
    
    /**
     * Atributos comunes heredados a Factura y Boleta
     */
    private int numeracion;
    private String razonSocial;
    private String RUT;
    private String domicilio;
    private String actividad;
    private String fecha;
    private double total;
    
    /**
     * Imprime valores de la transaccion
     */
    public void imprimir() {

    }
    
    /**
     * Se ingresan por consola los datos (atributos) de la transaccion
     */
    public void ingresarDatos() {
        
    }

    /*** GETTERS Y SETTERS ***/
    
    public int getNumeracion() {
        return numeracion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getRUT() {
        return RUT;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getActividad() {
        return actividad;
    }

    public String getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setNumeracion(int numeracion) {
        this.numeracion = numeracion;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
