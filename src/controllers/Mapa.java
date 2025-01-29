package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
        hashMap();
        LinkedHashMapa();
        TreeMapa();
    }

    public void hashMap() {
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);

        // containskey
        System.out.println("Hay pera "+ mapa.containsKey("Pera"));
        System.out.println("Hay kiwi "+ mapa.containsKey("kiwi"));

        // Obtener valor 
        System.out.println("Valor de pera "+mapa.get("Pera"));

        // Eliminar item 
        mapa.remove("Pera");
        System.out.println(mapa);

    }

    public void LinkedHashMapa() {
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("LinkedhashMap: " + mapa);

        // containsKey
        System.out.println("Hay pera " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi " + mapa.containsKey("kiwi"));

        // Obtener valor 
        System.out.println("Valor de pera " + mapa.get("Pera"));

        // Eliminar item 
        mapa.remove("Pera");
        System.out.println("Después de eliminar Pera: " + mapa);
    }

    public void TreeMapa() {
        TreeMap<String, Integer> mapa = new TreeMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("TreeMap: " + mapa);

        // containsKey
        System.out.println("Hay pera " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi " + mapa.containsKey("kiwi"));

        // Obtener valor 
        System.out.println("Valor de pera " + mapa.get("Pera"));

        // Eliminar item 
        mapa.remove("Pera");
        System.out.println("Después de eliminar Pera: " + mapa);
    }
}
