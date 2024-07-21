
import java.util.Scanner;
    public class Factorial {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
    int num, i, respuesta=1;

    System.out.println("Dame el numero a Factorizar: ");
    num=teclado.nextInt();
    
    for(i=num;i>0;i--){
        respuesta=respuesta*i;
    }
    System.out.println("El factorial de "+num+" es: "+respuesta);
    }

}
