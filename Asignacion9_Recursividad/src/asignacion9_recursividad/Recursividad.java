package asignacion9_recursividad;

/**
 *
 * @author elcat
 */
public class Recursividad {
    
    public long factorial(int n){
        //caso base
        if (n == 0) return 1;
        //caso recursivo
        return factorial(n-1)*n;
    }
    
    public long fibonacci(int n){
        if (n == 0) return 0;
        if (n == 1) return 0;
        if (n == 2) return 1;
        
        return fibonacci(n-1) + fibonacci(n-2);   
    }
    
    public int mcd(int a, int b){
        if (a%b == 0) return b;
        
        return mcd(b, a%b);
    }
    
    public int count(Object[] datos, int n, Object o){
        if (n == 0) return 0;
        
        int contador = 0;
        if(datos[n-1].equals(o)) {
            contador = 1;
        }
        else {
            contador = 0;
        }
        
        return contador + count(datos, n-1, o);
    }
    
    public void reverse(Object[] datos, int inicio, int fin) {
        if (inicio >= fin) return;
        
        
        Object i = datos[inicio];
        datos[inicio] = datos[fin];
        datos[fin] = i;
        
        reverse(datos, inicio + 1, fin - 1);
    }
}
