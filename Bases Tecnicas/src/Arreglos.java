public class Arreglos {
    public static void main(String[] args) {
        String [] nombreMaestros = new String[7]; // Arreglo de una dimencion
        String [][] ciudades = new String[2][7];  // Arreglo de dos dimenciones
        String [][][] nombres = new String[2][2][7]; // Arreglo de tres dimenciones

        nombreMaestros[0] = "Mateo";
        nombreMaestros[1] = "Luis";
        nombreMaestros[2] = "Mario";
        nombreMaestros[3] = "oscar";
        nombreMaestros[4] = "Juan";
        nombreMaestros[5] = "Ana";
        nombreMaestros[6] = "Marcela";

        for (int i = 0; i < nombreMaestros.length; i++) {
            System.out.println("El maestro #"+i+" Se llama: "+nombreMaestros[i]);
        }
    }
}
