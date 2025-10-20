package asignacion9_recursividad;

import java.util.Arrays;

/**
 *
 * @author elcat
 */
public class Asignacion9_Recursividad {

    public static void main(String[] args) {
        
        Recursividad Ejemplo = new Recursividad();

        System.out.println(Ejemplo.factorial(5));

        System.out.println("Ejemplos Fibonacci");
        System.out.println("Fibonacci N5: " + Ejemplo.fibonacci(5));
        System.out.println("Fibonacci N40: " + Ejemplo.fibonacci(40));
        
        System.out.println("--------------------\nEjemplos maximo comun divisor");
        System.out.println("Mcd: " + Ejemplo.mcd(45,75));
        System.out.println("Mcd: " + Ejemplo.mcd(47,91));
        
        System.out.println("--------------------\nEjemplos Ocurrencias");
        Object[] datos = {1, 2, 3, 3, 2, 3, 1};
        System.out.println("Ocurrencias N3: " + Ejemplo.count(datos, 7, 3));
        System.out.println("Ocurrencias N1: " + Ejemplo.count(datos, 7, 1));
        datos = new Object[]{"A", "B", "C", "B", "A", "B", "D"};
        System.out.println("Ocurrencias C: " + Ejemplo.count(datos, 7, "C"));
        System.out.println("Ocurrencias E: " + Ejemplo.count(datos, 7, "E"));
        
        System.out.println("--------------------\nEjemplos Reversion de arreglo");
        datos = new Object[]{1, 2, 3, 4, 5};
        Ejemplo.reverse(datos, 0, 4);
        System.out.println("Reverse: " + Arrays.toString(datos));
        datos = new Object[]{"A", "B", "C", "D"};
        Ejemplo.reverse(datos, 0, 3);
        System.out.println("Reverse: " + Arrays.toString(datos));
        

        
        
    }
    
}
