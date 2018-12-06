
package encapsulamiento;


public class Encapsulamiento {

    private int tipoEncapsulamiento;
    private String nombre;

    public static void main(String[] args) {
        
        System.out.println("Encapsulamiento antes de ser establecido");
        Encapsulamiento variable1 = new Encapsulamiento();

        variable1.setTipoEncapsulamiento(10);
        int a = variable1.getTipoEncapsulamiento();
        System.out.println("El resultado es: "+a);
        
    }
    
    public int getTipoEncapsulamiento(){
        return tipoEncapsulamiento;
    }

    public void setTipoEncapsulamiento(int newTipoEncapsulamiento){
        this.tipoEncapsulamiento = newTipoEncapsulamiento;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }
    
}
