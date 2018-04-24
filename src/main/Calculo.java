package main;

public class Calculo {
    
    private static int memoria = 0;
    protected static int memoriaTemp = 0;
    private static String operador = "";

    public static void setOperador(String operador) {
        Calculo.operador = operador;
    }

    public static int getResultado() {
        
        return memoria;
    }

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
    
    public static void dropOperador() {
        
        operador = "";
    }
    
    public static void dropMemoria() {
        
        memoria = 0;
    }
}
