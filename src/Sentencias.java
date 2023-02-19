public class Sentencias {
    public static void main(String[] args) {
        int a = 5;
        int b = 1; // Nivel de alcance alto

        int resultado = a*b;

        // Sentencia condicional
        if (resultado == 5){
            int comodin = 1; // Nivel de alcance bajo
            System.out.println("El resultado es verdadero:"+resultado);
        }
        else {
            System.out.println("El resultado es Falso:"+resultado);
        }
        // Operadores Logicos
        /*
        *  Operador  Nombre  Ejemplo
        *    &&        AND    a && b
        *    ||        OR     a || b
        *    !         NOT     !a
        * */
    }
}
