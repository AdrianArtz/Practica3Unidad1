package Vista;
//Codigo sin modificar
import java.util.Scanner;
/**
 *
 * @author darkangel
 */
public class codigoOriginal {
    public final static int OVERFLOW = 200000000;
    private String salida;
    private int tamanio;
    String tempOOM = "";

    public codigoOriginal(int leng) {
        this.tamanio = leng;
        int i = 0;
        while (i < leng) {
            i++;
            try {         
                this.salida += "a";
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                break;
            }
        }
        this.salida = tempOOM.toString();
    }

    public String getOom() {
        return salida;
    }

    public int getLength() {
        return tamanio;
    }

    public static void main(String[] args) {
        codigoOriginal javaHeapTest = new codigoOriginal(OVERFLOW);
        System.out.println(javaHeapTest.getOom().length());
        Scanner sc = new Scanner(System.in);
        System.out.println("precione cualquier numero");
        sc.nextInt();
    }
}