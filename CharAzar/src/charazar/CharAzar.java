package charazar;

public class CharAzar {
    
    public static void main(String[] args) {
        
        charQuewea(1,200);
        
    }
    
    /**
     * Imprime los caracteres del rango [i,j]
     * @param i inicio del rango
     * @param j fin del rango
     */
    public static void charQuewea(int i, int j) {
        for (i = i; i <= j; i++) {
            System.out.println("(char)"+(i)+" = "+(char)(i));
        }
    }
    
    /**
     * Imprime caracteres de letras minúsculas.
     * Desde (char)97 hasta (char)123
     */
    public static void charMinusculas() {
        for (int i = 0; i < 26; i++) {
            System.out.println("(char)"+(i+97)+" = "+(char)(i+97));
        }
    }
    
    /**
     * Imprime caracteres de letras maýusculas. 
     * Desde (char)65 hasta (char)91
     */
    public static void charMayusculas() {
        for (int i = 0; i < 26; i++) {
            System.out.println("(char)"+(i+65)+" = "+(char)(i+65));
        }
    }
    
    /**
     * Imprime caracteres de los 10 dígitos.
     * Desde (char)48 hasta (char)58
     */
    public static void charDigitos() {
        for (int i = 0; i < 10; i++) {
            System.out.println("(char)"+(i+48)+" = "+(char)(i+48));
        }
    }
    
    /**
     * Imprime una letra minúscula al azar
     */
    public static void charRandom() {
        System.out.println( (char)((int)Math.floor(Math.random()*(123-97)+97)) );
    }

}
