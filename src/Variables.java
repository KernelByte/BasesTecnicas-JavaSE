public class Variables {
    public static void main(String[] args) {
        // Variable de tipo Numerico entero
        int speed = 0; // Asignacion de valor - 4 Bytes
        // Variable de tipo cadena para un solo valor - 2 Byte
        char variable = 'A';
        // Variable de tipo Cadena
        String salario = "1000000";
        // Variable de tipo numerico decimal pequeño - 4 Bytes
        float medida = 2.98F;
        // Variable de tipo numerico decimal - 8 Bytes
        double altura = 1.75;
        // Variable de tipo condicional - 2 Bytes
        boolean sentencia = true;
        // Variable de tipo constante
        int SUMA = 355;
        // Variable de tipo entero Mayor - 8 Bytes
        long usuarios = 100000000000L;
        // Variable de tipo entero pequeño - 1 Byte
        byte vueltas = 123;

        // Impresion en consola de las anteriores variables
        System.out.println("El valor de las variables es: Speed="+speed+" Salario="+salario);
    }
}

/* Convencion de nombres variables
* - Sensible a mayusculas y minusculas
* - Todas las variables deben comenzar con una letra, $ o "_"
* - Utilizar CamelCase - Upper Camel Case para nombrar CLases y Lower Camel Case para variables, metodos, etc.
* - Las variables constantes se escriben en mayusculas o se concatenan con _
* Puedes usar la variable var a partir de java 10 en adelante para cualquier tipo de dato
* */
