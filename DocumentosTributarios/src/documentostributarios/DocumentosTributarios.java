package documentostributarios;

public class DocumentosTributarios {

    public static void main(String[] args) {
        
//        Boleta boleta1 = new Boleta();
        Factura factura1 = new Factura();
        
        factura1.ingresarDatos();
        System.out.println();
        System.out.println();
        factura1.imprimir();
    }

}
