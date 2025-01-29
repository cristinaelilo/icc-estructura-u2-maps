package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {

    private Map<Integer, Empleado> empleados;

    public EmpleadoContoller() {
        empleados = new HashMap<>();
    }

    public boolean addEmpleado(Empleado empleado) {
        if (empleados.containsKey(empleado.getId())) {
            return false; // El empleado ya existe
        }
        empleados.put(empleado.getId(), empleado);
        return true;
    }

    public Empleado getEmpleadoById(int id) {
        return empleados.get(id);
    }

    public void displayEmpleados() {
        for(Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()) {
            System.out.println(empleadoEntry.getKey() + " - "+ empleadoEntry.getValue());
        }
    }

    public void displayEmpleadosSoloNombres() {
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado.getName());
        }
    }

    //Sin usar entrySet
    public void displayLlaves() {
        for (Integer key : empleados.keySet()) {
            System.out.println(key);
        }
    }

    //Sin usar entrySet
    public void displayValues() {
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado);
        }
    }
}
