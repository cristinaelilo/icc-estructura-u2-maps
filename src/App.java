import java.util.Arrays;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        //runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();

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
        System.out.println("Ejecutando ejercicios...\n");
    
        // Ejemplo 1: Anagramas
        String str1 = "listen", str2 = "silent";
        boolean result1 = Ejercicios.areAnagrams(str1, str2);
        System.out.println("* Ejemplo 1:");
        System.out.println("* Input: str1 = \"" + str1 + "\", str2 = \"" + str2 + "\"");
        System.out.println("* Output: " + result1);
        System.out.println("* Explicación: Ambas cadenas tienen los mismos caracteres con la misma frecuencia.\n");
    
        // Ejemplo 2: Anagramas
        String str3 = "hello", str4 = "bello";
        boolean result2 = Ejercicios.areAnagrams(str3, str4);
        System.out.println("* Ejemplo 2:");
        System.out.println("* Input: str1 = \"" + str3 + "\", str2 = \"" + str4 + "\"");
        System.out.println("* Output: " + result2);
        System.out.println("* Explicación: Las cadenas tienen diferentes caracteres.\n");
    
        // Ejemplo 3: Anagramas
        String str5 = "triangle", str6 = "integral";
        boolean result3 = Ejercicios.areAnagrams(str5, str6);
        System.out.println("* Ejemplo 3:");
        System.out.println("* Input: str1 = \"" + str5 + "\", str2 = \"" + str6 + "\"");
        System.out.println("* Output: " + result3);
        System.out.println("* Explicación: Ambas cadenas tienen los mismos caracteres con la misma frecuencia.\n");
    
        // Instancia de Ejercicios para usar el método sumatoriaDeDos
        Ejercicios ejercicios = new Ejercicios();
    
        // Ejemplo A: Suma de dos números
        int[] nums1 = {9, 2, 3, 6};
        int objetivo1 = 5;
        int[] resultado1 = ejercicios.sumatoriaDeDos(nums1, objetivo1);
        System.out.println("* Ejemplo A:");
        System.out.println("* Input: nums = " + Arrays.toString(nums1) + ", objetivo = " + objetivo1);
        System.out.println("* Output: " + Arrays.toString(resultado1));
        System.out.println("* Explicación: nums[1] + nums[2] == " + objetivo1 + ", devolvemos [1, 2].\n");
    
        // Ejemplo B: Suma de dos números
        int[] nums2 = {9, 2, 3, 6};
        int objetivo2 = 10;
        int[] resultado2 = ejercicios.sumatoriaDeDos(nums2, objetivo2);
        System.out.println("* Ejemplo B:");
        System.out.println("* Input: nums = " + Arrays.toString(nums2) + ", objetivo = " + objetivo2);
        System.out.println("* Output: " + (resultado2 != null ? Arrays.toString(resultado2) : "null"));
        System.out.println("* Explicación: No hay dos números que sumen " + objetivo2 + ".\n");
    }
}
