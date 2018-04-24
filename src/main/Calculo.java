package main;

public class Calculo {
    
    private static int memoria = 0;
    protected static int memoriaTemp = 0;
    private static String operador = "";

    // Guarda el operador seleccionado
    
    public static void setOperador(String operador) {
        Calculo.operador = operador;
    }

    // Devuelve el resultado en memoria
    
    public static int getResultado() {
        
        return memoria;
    }
    
    // Concatena el calculo segun el operador seleccionado
    
    public static void Resultado() {
        
        switch(operador) {
            case "+": memoria += memoriaTemp; break;
            case "-": memoria -= memoriaTemp; break;
            case "/": memoria /= memoriaTemp; break;
            case "*": memoria *= memoriaTemp; break;
            default: memoria = memoriaTemp; break;
        }
        
        memoriaTemp = 0;
    }
    
    // Borra el operador de la memoria
    
    public static void dropOperador() {
        
        operador = "";
    }
    
    // Borra el calculo de memoria
    
    public static void dropMemoria() {
        
        memoria = 0;
    }
}
