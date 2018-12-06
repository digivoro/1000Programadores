package password;

public class Password {
    
    private int longitud;
    private String contrasena;
    
    /**
     * Constructor por defecto
     */
    public Password() {
        this.longitud = 8;
    }
    
    /**
     * Constructor por longitud, genera contraseña con esa longitud
     * @param longitud largo de contraseña
     */
    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasena = generaPassword(longitud);
    }
    
    /**
     * Devuelve true si es fuerte. 
     * Para que sea fuerte debe tener mas de 2 mayúsculas, 
     * mas de 1 minúscula y mas de 5 números.
     */
    public boolean esFuerte() {
        int cuentanumeros=0;
        int cuentaminusculas=0;
        int cuentamayusculas=0;
        
        //Vamos caracter a caracter y comprobamos que tipo de caracter es
        for (int i=0;i<this.contrasena.length();i++) {
            if (this.contrasena.charAt(i)>=97 
                    && this.contrasena.charAt(i)<=122) {
                cuentaminusculas+=1;
            } else if (this.contrasena.charAt(i)>=65 
                    && this.contrasena.charAt(i)<=90) {
                    cuentamayusculas+=1;
            } else {
                cuentanumeros+=1;
            }
        }
            //Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
        if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Genera una contraseña aleatoria para el objeto con la longitud que tenga.
     */
    public static String generaPassword(int longitud) {
        String password="";
        for (int i=0;i<longitud;i++){
            //Generamos un numero aleatorio, segun este elige si añadir una minuscula, mayuscula o numero
            int eleccion=((int)Math.floor(Math.random()*3+1));

            if (eleccion==1){
                /**
                 * Minúsculas:
                 * (char)97 = a
                 * (char)98 = b
                 * (char)99 = c 
                 *  ...
                 * (char)123 =z
                 */
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password+=minusculas;
            } else if (eleccion==2) {
                /**
                 * Mayúsculas:
                 * (char)65 = A
                 *  ...
                 * (char)91 = Z
                 */
                char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                password+=mayusculas;
            } else {
                /**
                 * Dígitos:
                 * (char)48
                 */
                char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                password+=numeros;
            }
        }
        return password;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasena() {
        return contrasena;
    }
    
    
}
