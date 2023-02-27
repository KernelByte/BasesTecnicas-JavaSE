public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        // Instancia de una clase parar crear un objeto java
        Doctor doctor = new Doctor();
        doctor.nombre = "Estiven Lopez";
        //doctor.edad = 25; -- Valor inicializado en el metodo constructor del objeto
        doctor.especialidad = "Cirujano";

        //Imprimir datos del objeto
        System.out.println("Los datos del doctor creado son: Nombre="+doctor.nombre+" Edad="+doctor.edad+" Especialidad="+doctor.especialidad);
    }
}
