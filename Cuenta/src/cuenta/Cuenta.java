package cuenta;

public class Cuenta {
    
    /**
     * Atributos de clase
     */
    private String titular;
    private double cantidad;
    
    /**
     * Métodos constructores
     */
    public Cuenta(String titular) {
        this.titular = titular;
    }
    
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    /**
     * Main
     */
    public static void main(String[] args) {
        Cuenta pepito = new Cuenta("Pepito", 5000);
        System.out.println(pepito.cantidad);
        pepito.ingresar(3000);
        pepito.retirar(10000);
        pepito.retirar(8000);
    }
    
    /**
     * Se ingresa una cantidad a la cuenta. 
     * Si la cantidad introducida es negativa, no se hará nada.
     */
    public void ingresar(double cant) {
        System.out.println("*** INGRESO DE DINERO ***");
        if (cant > 0) {
            System.out.println("Se ingresaron $"+cant+" a la cuenta.");
            this.cantidad += cant;
            System.out.println("El nuevo saldo en cuenta de: $"
                    +this.cantidad+".");
        } else {
            return;
        }
    }
    
    /**
     * Se retira una cantidad a la cuenta. 
     * Si restando la cantidad actual a la que nos pasan es negativa,
     * la cantidad de la cuenta pasa a ser 0 
     * {Mod:Con saldo insuficiente no retira}.
     */
    public void retirar(double cant) {
        System.out.println("*** RETIRO DE DINERO ***");
        System.out.println("El saldo actual es de: $"+this.cantidad+".");        
        if (this.cantidad<cant) {
            System.out.println("No hay fondos suficientes para hacer el retiro.");
        } else {
            this.cantidad -= cant;
            System.out.println("El nuevo saldo en cuenta de: $"
                    +this.cantidad+".");
        }
    }
    
    /**
     * Getters y Setters
     */
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

}
