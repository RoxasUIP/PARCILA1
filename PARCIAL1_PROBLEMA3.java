
package parcial1_problema3;
import java.util.Scanner;
public class PARCIAL1_PROBLEMA3 {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
         int a=0,i,b;
         System.out.println("Ingrese numero");
         b=sc.nextInt();
         for(i=1;i<(b+1);i++){
         if(b%i==0){
             a++;
            }
         }
         if(a==2){
              System.out.println("No es Primo");
            }else{
                System.out.println("Si es Primo");
         }
     }
}

