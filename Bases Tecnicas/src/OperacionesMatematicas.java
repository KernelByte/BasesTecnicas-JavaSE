public class OperacionesMatematicas {

    public static void main(String[] args) {
        double a = 20.5;
        double b = 15;
        // Devuelve un entero hacia arriba
        System.out.println(Math.ceil(a));
        // Devuelve un entero hacia abajo
        System.out.println(Math.floor(a));
        // Devuelve un numero elevado al otro
        System.out.println(Math.pow(a,b));
        // Devuelve el valor mas grande entre dos valores
        System.out.println(Math.max(a,b));
        // Devuelve la raiz cuadrada de un numero
        System.out.println(Math.sqrt(b));
        // Devuelve el area de un circulo
        System.out.println(Math.PI * Math.pow(a,2));

        /* CASTEO DE VARIABLES */
        double suma = 20.7;
        int sumaInt = (int) suma;
        System.out.println("Valor Casteado: "+sumaInt);
    }
}
