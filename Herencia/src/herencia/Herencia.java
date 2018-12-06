package herencia;

public class Herencia {
    
    public static void main(String[] args) {
        String fechaCaducidad = "04-12-2018";
        int numeroLote = 123;
        String fechaEnvasado = "04-11-2018";
        String paisOrigen = "Chile";
        String codigoSupervisor = "ABC1";
        int tempCongelacion = 180;

        ProductoFresco leche = new ProductoFresco(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        leche.imprimir();
    }

}
