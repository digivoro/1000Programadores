package indicesalud;

public class Persona {
    
    String dni;
    String nombre;
    int edad;
    double altura;   //en [m]
    double peso;     //en [Kg]
    
    Persona(){
        
    }
    
    public double calcularIMC() {
        double imc;
        imc = this.peso/(this.altura*this.altura);
        return imc;
    }
    
    public void verificar() {
        System.out.println("1. DNI      : "+this.dni);
        System.out.println("2. NOMBRE   : "+this.nombre);
        System.out.println("3. EDAD     : "+this.edad);
        System.out.println("4. ALTURA   : "+this.altura);
        System.out.println("5. PESO     : "+this.peso);
    }
    
    public void clasificar() {
        double imc; 
        imc = this.calcularIMC();
        
        if (imc<16) {
            System.out.println("INFRAPESO   : Delgadez severa");
        } else if (imc<17) {
            System.out.println("INFRAPESO   : Delgadez moderada");
        } else if (imc<18.5) {
            System.out.println("INFRAPESO   : Delgadez aceptable");
        } else if (imc<25) {
            System.out.println("Peso normal");
        } else if (imc<30) {
            System.out.println("Sobrepeso");
        } else if (imc<35) {
            System.out.println("OBESO       : Tipo I");
        } else if (imc<40) {
            System.out.println("OBESO       : Tipo II");
        } else { 
            System.out.println("OBESO       : Tipo III");
        }
    }
}
