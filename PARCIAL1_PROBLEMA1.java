
package parcial1_problema1;
import java.util.Scanner;
public class PARCIAL1_PROBLEMA1 {

    public static void main(String[] args) {
        float Producto, Total;
                Scanner P=new Scanner(System.in);
                System.out.println("Introduzca el valor del producto");
                Producto=P.nextFloat();
                Total=(float) (Producto*0.21+Producto);
                System.out.println("El valor del producto es: "+Total);
        
    }
}
