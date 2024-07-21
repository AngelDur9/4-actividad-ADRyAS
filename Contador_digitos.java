import java.util.Scanner;
public class Contador_digitos {
    public static void main(String[] args) {
        int num, contador=0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un número: ");
        num=teclado.nextInt();
        while (num!=0) { 
            contador++;
            num=num/10;
            
        }
        System.out.println("Tu numero tiene: "+contador+" Digitos");
    }
}