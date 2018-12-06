package indicesalud2;

public class Persona {
    
    private String dni;
    private String nombre;
    private int edad;
    private double altura;   //en [m]
    private double peso;     //en [Kg]
    
    Persona(String dni, String nombre, int edad, 
            double altura, double peso){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
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

    /**
     * Getters
     */
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }  
    
    /**
     * Setters
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
