import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        //runEjerccios();

        //runLinkedHashMapa();

        //runTreeMapa(); // El tree map termina siendo el diccionario de la vida real, ordena alfabéticamente y en orden ascendente
    }

    private static void runLinkedHashMapa() {
        new Mapa().LinkedHashMapa();
    }

    private static void runTreeMapa() {
        new Mapa().TreeMapa();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller emCtrl = new EmpleadoContoller();
        boolean result = emCtrl.addEmpleado(new Empleado(1, "Cristina", "Estudiante"));
        System.out.println("\nIngreso " + result );
        result = emCtrl.addEmpleado(new Empleado(2, "Denisse", "Estudiante"));
        System.out.println("Ingreso " + result );
        
        // Obtener empleado por ID
        Empleado empleado = emCtrl.getEmpleadoById(1);
        System.out.println("Empleado encontrado: " + empleado);
        
        // Mostrar todos los empleados
        System.out.println("Lista de empleados:");
        emCtrl.displayEmpleados();

        // Mostrar empleados solo por nombres
        System.out.println("Lista de empleados solo por nombres:");
        emCtrl.displayEmpleadosSoloNombres();

        // Mostrar solo las llaves
        System.out.println("Lista de llaves de empleados:");
        emCtrl.displayLlaves();

        // Mostrar solo los valores
        System.out.println("Lista de empleados (valores):");
        emCtrl.displayValues();

    }

    private static void runMapExamlpe() {
        new Mapa();
    }

    private static void runEjerccios() {
    }
}
