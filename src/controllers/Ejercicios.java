package controllers;

import java.util.HashMap;
import java.util.Map;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad, sin importar el orden.
     *
     * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma frecuencia.
     *
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
     *
     * Ejemplo 3:
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma frecuencia.
     */
    public static boolean areAnagrams(String str1, String str2) {
        // Si las longitudes son distintas, no pueden ser anagramas
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Usamos un HashMap para contar la frecuencia de cada carácter en str1
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Para cada carácter en str2, decrementamos su frecuencia
        for (char c : str2.toCharArray()) {
            // Si el carácter no existe en el mapa, las cadenas no son anagramas
            if (!charCount.containsKey(c)) {
                return false;
            }
            int count = charCount.get(c);
            if (count == 1) {
                charCount.remove(c);
            } else {
                charCount.put(c, count - 1);
            }
        }

        // Si el mapa está vacío, todas las frecuencias son cero y son anagramas
        return charCount.isEmpty();
    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9, 2, 3, 6], objetivo = 5
     * Output: [1, 2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9, 2, 3, 6], objetivo = 10
     * Output: null
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        
        // Mapa para guardar cada número y su índice
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complemento = objetivo - nums[i];
            // Si encontramos el complemento, retornamos los índices
            if (numToIndex.containsKey(complemento)) {
                return new int[]{numToIndex.get(complemento), i};
            }
            // Si no, guardamos el número actual y su índice
            numToIndex.put(nums[i], i);
        }
        // Si no se encontró ningún par, se retorna null
        return null;
    }
}
