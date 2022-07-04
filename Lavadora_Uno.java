package lavadora_uno;
import java.util.Scanner;
import Libreria.LLFunciones3;

public class Lavadora_Uno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("La ropa es blanca o de color?");
        System.out.println("Preciona 1 - Ropa blanca / 2 - Ropa color ");
        int TipoDeRopa = in.nextInt();
        
        System.out.println("Cuantos kilos de ropa? ");
        int kilos = in.nextInt();
        
        LLFunciones3 mensajero = new LLFunciones3(kilos, TipoDeRopa);
        mensajero.setTipoDeRopa(15);
        System.out.println("El tipo de ropa es: " + mensajero.getTipoDeRopa());
        mensajero.CicloFinalizado();
        
    }
} 