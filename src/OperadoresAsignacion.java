public class OperadoresAsignacion {
    public static void main(String[] args) {
        //Operadores de asignacion
        /*
        * Operador   Aplicacion   Desglose
        *    +=        a += b       a = a + b
        *    -=        a -= b       a = a - b
        *    *=        a *= b       a = a * b
        *    /=        a /= b       a = a / b
        *    %=        a %= b       a = a % b
        *
        * */

        // Operadores
        int vidas = 4;
        vidas = vidas - 1;
        System.out.println("Numero de vidas es: "+vidas);

        vidas--; // Decremento
        System.out.println("Numero de vidas es: "+vidas);

        vidas++; // Incremento
        System.out.println("Numero de vidas es: "+vidas);

        int bonus = 100 + vidas++; // Posfijo
        System.out.println("Numero de bonus es: "+bonus);

        int herramientas = 100 + ++vidas; // Prefijo
        System.out.println("Numero de bonus es: "+herramientas);


    }
}
