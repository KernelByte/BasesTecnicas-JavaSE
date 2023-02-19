public class Sentencias {
    public static void main(String[] args) {
        int a = 2;
        int b = 2; // Nivel de alcance alto

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

        // Sentencia Switch
        switch (resultado){
            case 2:
                System.out.println("El resultado es dos");
                break;
            case 3:
                System.out.println("El resultado es tres");
                break;
            case 4:
                System.out.println("El resultado es cuatro");
                break;
            case 5:
                System.out.println("El resultado es cinco");
                break;
            default:
                System.out.println("Ningun valor fue correcto en el Switch");
                break;
        }

        // Sentencia While
        int contador = 0;
        while (resultado == 4){
            contador++;
            if (contador==7){
                resultado++;
                System.out.println("Fin de la ejecucion while en: "+resultado+" y while se ejecuto: "+contador+" veces");
            }
        }

        /* Sentencia do while
        do {

            //Instrucciones
        }while (condicion);
        */
    }
}
