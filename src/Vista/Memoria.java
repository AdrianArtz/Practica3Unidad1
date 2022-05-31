package Vista;
import java.util.Scanner;
// @author: Adrian Hernandez & darkangel
//  Codigo Optimizado
public class Memoria {
    private StringBuilder textBuild = new StringBuilder();
    private String salida;

    public Memoria() {
        
        for(int i = 0; i < 200000000; i++) {
            try {
                this.textBuild.append("a");
            } catch (OutOfMemoryError e) {
                System.out.println(e);
                break;
            }
        }
        this.salida = textBuild.toString();
        this.salida = "";
    }

    public String getSalida() {
        return salida;
    }
    
    public static void main(String[] args) {
        Memoria javaHeapTest = new Memoria();
        System.out.println(javaHeapTest.getSalida().length());
        Scanner sc = new Scanner(System.in);
        System.out.println("presione cualquier numero");
        sc.nextInt();
    }
}
